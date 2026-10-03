package com.example.learningcontractapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scrollView = ScrollView(this).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )

            setBackgroundColor(Color.WHITE)
        }

        // Main Layout
        val mainLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL

            setPadding(
                dp(24),
                dp(30),
                dp(24),
                dp(30)
            )

            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }

        // TITLE
        val title = TextView(this).apply {
            text = "LEARNING CONTRACT"
            textSize = 28f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
            setTypeface(null, Typeface.BOLD)

            setPadding(
                0,
                0,
                0,
                dp(25)
            )
        }

        mainLayout.addView(title)


        addSectionTitle(
            mainLayout,
            "What are your expectations?"
        )

        addSectionContent(
            mainLayout,
            """
            • Learn more about the subject.
            • Improve my knowledge and skills.
            • Understand the lessons clearly.
            • Participate in class activities.
            • Complete all course requirements.
            """.trimIndent()
        )


        addSectionTitle(
            mainLayout,
            "What motivates you?"
        )

        addSectionContent(
            mainLayout,
            """
            • Family.
            • Future career.
            • Learning new things.
            • Reaching my goals.
            • Improving myself.
            """.trimIndent()
        )


        addSectionTitle(
            mainLayout,
            "What can you contribute in class and in the course?"
        )

        addSectionContent(
            mainLayout,
            """
            • Participate in class discussions.
            • Help my classmates when needed.
            • Cooperate during group activities.
            • Submit my activities on time.
            • Respect my classmates and instructor.
            """.trimIndent()
        )


        addSectionTitle(
            mainLayout,
            "What are the hindrances that affect you in achieving your objectives?"
        )

        addSectionContent(
            mainLayout,
            """
            • Poor time management.
            • Difficult lessons.
            • Internet connection problems.
            • Lack of focus.
            • Heavy school workload.
            """.trimIndent()
        )


        val signerTitle = TextView(this).apply {
            text = "SIGNERS"
            textSize = 20f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
            setTypeface(null, Typeface.BOLD)

            setPadding(
                0,
                dp(10),
                0,
                dp(15)
            )
        }

        mainLayout.addView(signerTitle)

        val signers = TextView(this).apply {

            text = """
                CADIONGAN, DONNI
                CASTANEDA, BENEDICT NIEL
                DALASEN, CARL VINCENT
                PALBUZA, KURTH EDISON
                PASION, AERIZ JOSHUA
            """.trimIndent()

            textSize = 16f

            setTextColor(
                Color.DKGRAY
            )

            gravity = Gravity.CENTER

            setLineSpacing(
                dp(6).toFloat(),
                1f
            )

            setPadding(
                0,
                0,
                0,
                dp(30)
            )
        }

        mainLayout.addView(signers)

        scrollView.addView(mainLayout)

        setContentView(scrollView)
    }


    private fun addSectionTitle(
        layout: LinearLayout,
        title: String
    ) {

        val titleView = TextView(this).apply {

            text = title

            textSize = 20f

            setTextColor(
                Color.BLACK
            )

            setTypeface(
                null,
                Typeface.BOLD
            )

            setPadding(
                0,
                dp(10),
                0,
                dp(8)
            )
        }

        layout.addView(titleView)
    }


    private fun addSectionContent(
        layout: LinearLayout,
        content: String
    ) {

        val contentView = TextView(this).apply {

            text = content

            textSize = 16f

            setTextColor(
                Color.DKGRAY
            )

            setLineSpacing(
                dp(5).toFloat(),
                1f
            )

            setPadding(
                0,
                0,
                0,
                dp(20)
            )
        }

        layout.addView(contentView)
    }

    private fun dp(value: Int): Int {

        return (
                value *
                        resources.displayMetrics.density
                ).toInt()
    }
}