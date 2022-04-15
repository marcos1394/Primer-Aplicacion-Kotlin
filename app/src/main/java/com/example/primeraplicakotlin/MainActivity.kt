package com.example.primeraplicakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLanzar: Button = findViewById(R.id.btnLanzar)

        btnLanzar.setOnClickListener{
                rollDice()
        }
    }

    private fun rollDice(){
        var numero : Int = lanzar(6)
        val txtResult: TextView = findViewById(R.id.txtResultado)
        txtResult.text = numero.toString()
        //Toast.makeText(this, numero.toString(), Toast.LENGTH_LONG).show()

    }

    private fun lanzar(max: Int): Int{
       return (1..max).random()
    }
}