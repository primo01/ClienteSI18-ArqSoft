package br.usjt.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/**
 *  @author Aluno Gabriel Ferreira Primo - USJT
 */
public class MainActivity extends Activity {

    private EditText txtNome;
    public static final String NOME = "br.usjt.progmulti.clientesi18.nome";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = findViewById(R.id.busca_nome_cliente);
    }

    public void buscarClientes(View view) {
        String nome = txtNome.getText().toString();
        Intent intent = new Intent (this, ListaClientesActivity.class);
        intent.putExtra(NOME, nome);
        startActivity(intent);
    }
}
