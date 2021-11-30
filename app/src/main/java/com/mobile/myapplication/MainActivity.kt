package com.mobile.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private const val NEW_TEXT = "text"

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        NEW_TEXT
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        if (this::button.isInitialized) {
            button.text = getTextForButton()
            button.setTextB1()
        }

        if (textView != null) {
            textView?.setText(R.string.app_name)
        }
        textView?.setText(R.string.text)
        textView?.text = "qweqwesd"
    }
}

class NewClass() {
    fun newfun() {
        NEW_TEXT
    }
}