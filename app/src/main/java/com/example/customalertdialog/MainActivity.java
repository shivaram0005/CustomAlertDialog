package com.example.customalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1=(TextView)findViewById(R.id.tv1);
        TextView tv2=(TextView)findViewById(R.id.tv1);
        TextView tv3=(TextView)findViewById(R.id.tv1);
        Button b1=(Button)findViewById(R.id.b1);
        Button b2=(Button)findViewById(R.id.b2);
        Button b3=(Button)findViewById(R.id.b3);;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("ShivaRam");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText("2020");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater layoutInflater=getLayoutInflater();
                View v=layoutInflater.inflate(R.layout.customalertdialog,(ViewGroup)findViewById(R.id.c));
               final EditText et1=(EditText)v.findViewById(R.id.et1);
               final EditText et2=(EditText)v.findViewById(R.id.et2);
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("LoginHere");
                builder.setView(v);

                    builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            try {
                            String username = et1.getText().toString();
                            String password = et2.getText().toString();

                                if (username.equals("Ashu") && password.equals("0000")) {
                                    tv3.setText("5000");
                                } else {
                                    tv3.setText("2");
                                }
                            }
                            catch (Exception e){}
                        }
                    });

                builder.setNegativeButton("Cancel",null);
                AlertDialog alertDialog=builder.create();
                alertDialog.show();

            }
        });
    }
}