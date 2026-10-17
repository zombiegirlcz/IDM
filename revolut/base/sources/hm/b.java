package hm;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import im.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import v13.d;
import zhm.f0;
import zp0.a0;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b implements TextWatcher, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f153491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f153492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f153493c;
    public final WeakReference d;
    public final boolean e;
    public a f;

    public b(String format, boolean z, EditText field, a0 a0Var) {
        Intrinsics.j(format, "format");
        Intrinsics.j(field, "field");
        f0 customNotations = f0.f322471a;
        Intrinsics.j(customNotations, "customNotations");
        this.e = z;
        this.f = a0Var;
        HashMap map = c.f162274c;
        this.f153491a = d.l(format, customNotations);
        this.f153492b = "";
        this.d = new WeakReference(field);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        WeakReference weakReference = this.d;
        EditText editText = (EditText) weakReference.get();
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
        if (editable != null) {
            editable.replace(0, editable.length(), this.f153492b);
        }
        EditText editText2 = (EditText) weakReference.get();
        if (editText2 != null) {
            editText2.setSelection(this.f153493c);
        }
        EditText editText3 = (EditText) weakReference.get();
        if (editText3 != null) {
            editText3.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        String strValueOf;
        boolean z3 = this.e;
        if (z3 && z) {
            WeakReference weakReference = this.d;
            EditText editText = (EditText) weakReference.get();
            Editable text = editText != null ? editText.getText() : null;
            if (text == null) {
                Intrinsics.p();
            }
            if (text.length() == 0) {
                strValueOf = "";
            } else {
                EditText editText2 = (EditText) weakReference.get();
                strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
            }
            im.b bVarB = this.f153491a.b(new jm.a(strValueOf, strValueOf.length()), z3);
            jm.a aVar = bVarB.f162271a;
            EditText editText3 = (EditText) weakReference.get();
            if (editText3 != null) {
                editText3.setText(aVar.f175891b);
            }
            EditText editText4 = (EditText) weakReference.get();
            if (editText4 != null) {
                editText4.setSelection(aVar.f175890a);
            }
            a aVar2 = this.f;
            if (aVar2 != null) {
                aVar2.a(bVarB.f162272b, bVarB.f162273c);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence text, int i, int i2, int i3) {
        Intrinsics.j(text, "text");
        boolean z = false;
        boolean z3 = i2 > 0 && i3 == 0;
        jm.a aVar = new jm.a(text.toString(), z3 ? i : i3 + i);
        if (this.e && !z3) {
            z = true;
        }
        im.b bVarB = this.f153491a.b(aVar, z);
        jm.a aVar2 = bVarB.f162271a;
        this.f153492b = aVar2.f175891b;
        if (!z3) {
            i = aVar2.f175890a;
        }
        this.f153493c = i;
        a aVar3 = this.f;
        if (aVar3 != null) {
            aVar3.a(bVarB.f162272b, bVarB.f162273c);
        }
    }
}
