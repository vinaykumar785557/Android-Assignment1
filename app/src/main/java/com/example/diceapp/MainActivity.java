package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView mdicecomputer,mdiceuser;
    Button mlowerbutton,mhigherbutton;
    TextView mgameresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        mdicecomputer=findViewById(R.id.dicecomputer);
        mdiceuser=findViewById(R.id.diceuser);
        mlowerbutton=findViewById(R.id.lowerbutton);
        mhigherbutton=findViewById(R.id.higherbutton);
        mgameresult=findViewById(R.id.gameresult);

        final int[] diceArray={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

       mlowerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();

                int number= randomNumberGenerator.nextInt(6);

                mdicecomputer.setImageResource(diceArray[number]);

                int number2=randomNumberGenerator.nextInt(6);

                mdiceuser.setImageResource(diceArray[number2]);

                if(number2<number)
                {
                    mgameresult.setText("User Won !");
                }
                else if(number2>number)
                {
                    mgameresult.setText("Computer Won !");
                }
                else
                {
                    mgameresult.setText("Tie");
                }

            }
        });

       mhigherbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Random randomNumberGenerator = new Random();

               int number= randomNumberGenerator.nextInt(6);

               mdicecomputer.setImageResource(diceArray[number]);

               int number2=randomNumberGenerator.nextInt(6);

               mdiceuser.setImageResource(diceArray[number2]);

               if(number2>number)
               {
                   mgameresult.setText("User Won !");
               }
               else if(number2<number)
               {
                   mgameresult.setText("Computer Won !");
               }
               else
               {
                   mgameresult.setText("Tie");
               }

           }
       });




    }
}