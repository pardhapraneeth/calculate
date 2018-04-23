package praneeth.com.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button clear,equals;
    EditText mText;
    String operator;
    int flag=0;
    float num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear=(Button)findViewById(R.id.delete);
        equals=(Button)findViewById(R.id.equal123);
        mText=(EditText)findViewById(R.id.editText);
        mText.setText("");

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mText.setText("");
                flag=0;
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (operator){
                    case "+":
                        mText.setText("" + (num1+num2));
                        break;
                    case "-":
                        mText.setText("" + (num1-num2));
                        break;
                    case "/":
                        mText.setText("" + (num1/num2));
                        break;
                    case "*":
                        mText.setText("" + (num1*num2));
                        break;
                }
            }
        });
    }

    public void click(View view){

        switch (view.getId()){

            case R.id.button1:
                mText.setText(mText.getText().toString()+ '1');
                break;
            case R.id.button2:
                mText.setText(mText.getText().toString()+ '2');
                break;
            case R.id.button3:
                mText.setText(mText.getText().toString()+ '3');
                break;
            case R.id.button4:
                mText.setText(mText.getText().toString()+ '4');
                break;
            case R.id.button5:
                mText.setText(mText.getText().toString()+ '5');
                break;
            case R.id.button6:
                mText.setText(mText.getText().toString()+ '6');
                break;
            case R.id.button7:
                mText.setText(mText.getText().toString()+ '7');
                break;
            case R.id.button8:
                mText.setText(mText.getText().toString()+ '8');
                break;
            case R.id.button9:
                mText.setText(mText.getText().toString()+ '9');
                break;
            case R.id.buttonz:
                mText.setText(mText.getText().toString()+ '0');
                break;

            case R.id.buttonadd:
                mText.setText(mText.getText().toString()+ " + ");
                flag++;
                operator = "+";
                break;
            case R.id.buttonsub:
                mText.setText(mText.getText().toString()+ " - ");
                flag++;
                operator = "-";
                break;
            case R.id.buttondiv:
                mText.setText(mText.getText().toString()+ " / ");
                flag++;
                operator = "/";
                break;
            case R.id.buttonmul:
                mText.setText(mText.getText().toString()+ " * ");
                flag++;
                operator = "*";
                break;

        }

        if(flag==1){
            String text1=mText.getText().toString();
            String[] s=text1.split(" ");
            num1=Integer.parseInt(s[0]);
            flag++;
        }
        else if(flag==2){
            String text1=mText.getText().toString();
            String[] s=text1.split(" ");
            num2=Integer.parseInt(s[s.length-1]);

        }



    }
}
