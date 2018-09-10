package com.example.root.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int mNumero;
    private TextView mNumeroTextView;
    private Button mIncrementar;
    private Button mDecrementar;
    private Button mResetarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        mIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementar();
            }
        });

        mDecrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrementar();
            }
        });

        mResetarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetaContador();
            }
        });

    }


    private void incrementar() {
        mNumero++;
        mNumeroTextView.setText(Integer.toString(mNumero));
    }

    private void decrementar() {
        mNumero--;
        mNumeroTextView.setText(Integer.toString(mNumero));
    }

    private void initViews() {
        mIncrementar = findViewById(R.id.mais_button);
        mDecrementar = findViewById(R.id.menos_button);
        mNumeroTextView = findViewById(R.id.numero_tentativas_textview);
        mResetarButton = findViewById(R.id.resetar_button);
    }

    private void resetaContador() {
        mNumeroTextView.setText(R.string.default_tentativas_textview);
        mNumero = 0;
    }


}
