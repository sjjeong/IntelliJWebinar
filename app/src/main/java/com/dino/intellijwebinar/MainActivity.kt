package com.dino.intellijwebinar

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tvFirst: TextView
    private lateinit var tvSecond: TextView
    private lateinit var tvOutput: TextView
    private lateinit var btn0: Button
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btnPlus: Button
    private lateinit var btnMinus: Button
    private lateinit var btnTimes: Button
    private lateinit var btnDiv: Button
    private lateinit var btnRem: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListener()
    }

    private fun setupView() {
        tvFirst = findViewById(R.id.tv_first)
        tvSecond = findViewById(R.id.tv_second)
        tvOutput = findViewById(R.id.tv_output)
        btn0 = findViewById(R.id.btn_0)
        btn1 = findViewById(R.id.btn_1)
        btn2 = findViewById(R.id.btn_2)
        btn3 = findViewById(R.id.btn_3)
        btn4 = findViewById(R.id.btn_4)
        btn5 = findViewById(R.id.btn_5)
        btn6 = findViewById(R.id.btn_6)
        btn7 = findViewById(R.id.btn_7)
        btn8 = findViewById(R.id.btn_8)
        btn9 = findViewById(R.id.btn_9)
        btnPlus = findViewById(R.id.btn_plus)
        btnMinus = findViewById(R.id.btn_minus)
        btnTimes = findViewById(R.id.btn_times)
        btnDiv = findViewById(R.id.btn_div)
        btnRem = findViewById(R.id.btn_rem)
    }

    private fun setupListener() {
        btn0.setOnClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnPlus.setOnClickListener(this)
        btnMinus.setOnClickListener(this)
        btnTimes.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
        btnRem.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        v ?: return
        when (v.id) {
            R.id.btn_0 -> addNumber(0)
            R.id.btn_1 -> addNumber(1)
            R.id.btn_2 -> addNumber(2)
            R.id.btn_3 -> addNumber(3)
            R.id.btn_4 -> addNumber(4)
            R.id.btn_5 -> addNumber(5)
            R.id.btn_6 -> addNumber(6)
            R.id.btn_7 -> addNumber(7)
            R.id.btn_8 -> addNumber(8)
            R.id.btn_9 -> addNumber(9)
            R.id.btn_plus -> operating("+")
            R.id.btn_minus -> operating("-")
            R.id.btn_times -> operating("*")
            R.id.btn_div -> operating("/")
            R.id.btn_rem -> operating("%")
        }
    }

    private fun addNumber(number: Int) {
        val numberString = number.toString()
        if (tvFirst.text.isEmpty()) {
            tvFirst.text = numberString
        } else if (tvSecond.text.isEmpty()) {
            tvSecond.text = numberString
        }
    }

    private fun operating(operator: String) {
        if (tvFirst.text.isEmpty() || tvSecond.text.isEmpty()) {
            return
        }

        val firstNum = tvFirst.text.toString().toInt()
        val secondNum = tvSecond.text.toString().toInt()

        val result = when (operator) {
            "+" -> {
                firstNum + secondNum
            }
            "-" -> {
                firstNum - secondNum
            }
            "*" -> {
                firstNum * secondNum
            }
            "/" -> {
                firstNum / secondNum
            }
            "%" -> {
                firstNum % secondNum
            }
            else -> error("")
        }
        tvOutput.text = result.toString()
    }

}
