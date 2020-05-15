package com.example.t5_a3_bazangarduomiguelangel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText cajaMantisa;
    public double n1,n2, res;
    int op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaMantisa = (EditText) findViewById(R.id.caja_mantisa);
    }
    public void btn1(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"1";
        cajaMantisa.setText(cap);
    }
    public void btn2(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"2";
        cajaMantisa.setText(cap);
    }
    public void btn3(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"3";
        cajaMantisa.setText(cap);
    }
    public void btn4(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"4";
        cajaMantisa.setText(cap);
    }
    public void btn5(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"5";
        cajaMantisa.setText(cap);
    }
    public void btn6(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"6";
        cajaMantisa.setText(cap);
    }
    public void btn7(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"7";
        cajaMantisa.setText(cap);
    }
    public void btn8(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"8";
        cajaMantisa.setText(cap);
    }
    public void btn9(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"9";
        cajaMantisa.setText(cap);
    }
    public void btn0(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+"0";
        cajaMantisa.setText(cap);
    }

    public void btnpun(View v){
        String cap= cajaMantisa.getText().toString();
        cap= cap+".";
        cajaMantisa.setText(cap);
    }

    public void suma(View v){
        String oca= cajaMantisa.getText().toString();
        n1= Double.parseDouble(oca);
        cajaMantisa.setText("");
        op=1;
    }
    public void resta(View v){
        String oca= cajaMantisa.getText().toString();
        n1= Double.parseDouble(oca);
        cajaMantisa.setText("");
        op=2;
    }
    public void multiplicacion(View v){
        String oca= cajaMantisa.getText().toString();
        n1= Double.parseDouble(oca);
        cajaMantisa.setText("");
        op=3;
    }
    public void division(View v){
        String oca= cajaMantisa.getText().toString();
        n1= Double.parseDouble(oca);
        cajaMantisa.setText("");
        op=4;
    }
    public void potencia(View v){
        String oca= cajaMantisa.getText().toString();
        n1= Double.parseDouble(oca);
        cajaMantisa.setText("");
        op=5;
    }
    public void porcentaje(View v){
        String oca= cajaMantisa.getText().toString();
        n1= Double.parseDouble(oca);
        cajaMantisa.setText("");
        op=6;
    }
    public void raiz(View v){
        String oca= cajaMantisa.getText().toString();
        n1= Double.parseDouble(oca);
        cajaMantisa.setText("");
        op=7;
    }
    public void igual(View v){
        String oca2= cajaMantisa.getText().toString();
        n2= Double.parseDouble(oca2);
        cajaMantisa.setText("");

        if(op==1){
            res=n1+n2;
        }else if(op==2){
            res=n1-n2;
        }else if (op==3){
            res=n1*n2;
        }else if (op==4){
            res=n1/n2;
        }else if (op==5){
            res= Math.pow(n1,n2);
        }else if (op==6){
            res= n2*(n1/100);
        }else if (op==7){
            res= Math.sqrt(n1);
        }
        cajaMantisa.setText(""+res);
        n1=res;
    }
    public void borrar(View v){
        cajaMantisa.setText("");
    }





}
