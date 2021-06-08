package com.jsstech.displayimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var img: ImageView?=null
    private var img1: ImageView?=null
    private var img3: ImageView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



         img=findViewById(R.id.bt_img)
        img1=findViewById(R.id.btimage)
        img3=findViewById(R.id.imageView3)

        img?.setOnClickListener {
            Toast.makeText(this,"image view1",Toast.LENGTH_LONG).show()
        }

        img1?.setOnClickListener {
        Toast.makeText(this,"image view2",Toast.LENGTH_LONG).show()
    }

     img3?.setOnClickListener {
         Toast.makeText(this,"image view3",Toast.LENGTH_LONG).show()
     }

    }
}