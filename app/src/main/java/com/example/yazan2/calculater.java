package com.example.yazan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);


        //inflate
        EditText num1=findViewById(R.id.num1);
        EditText num2=findViewById(R.id.num2);
        TextView show =findViewById(R.id.text_view);
        Button bt_sum=findViewById(R.id.sum_the_num);

        bt_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String num11 =num1.getText().toString();
                 String num22=num2.getText().toString();
                 int num_1 =Integer.parseInt(num11);
                 int num_2 =Integer.parseInt(num22);
                 int result=num_1+num_2;
                 show.setText("result="+result);



            }
        });



    }
}