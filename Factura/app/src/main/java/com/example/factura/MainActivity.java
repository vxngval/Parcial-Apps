package com.example.factura;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private Button gomans;
    private Button gonars;
    private Button gouvas;
    private Button gobans;
    private Button gopers;

    private TextView cantidades;


    private EditText cantimanzanas;
    private EditText cantinaranjas;
    private EditText cantiuvas;
    private EditText cantibananas;
    private EditText cantiperas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidades = findViewById(R.id.cantidad);

        cantimanzanas = findViewById(R.id.cantimanzana);
        cantinaranjas = findViewById(R.id.cantinaranja);
        cantiuvas = findViewById(R.id.cantiuva);
        cantibananas = findViewById(R.id.cantiuva);
        cantiperas = findViewById(R.id.cantipera);

        gomans = findViewById(R.id.goman);
        gomans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidades.setText(String.valueOf(cantiman(
                        Integer.parseInt(cantimanzanas.getText().toString()),
                        Integer.parseInt(cantimanzanas.getText().toString()))));
            }
        });

        gonars = findViewById(R.id.gonar);
        gonars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidades.setText(String.valueOf(cantinar(
                        Integer.parseInt(cantinaranjas.getText().toString()),
                        Integer.parseInt(cantinaranjas.getText().toString()))));
            }
        });

        gouvas = findViewById(R.id.gouva);
        gouvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidades.setText(String.valueOf(cantiuv(
                        Integer.parseInt(cantiuvas.getText().toString()),
                        Integer.parseInt(cantiuvas.getText().toString()))));
            }
        });

        gobans = findViewById(R.id.goban);
        gobans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidades.setText(String.valueOf(cantiban(
                        Integer.parseInt(cantibananas.getText().toString()),
                        Integer.parseInt(cantibananas.getText().toString()))));
            }
        });

        gopers = findViewById(R.id.goper);
        gopers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidades.setText(String.valueOf(cantiper(
                        Integer.parseInt(cantiperas.getText().toString()),
                        Integer.parseInt(cantiperas.getText().toString()))));
            }
        });
    }
    public double cantiman(int a) {
        return 1500 * a;
    }

    public double cantinar(int a) {
        return 1700 * a;
    }

    public double cantiuv(int a) {
        return 2000 * a;
    }

    public double cantiban(int a) {
        return 2500 * a;
    }

    public double cantiper(int a) {
        return 2700 * a;
    }
}