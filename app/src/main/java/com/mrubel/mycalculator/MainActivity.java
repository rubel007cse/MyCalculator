package com.mrubel.mycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView _output;
    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0, _eq, _mi,_pl,_mu,_di,_cancel, _erase;
    ArrayList<String> my_list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);


        // settting id to java variable
        n0 = (Button) findViewById(R.id.num0);
        n1 = (Button) findViewById(R.id.num1);
        n2 = (Button) findViewById(R.id.num2);
        n3 = (Button) findViewById(R.id.num3);
        n4 = (Button) findViewById(R.id.num4);
        n5 = (Button) findViewById(R.id.num5);
        n6 = (Button) findViewById(R.id.num6);
        n7 = (Button) findViewById(R.id.num7);
        n8 = (Button) findViewById(R.id.num8);
        n9 = (Button) findViewById(R.id.num9);

        _pl = (Button) findViewById(R.id.mrplus);
        _mi = (Button) findViewById(R.id.mrminus);
        _mu = (Button) findViewById(R.id.mrmultiplication);
        _di = (Button) findViewById(R.id.mrdivide);

        _eq = (Button) findViewById(R.id.mrequal);
        _cancel = (Button) findViewById(R.id.mrcancel);
        _output = (TextView) findViewById(R.id.omg_output);


        // getting values from XML
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("1");

            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("9");

            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("0");

            }
        });


        // adding
        _pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("+");
            }
        });
        _mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("-");
            }
        });

        _mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("*");
            }
        });

        _di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.add("/");
            }
        });

        _cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_list.clear();
                _output.setText("");
            }
        });

        // when equalto pressed
        _eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(!my_list.isEmpty()){
                    for(int i=0; i < my_list.size(); i++){
                        switch (my_list.get(i).charAt(i)){
                            case '*' :

                                break;
                        }
                    }
                }
            }
        });


    }


}
