package wp9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements TextWatcher {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f299168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f299169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f299170c;
    public final vx9.v d;
    public String e;
    public int f;

    public b(c amountParser, MaskedTextInputEditText editText, dj0.d maxAmount, vx9.v changeListener) {
        Intrinsics.checkNotNullParameter(amountParser, "amountParser");
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        Intrinsics.checkNotNullParameter(changeListener, "changeListener");
        this.f299168a = amountParser;
        this.f299169b = editText;
        this.f299170c = maxAmount;
        this.d = changeListener;
        this.f = -1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strValueOf = String.valueOf(editable);
        dj0.d dVar = this.f299170c;
        xi0.b bVar = dVar.f115083b;
        if (!new dj0.d(((Number) this.f299168a.invoke(strValueOf, bVar.f306286a)).longValue(), bVar).f(dVar)) {
            this.d.invoke(String.valueOf(editable));
            return;
        }
        int i = this.f;
        if (editable != null) {
            int length = editable.length();
            String str = this.e;
            editable.replace(0, length, str, 0, str != null ? str.length() : 0);
        }
        this.f299169b.setSelection(i);
        this.f = -1;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.e = charSequence != null ? charSequence.toString() : null;
        this.f = this.f299169b.getSelectionStart();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
