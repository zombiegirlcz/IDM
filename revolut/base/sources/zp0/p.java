package zp0;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_resources.R$attr;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import zhm.r0;
import znd.u0;

/* JADX INFO: loaded from: classes19.dex */
public class p extends hm.b implements yz0.b {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final char[] f324131q = {CoreConstants.DOT, '/', CoreConstants.ESCAPE_CHAR, CoreConstants.DASH_CHAR};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f324132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f324133h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f324134j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DigitsKeyListener f324135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Regex f324136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f324137n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DateTimeFormatter f324138p;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Locale locale, EditText field, oim.n onDateEntered, String str, boolean z, boolean z3, o oVar, boolean z4, int i) throws IOException {
        String pattern;
        if ((i & 8) != 0) {
            Companion.getClass();
            pattern = n.a("ddMMyyyy", locale);
        } else {
            pattern = str;
        }
        boolean z6 = (i & 16) != 0 ? true : z;
        boolean z11 = (i & 32) != 0 ? false : z3;
        o digitsKeyListenerProvider = (i & 64) != 0 ? new o() : oVar;
        boolean z12 = (i & 128) != 0 ? false : z4;
        boolean z29 = (i & 256) != 0;
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(onDateEntered, "onDateEntered");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(digitsKeyListenerProvider, "digitsKeyListenerProvider");
        super(kotlin.text.a0.D(kotlin.text.a0.D(kotlin.text.a0.D(kotlin.text.a0.D(new Regex("[^dMy]+").h(d0.L(pattern, CoreConstants.DOT) ? f0.O0(1, pattern) : pattern, new u0(11)), "dd", "[00]", false), "MM", "[00]", false), "yyyy", "[0000]", false), "yy", "[00]", false), false, field, null);
        this.f324132g = pattern;
        this.f324133h = z6;
        this.i = z11;
        this.f324134j = z12;
        this.k = z29;
        String acceptedSymbols = zhm.d0.k0(f0.W0(pattern), "", null, null, 0, null, 62) + "1234567890DdMmYy";
        Intrinsics.checkNotNullParameter(acceptedSymbols, "acceptedSymbols");
        DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance(acceptedSymbols);
        Intrinsics.checkNotNullExpressionValue(digitsKeyListener, "getInstance(...)");
        this.f324135l = digitsKeyListener;
        this.f324136m = new Regex("[^0-9]");
        this.f324137n = d0.m0(pattern, new char[]{CoreConstants.DOT, '/', CoreConstants.ESCAPE_CHAR, CoreConstants.DASH_CHAR}, 6);
        this.o = r0.k(new Pair(new Pair('d', 1), new u0(7)), new Pair(new Pair('d', 2), new u0(8)), new Pair(new Pair('M', 1), new u0(9)), new Pair(new Pair('M', 2), new u0(10)));
        this.f324138p = DateTimeFormat.forPattern(d0.L(pattern, CoreConstants.DOT) ? f0.O0(1, pattern) : pattern).withLocale(locale);
        if (field instanceof yz0.a) {
            ((yz0.a) field).a(this);
        } else {
            field.setOnFocusChangeListener(this);
        }
        field.addTextChangedListener(this);
        if (!z12 && z6 && (field instanceof MaskedTextInputEditText)) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String upperCase = pattern.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            ((MaskedTextInputEditText) field).setAlwaysVisiblePlaceholder(new TextClause(upperCase, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        this.f = new su9.c(this, onDateEntered);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz0.b
    public final void a() {
        EditText editText = (EditText) this.d.get();
        if (editText != 0) {
            if (editText instanceof yz0.a) {
                ((yz0.a) editText).b(this);
            } else if (Intrinsics.f(editText.getOnFocusChangeListener(), this)) {
                editText.setOnFocusChangeListener(null);
            }
            editText.removeTextChangedListener(this);
        }
    }

    @Override // hm.b, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        WeakReference weakReference = this.d;
        EditText editText = (EditText) weakReference.get();
        if (editText == null) {
            return;
        }
        EditText editText2 = (EditText) weakReference.get();
        boolean z = editText2 instanceof MaskedTextInputEditText;
        MaskedTextInputEditText maskedTextInputEditText = z ? (MaskedTextInputEditText) editText2 : null;
        if (maskedTextInputEditText != null) {
            maskedTextInputEditText.removeTextChangedListener(maskedTextInputEditText.f59128t);
        }
        if (editText2 != null) {
            editText2.removeTextChangedListener(this);
        }
        if (editable != null) {
            editable.replace(0, editable.length(), this.f153492b);
        }
        int i = this.f153493c;
        int length = editText.length();
        if (i > length) {
            i = length;
        }
        editText.setSelection(i);
        if (editText2 != null) {
            editText2.addTextChangedListener(this);
        }
        MaskedTextInputEditText maskedTextInputEditText2 = z ? (MaskedTextInputEditText) editText2 : null;
        if (maskedTextInputEditText2 != null) {
            maskedTextInputEditText2.addTextChangedListener(maskedTextInputEditText2.f59128t);
        }
        if (this.f324134j) {
            EditText editText3 = (EditText) weakReference.get();
            boolean z3 = editText3 instanceof MaskedTextInputEditText;
            MaskedTextInputEditText maskedTextInputEditText3 = z3 ? (MaskedTextInputEditText) editText3 : null;
            if (maskedTextInputEditText3 != null) {
                maskedTextInputEditText3.removeTextChangedListener(maskedTextInputEditText3.f59128t);
            }
            if (editText3 != null) {
                editText3.removeTextChangedListener(this);
            }
            e80.j jVarH = h(editText, this.f153492b.length());
            if (this.f324133h || (editable != null && editable.length() != 0)) {
                if (editable != null) {
                    editable.append((CharSequence) jVarH);
                }
                editText.setSelection(this.f153493c);
            }
            if (editText3 != null) {
                editText3.addTextChangedListener(this);
            }
            MaskedTextInputEditText maskedTextInputEditText4 = z3 ? (MaskedTextInputEditText) editText3 : null;
            if (maskedTextInputEditText4 != null) {
                maskedTextInputEditText4.addTextChangedListener(maskedTextInputEditText4.f59128t);
            }
        }
    }

    @Override // yz0.b
    public final KeyListener b() {
        return this.f324135l;
    }

    @Override // yz0.b
    public final Clause c() {
        if (this.f324134j || !this.f324133h) {
            return null;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = this.f324132g.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new TextClause(upperCase, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // yz0.b
    public final boolean d() {
        return this.f324134j;
    }

    @Override // yz0.b
    public final String e() {
        return this.f153492b;
    }

    @Override // yz0.b
    public final int f() {
        return this.f153493c;
    }

    public final e80.j h(EditText editText, int i) {
        String str = this.f324132g;
        String strSubstring = str.substring(i, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = strSubstring.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        e80.j jVar = new e80.j(upperCase);
        Context context = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        jVar.setSpan(new ForegroundColorSpan(kli.a.s(R$attr.uikit_colorGreyTone20, context)), 0, str.length() - i, 33);
        return jVar;
    }

    @Override // hm.b, android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        EditText editText = (EditText) this.d.get();
        if (editText == null) {
            return;
        }
        super.onFocusChange(view, z);
        if (this.f324134j) {
            if (z) {
                if (editText.getText().toString().length() == 0) {
                    editText.setText(new SpannableStringBuilder(h(editText, 0)));
                }
            } else if (kotlin.text.a0.z(editText.getText().toString(), this.f324132g, true)) {
                editText.setText((CharSequence) null);
            }
        }
    }

    @Override // yz0.b
    public final void onSelectionChanged(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Map] */
    @Override // hm.b, android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zp0.p.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
