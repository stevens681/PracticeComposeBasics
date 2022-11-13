package com.example.practicecomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecomposebasics.ui.theme.PracticeComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PracticeGreetingWithImage(
                        title = "Jetpack Compose tutorial",
                        textOne = "",
                        textTwo = ""
                    )
                }
            }
        }
    }
}
@Composable
fun PracticeGreetingWithImage(title: String, textOne: String, textTwo: String){
    val image = painterResource(id = R.drawable.bg_compose_background)

    Column(){
        Image(
            painter = image, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()

        )
        PracticeGreetingWithText(title = title, textOne = textOne, textTwo = textTwo)
    }

}


@Composable
fun PracticeGreetingWithText(title: String, textOne: String, textTwo: String) {

    Column() {
        Text(text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp),

        )
        Text(text = textOne,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(text = textTwo,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PracticeGreetingWithImagePreview() {
    PracticeComposeBasicsTheme {
        PracticeGreetingWithImage(title = stringResource(R.string.Tittle_text),
            textOne = stringResource(R.string.text_one),
            textTwo = stringResource(R.string.text_two)
        )

    }
}