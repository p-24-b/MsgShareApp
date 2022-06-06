package com.example.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showButton = findViewById<Button>(R.id.showToast)
        showButton.setOnClickListener()
        {
            Log.i("MainActivity", "Button has been clicked")
            Toast.makeText(this,"Button has been clicked",Toast.LENGTH_SHORT).show()
        }
    }
}