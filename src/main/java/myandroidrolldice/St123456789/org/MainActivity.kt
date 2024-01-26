package myandroidrolldice.St123456789.org

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.Random
import android.widget.TextView
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the button view from layout
        val rol_button : Button = findViewById(R.id.roll_button)
        // ... and attach click listener to it
        rol_button.setOnClickListener {
            rolDice() }

    }
   // click listener to roll button
   private fun rolDice() {
       val randomInt = Random().nextInt(6) + 1
       val resultText: TextView = findViewById(R.id.result_text)
       resultText.text = "Dice: $randomInt"

       val diceImage: ImageView = findViewById(R.id.dice_image)
       val drawableResource = when (randomInt) {
           1 -> R.drawable.dice_1
           2 -> R.drawable.dice_2
           3 -> R.drawable.dice_3
           4 -> R.drawable.dice_4
           5 -> R.drawable.dice_5
           else -> R.drawable.dice_6
       }
       diceImage.setImageResource(drawableResource)
   }
}
