package com.example.mad_practical_2_22172012017

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("oncreate method called")


    var TAG = "MainActivity"
    fun showMessage(message:String)
    {
        Log.i(TAG,  message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
overr
}