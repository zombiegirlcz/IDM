package zp0;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements TextWatcher, View.OnFocusChangeListener, yz0.b {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f324103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f324104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextWatcher f324105c;
    public final c d;
    public final int e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f324106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f324107h;
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f324108j;
    public final ihm.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.b f324109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.b f324110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f324111n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f324112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f324113q;

    public d(MaskedTextInputEditText field, xi0.b currency, u80.d decimalFormat, wp9.b bVar, c cVar, boolean z, boolean z3, int i, boolean z4, BigDecimal bigDecimal, int i2) {
        Editable text;
        String string;
        wp9.b bVar2 = (i2 & 8) != 0 ? null : bVar;
        c cVar2 = (i2 & 16) != 0 ? null : cVar;
        boolean z6 = (i2 & 32) != 0 ? false : z;
        boolean z11 = (i2 & 64) != 0 ? true : z3;
        boolean z12 = (i2 & 128) != 0;
        int iB = (i2 & 256) != 0 ? currency.b() : i;
        boolean z29 = (i2 & 512) != 0 ? false : z4;
        BigDecimal bigDecimal2 = (i2 & 1024) == 0 ? bigDecimal : null;
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        WeakReference weakReference = new WeakReference(field);
        decimalFormat.e(cp5.d.J(currency));
        boolean z31 = z11;
        l lVar = new l(currency, decimalFormat, z31, z12, iB, bigDecimal2);
        Companion.getClass();
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        a aVar = new a(decimalFormat.c(), decimalFormat.f278029a.getDecimalFormatSymbols().getMonetaryGroupingSeparator(), decimalFormat.d());
        int iB2 = decimalFormat.b();
        String positiveSuffix = decimalFormat.f278029a.getPositiveSuffix();
        Intrinsics.checkNotNullExpressionValue(positiveSuffix, "getPositiveSuffix(...)");
        this.f324103a = weakReference;
        this.f324104b = lVar;
        this.f324105c = bVar2;
        this.d = cVar2;
        this.e = iB2;
        this.f = z31;
        this.f324106g = positiveSuffix;
        this.f324107h = currency;
        this.i = aVar;
        this.f324108j = z29;
        this.k = j6.a.h("create(...)");
        this.f324109l = j6.a.h("create(...)");
        this.f324110m = j6.a.h("create(...)");
        MaskedTextInputEditText maskedTextInputEditText = (MaskedTextInputEditText) weakReference.get();
        this.f324111n = (maskedTextInputEditText == null || (text = maskedTextInputEditText.getText()) == null || (string = text.toString()) == null) ? "" : string;
        MaskedTextInputEditText maskedTextInputEditText2 = (MaskedTextInputEditText) weakReference.get();
        this.o = maskedTextInputEditText2 != null ? maskedTextInputEditText2.getSelectionStart() : 0;
        MaskedTextInputEditText maskedTextInputEditText3 = (MaskedTextInputEditText) weakReference.get();
        this.f324112p = maskedTextInputEditText3 != null ? maskedTextInputEditText3.hasFocus() : false;
        MaskedTextInputEditText maskedTextInputEditText4 = (MaskedTextInputEditText) weakReference.get();
        if (maskedTextInputEditText4 != null) {
            maskedTextInputEditText4.a(this);
            maskedTextInputEditText4.addTextChangedListener(this);
            if (z6) {
                maskedTextInputEditText4.setHint(im.c.a(lVar.f324130h.f162275a, ""));
            }
        }
    }

    @Override // yz0.b
    public final void a() {
        MaskedTextInputEditText maskedTextInputEditText = (MaskedTextInputEditText) this.f324103a.get();
        if (maskedTextInputEditText != null) {
            maskedTextInputEditText.removeTextChangedListener(this);
            maskedTextInputEditText.b(this);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        MaskedTextInputEditText maskedTextInputEditText = (MaskedTextInputEditText) this.f324103a.get();
        if (maskedTextInputEditText != null) {
            maskedTextInputEditText.removeTextChangedListener(this);
            if (editable != null) {
                editable.replace(0, editable.length(), this.f324111n);
            }
            maskedTextInputEditText.setSelection(Math.min(editable != null ? editable.length() : Integer.MAX_VALUE, Math.min(this.o, this.f324111n.length())));
            maskedTextInputEditText.addTextChangedListener(this);
            TextWatcher textWatcher = this.f324105c;
            if (textWatcher != null) {
                textWatcher.afterTextChanged(editable);
            }
        }
    }

    @Override // yz0.b
    public final KeyListener b() {
        return this.i;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcher textWatcher = this.f324105c;
        if (textWatcher != null) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
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
        return this.f324111n;
    }

    @Override // yz0.b
    public final int f() {
        return this.o;
    }

    @Override // yz0.b
    public final boolean g() {
        return this.f324108j;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.f324112p = z;
    }

    @Override // yz0.b
    public final void onSelectionChanged(int i) {
        MaskedTextInputEditText maskedTextInputEditText;
        Editable text;
        if (this.e != 1 || !this.f || (maskedTextInputEditText = (MaskedTextInputEditText) this.f324103a.get()) == null || (text = maskedTextInputEditText.getText()) == null) {
            return;
        }
        int length = text.length();
        int length2 = length - this.f324106g.length();
        if (length <= 1 || length2 < 0 || i < length2) {
            return;
        }
        maskedTextInputEditText.setSelection(length2);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r28, int r29, int r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zp0.d.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
