package com.example.androidkotlincoroutinesdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlobalScope.launch(Dispatchers.Default) {
            delay(5000L)
            Log.d("TEST_LOG","Hello from coroutine after 5 seconds delay")
        }

        Log.d("TEST_LOG","Hello from Main Thread")

    }

}