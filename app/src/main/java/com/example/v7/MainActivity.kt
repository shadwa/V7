package com.example.v7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView

private const val TAG="MainActivity"
private const val MY_TAG="MyOwnLog"
private const val VALUE="Value"
private lateinit var myButton:Button

class MainActivity : AppCompatActivity() {
   var number:Int=0
   val verse  = arrayOf(
        "Ты видел деву на скале",
        "В одежде белой над волнами",
        "Когда, бушуя в бурной мгле,",
        "Играло море с берегами,",
        "Когда луч молний озарял",
        "Ее всечасно блеском алым",
        "И ветер бился и летал",
        "С ее летучим покрывалом?",
        "Прекрасно море в бурной мгле",
        "И небо в блесках без лазури;",
        "Но верь мне: дева на скале",
        "Прекрасней волн, небес и бури."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton=findViewById(R.id.my_Button)
        myButton.setOnClickListener{task()}
    //    Log.d(MY_TAG, "onCreate")
        println("onCreate")
    }
    fun task () {
        val oneString: TextView = findViewById(R.id.one_String)
        oneString.text= verse[number]
     //   oneString.text= number.toString()
        if(number<12) {
           number++
        }
        else {
            finishAffinity()
        }
     //   Log.d(MY_TAG, number.toString())
        println(number.toString())
    }

    override fun onStart() {
        super.onStart()
        number=0
     //   Log.d(MY_TAG,"onStart")
        println("onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_TAG,"onResume")
        task()
    }

    override fun onPause() {
        super.onPause()
     //   Log.d(MY_TAG,"onPause")
        println("onPause")
    }

    override fun onRestart() {
        super.onRestart()
     //   Log.d(MY_TAG,"onRestart")
        println("onRestart")
    }

    override fun onStop() {
        super.onStop()
        number=0
     //   Log.d(MY_TAG,"onStop")
        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
     //   Log.d(MY_TAG,"onDestroy")
        println("onDestroy")
    }

}


