package com.example.module1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myData: KTfile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myData = ViewModelProviders.of(this).get(KTfile::class.java)
        display()

        btnClick.setOnClickListener(){
            myData.count++
            display()
        }

    }
    fun display(){
        textView.text = myData.count.toString()
    }

}
