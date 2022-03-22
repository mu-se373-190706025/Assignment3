package com.meliskara.assignment_3

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Finding the id's of variables in activity main
    }

    fun changeImage(view: View) {
        //Finding the id of variable (image)
        val photo = findViewById<ImageView>(R.id.imageView)
        //Change the image to other one
        photo.setImageResource(R.drawable.photo2)
    }

    //If checkbox is selected user can be click to button
    //Else result will be reset and counter will not increase
    fun changeButton(view: View) {
        val box = findViewById<CheckBox>(R.id.checkBox)
        val result = findViewById<TextView>(R.id.textView)
        if (box.isChecked) {
            counter++
            result.setText(counter.toString())
        } else {
            counter = 0
            result.setText(counter.toString())
        }
    }
}