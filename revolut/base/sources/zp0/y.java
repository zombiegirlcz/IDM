package zp0;

import android.text.method.KeyListener;
import android.widget.EditText;
import au0.a2;
import com.redmadrobot.inputmask.helper.Compiler$FormatError;
import com.revolut.core.ui_kit.formatting.FormatError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class y implements yz0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f324150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ryc.a f324151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f324152c;
    public final fzl.e d;
    public final im.c e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f324153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f324154h;
    public final WeakReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f324155j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final KeyListener f324156l;

    public y(MaskedTextInputEditText field, List customNotations, String format, x formattedValueListener, String listId, KeyListener keyListener, boolean z, int i) throws FormatError {
        customNotations = (i & 2) != 0 ? f0.f322471a : customNotations;
        keyListener = (i & 32) != 0 ? null : keyListener;
        z = (i & 64) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(customNotations, "customNotations");
        Intrinsics.checkNotNullParameter(format, "pattern");
        Intrinsics.checkNotNullParameter(formattedValueListener, "formattedValueListener");
        Intrinsics.checkNotNullParameter(listId, "listId");
        ryc.a aVar = new ryc.a(formattedValueListener, listId);
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(customNotations, "customNotations");
        Intrinsics.checkNotNullParameter(field, "field");
        this.f324150a = z;
        this.f324151b = aVar;
        a2 a2Var = new a2(this, 14);
        this.f324152c = a2Var;
        fzl.e eVar = new fzl.e(this, 2);
        this.d = eVar;
        MaskedTextInputEditText maskedTextInputEditText = field != null ? field : null;
        if (maskedTextInputEditText != null) {
            maskedTextInputEditText.a(eVar);
            maskedTextInputEditText.addTextChangedListener(a2Var);
        }
        try {
            HashMap map = im.c.f162274c;
            this.e = v13.d.l(format, customNotations);
            this.f = "";
            this.i = new WeakReference(field);
            this.f324155j = format;
            this.k = listId;
            this.f324156l = keyListener;
        } catch (Compiler$FormatError cause) {
            String message = j6.a.s("Format = ", format, "; customNotations = [", d0.k0(customNotations, null, null, null, 0, null, 63), "]");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new FormatError(message, cause);
        }
    }

    @Override // yz0.b
    public final void a() {
        EditText editText = (EditText) this.i.get();
        if (editText != null) {
            editText.removeTextChangedListener(this.f324152c);
            if (Intrinsics.f(editText.getOnFocusChangeListener(), this.d)) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    @Override // yz0.b
    public final KeyListener b() {
        return this.f324156l;
    }

    @Override // yz0.b
    public final Clause c() {
        return null;
    }

    @Override // yz0.b
    public final boolean d() {
        return false;
    }

    @Override // yz0.b
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!y.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.formatting.FormattedMaskingDelegate");
        y yVar = (y) obj2;
        return Intrinsics.f(this.f324155j, yVar.f324155j) && Intrinsics.f(this.k, yVar.k);
    }

    @Override // yz0.b
    public final int f() {
        return this.f324154h;
    }

    public final int hashCode() {
        return this.k.hashCode() + (this.f324155j.hashCode() * 31);
    }

    @Override // yz0.b
    public final void onSelectionChanged(int i) {
    }
}
