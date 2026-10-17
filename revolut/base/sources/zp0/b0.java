package zp0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.widget.EditText;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 extends hm.b implements yz0.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f324101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DigitsKeyListener f324102h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(MaskedTextInputEditText editText, Function1 inputListener) {
        super("[00]:[00]", true, editText, new a0(0, inputListener));
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(inputListener, "inputListener");
        this.f324101g = new z();
        DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance("0123456789:");
        Intrinsics.checkNotNullExpressionValue(digitsKeyListener, "getInstance(...)");
        this.f324102h = digitsKeyListener;
        editText.addTextChangedListener(this);
    }

    @Override // yz0.b
    public final void a() {
        EditText editText = (EditText) this.d.get();
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
    }

    @Override // hm.b, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        WeakReference weakReference = this.d;
        EditText editText = (EditText) weakReference.get();
        if (editText != null) {
            editText.removeTextChangedListener(this);
            if (editable != null) {
                StringBuilder sb6 = new StringBuilder();
                if (this.f324101g.f324157a.f(String.valueOf(editable))) {
                    int i = 0;
                    int i2 = 0;
                    while (i < editable.length()) {
                        char cCharAt = editable.charAt(i);
                        int i3 = i2 + 1;
                        if (i2 == 0 && z.a(editable, 0) > 2) {
                            sb6.append("2");
                        } else if (i2 == 1 && z.a(editable, 0) >= 2 && z.a(editable, i2) > 3) {
                            sb6.append("3");
                        } else if (i2 != 3 || z.a(editable, i2) <= 5) {
                            sb6.append(cCharAt);
                        } else {
                            sb6.append("5");
                        }
                        i++;
                        i2 = i3;
                    }
                } else {
                    sb6 = null;
                }
                if (sb6 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb6);
                    if (!Intrinsics.f(spannableStringBuilder.toString(), editable.toString())) {
                        String text = spannableStringBuilder.toString();
                        Intrinsics.checkNotNullExpressionValue(text, "toString(...)");
                        Intrinsics.j(text, "text");
                        im.b bVarB = this.f153491a.b(new jm.a(text, text.length()), this.e);
                        jm.a aVar = bVarB.f162271a;
                        EditText editText2 = (EditText) weakReference.get();
                        if (editText2 != null) {
                            editText2.setText(aVar.f175891b);
                        }
                        EditText editText3 = (EditText) weakReference.get();
                        if (editText3 != null) {
                            editText3.setSelection(aVar.f175890a);
                        }
                        hm.a aVar2 = this.f;
                        if (aVar2 != null) {
                            aVar2.a(bVarB.f162272b, bVarB.f162273c);
                        }
                        editable = spannableStringBuilder;
                    }
                }
            }
            editText.addTextChangedListener(this);
        }
        super.afterTextChanged(editable);
    }

    @Override // yz0.b
    public final KeyListener b() {
        return this.f324102h;
    }

    @Override // yz0.b
    public final Clause c() {
        return null;
    }

    @Override // yz0.b
    public final boolean d() {
        return true;
    }

    @Override // yz0.b
    public final String e() {
        return this.f153492b;
    }

    @Override // yz0.b
    public final int f() {
        return this.f153493c;
    }

    @Override // yz0.b
    public final void onSelectionChanged(int i) {
    }
}
