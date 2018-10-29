package kr.co.woobi.imyeon.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        Bundle bundle=getIntent().getExtras();
        TextView textViewSingleName=(TextView)findViewById(R.id.textViewSingleName);
        textViewSingleName.setText(bundle.getString("SingleName","No Data"));
    }
}
