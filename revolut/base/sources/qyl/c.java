package qyl;

import android.text.Editable;
import android.widget.EditText;
import au0.a2;
import au0.m4;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f250300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f250301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f250302c;
    public CharSequence d;
    public final m4 e;
    public final a2 f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(TextInputLayout textInputLayout, EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
        this.f250300a = editText;
        this.f250301b = textInputLayout;
        m4 m4Var = new m4(this, 11);
        this.e = m4Var;
        a2 a2Var = new a2(this, 9);
        this.f = a2Var;
        textInputLayout.setHintEnabled(true);
        textInputLayout.setHintAnimationEnabled(true);
        ((yz0.a) editText).a(m4Var);
        editText.addTextChangedListener(a2Var);
    }

    public final void a(boolean z) {
        Editable text;
        TextInputLayout textInputLayout = this.f250301b;
        EditText editText = this.f250300a;
        if (z) {
            if (this.f250302c != null || (text = editText.getText()) == null || text.length() == 0) {
                textInputLayout.setHint(this.f250302c);
                editText.setHint(this.d);
                return;
            } else {
                textInputLayout.setHint(this.d);
                editText.setHint((CharSequence) null);
                return;
            }
        }
        Editable text2 = editText.getText();
        if (text2 == null || text2.length() == 0) {
            textInputLayout.setHint("");
            editText.setHint(this.f250302c);
        } else {
            textInputLayout.setHint(this.f250302c);
            editText.setHint(this.d);
        }
    }
}
