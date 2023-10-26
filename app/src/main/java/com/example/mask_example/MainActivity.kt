package com.example.mask_example

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mask_example.databinding.ActivityMainBinding

private lateinit var bindid: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindid = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindid.root)

        bindid.btnPhoneNumber.setOnClickListener {
            val isDone = bindid.editTelephone.isDone
            if (isDone){
                val phoneNum = bindid.editTelephone.unMasked
                Log.i("INFO", "onCreate: $phoneNum")
                Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Fill in the field", Toast.LENGTH_SHORT).show()
            }
        }
    }
}