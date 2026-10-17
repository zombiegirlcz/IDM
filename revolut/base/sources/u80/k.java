package u80;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import androidx.core.text.BidiFormatter;
import androidx.core.text.TextDirectionHeuristicsCompat;
import ch.qos.logback.core.CoreConstants;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final HashMap f278045y = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f278046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xi0.b f278047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BigInteger f278048c;
    public long d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RoundingMode f278049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f278050h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f278051j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f278052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f278053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f278054n;
    public Character o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f278055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f278056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f278057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f278058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f278059t;
    public boolean u;
    public final BidiFormatter v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Lazy f278060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Lazy f278061x;

    public k(qd0.b bVar) {
        this.f278046a = bVar;
        BigInteger ZERO = BigInteger.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f278048c = ZERO;
        this.e = -1;
        this.f = -1;
        BidiFormatter bidiFormatter = BidiFormatter.getInstance(((s80.b) bVar).b());
        Intrinsics.checkNotNullExpressionValue(bidiFormatter, "getInstance(...)");
        this.v = bidiFormatter;
        this.f278060w = yhm.j.b(new tyl.a(this, 11));
        this.f278061x = yhm.j.b(new u6h.h(3));
    }

    public static Integer g(String str, char c2, Integer num, Integer num2) {
        int iS;
        int i = 0;
        while (i < str.length() && (iS = d0.S(str, c2, i, 4)) >= 0) {
            if (num == null || iS < num.intValue() || num2 == null || iS > num2.intValue()) {
                return Integer.valueOf(iS);
            }
            i = iS + 1;
        }
        return null;
    }

    public static boolean m(Locale locale, xi0.b bVar) {
        if (!Intrinsics.f(locale, Locale.JAPANESE) && !Intrinsics.f(locale, Locale.JAPAN) && !Intrinsics.f(locale, Locale.SIMPLIFIED_CHINESE) && !Intrinsics.f(locale, new Locale("zh-Hans", "CN")) && !Intrinsics.f(locale, new Locale("zh-Hans", "")) && !Intrinsics.f(locale, Locale.TRADITIONAL_CHINESE) && !Intrinsics.f(locale, new Locale("zh-Hant", "")) && !Intrinsics.f(locale, new Locale("zh-Hant", "TW"))) {
            return false;
        }
        xi0.b.Companion.getClass();
        return Intrinsics.f(bVar, xi0.b.f306274j);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            Method dump skipped, instruction units count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u80.k.a():java.lang.String");
    }

    public final e80.j b() {
        Integer numG;
        String charSequence = a();
        if (charSequence.length() == 0) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            return new e80.j(charSequence);
        }
        Lazy lazy = this.f278061x;
        if (((List) lazy.getValue()).isEmpty()) {
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            return new e80.j(charSequence);
        }
        d dVar = new d(((s80.b) this.f278046a).b());
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        e80.j jVar = new e80.j(charSequence);
        char cD = dVar.d();
        if (this.f278053m) {
            numG = g(charSequence, cD, null, null);
        } else {
            int iT = d0.T(charSequence, k(this.f278047b), 0, false, 6);
            numG = iT >= 0 ? g(charSequence, cD, Integer.valueOf(iT), Integer.valueOf((r4.length() + iT) - 1)) : g(charSequence, cD, null, null);
        }
        int iIntValue = (numG != null ? numG.intValue() : -1) + this.f278050h;
        if (iIntValue > -1 && iIntValue < charSequence.length()) {
            String strSubstring = charSequence.substring(iIntValue + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int length = strSubstring.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isDigit(strSubstring.charAt(i2))) {
                    i++;
                }
            }
            if (i > 0) {
                Iterator it8 = ((List) lazy.getValue()).iterator();
                while (it8.hasNext()) {
                    jVar.setSpan((CharacterStyle) it8.next(), iIntValue, iIntValue + i + 1, 18);
                }
            }
        }
        return jVar;
    }

    public final d c(int i, xi0.b bVar) {
        String code;
        Locale localeB = ((s80.b) this.f278046a).b();
        d dVar = new d(localeB);
        String pattern = null;
        String str = bVar != null ? bVar.f306286a : null;
        if (this.f278053m || str == null || str.length() == 0) {
            dVar.e("");
        } else {
            String strK = k(bVar);
            if (Intrinsics.f(strK, p.f278067b)) {
                dVar.e("¤");
            } else {
                dVar.e(strK);
            }
        }
        String strC = dVar.c();
        if (!((Boolean) this.f278060w.getValue()).booleanValue()) {
            BidiFormatter bidiFormatter = this.v;
            if (bidiFormatter.isRtl(strC)) {
                strC = bidiFormatter.unicodeWrap(strC, TextDirectionHeuristicsCompat.LTR);
                Intrinsics.h(strC);
            }
        }
        dVar.e(strC);
        if (bVar != null && (code = bVar.f306286a) != null) {
            sd0.g.f261792c.getClass();
            Intrinsics.checkNotNullParameter(code, "code");
            sd0.j.a();
            com.bumptech.glide.g gVar = sd0.g.e;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(code, "code");
            xi0.c cVar = (xi0.c) gVar.f26094a.get(code);
            if (cVar != null) {
                pattern = cVar.f306292h;
            }
        }
        if (pattern != null) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            dVar.f278029a.applyPattern(pattern);
        } else if (cp5.d.z(bVar) || cp5.d.y(bVar)) {
            Intrinsics.checkNotNullParameter("#,##0.00 ¤", "pattern");
            dVar.f278029a.applyPattern("#,##0.00 ¤");
        } else if (this.f278059t && m(localeB, bVar)) {
            Intrinsics.checkNotNullParameter("#,##0.00¤", "pattern");
            dVar.f278029a.applyPattern("#,##0.00¤");
        }
        if (this.f278054n) {
            dVar.f278029a.setGroupingUsed(false);
        }
        dVar.f(i);
        int i2 = this.e;
        if (i2 >= 0) {
            dVar.f278029a.setMinimumFractionDigits(i2);
        }
        int i3 = this.f;
        if (i3 >= 0) {
            dVar.f(i3);
            RoundingMode roundingMode = this.f278049g;
            if (roundingMode != null) {
                dVar.g(roundingMode);
            }
        }
        if (this.f278055p && !this.f278057r) {
            dVar.f(0);
            dVar.g(RoundingMode.HALF_UP);
        }
        String negativePrefix = dVar.f278029a.getNegativePrefix();
        Intrinsics.checkNotNullExpressionValue(negativePrefix, "getNegativePrefix(...)");
        if (d0.J(negativePrefix, "(", false)) {
            String negativePrefix2 = dVar.f278029a.getNegativePrefix();
            Intrinsics.checkNotNullExpressionValue(negativePrefix2, "getNegativePrefix(...)");
            String value = a0.E(negativePrefix2, CoreConstants.LEFT_PARENTHESIS_CHAR, dVar.f278029a.getDecimalFormatSymbols().getMinusSign());
            Intrinsics.checkNotNullParameter(value, "value");
            dVar.f278029a.setNegativePrefix(value);
        }
        String negativeSuffix = dVar.f278029a.getNegativeSuffix();
        Intrinsics.checkNotNullExpressionValue(negativeSuffix, "getNegativeSuffix(...)");
        if (d0.J(negativeSuffix, ")", false)) {
            String negativeSuffix2 = dVar.f278029a.getNegativeSuffix();
            Intrinsics.checkNotNullExpressionValue(negativeSuffix2, "getNegativeSuffix(...)");
            String value2 = a0.D(negativeSuffix2, ")", "", false);
            Intrinsics.checkNotNullParameter(value2, "value");
            dVar.f278029a.setNegativeSuffix(value2);
        }
        Character ch5 = this.o;
        if (ch5 != null) {
            char cCharValue = ch5.charValue();
            DecimalFormat decimalFormat = dVar.f278029a;
            DecimalFormatSymbols it8 = decimalFormat.getDecimalFormatSymbols();
            Intrinsics.h(it8);
            Intrinsics.checkNotNullParameter(it8, "it");
            it8.setGroupingSeparator(cCharValue);
            Unit unit = Unit.f186387a;
            decimalFormat.setDecimalFormatSymbols(it8);
        }
        return dVar;
    }

    public final void d(long j2) {
        this.d = j2;
        this.f278057r = true;
    }

    public final void e() {
        this.f278052l = true;
        this.k = true;
    }

    public final void f() {
        this.k = true;
    }

    public final void h() {
        this.f278051j = true;
    }

    public final void i(RelativeSizeSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        Lazy lazy = this.f278061x;
        ((List) lazy.getValue()).clear();
        ((List) lazy.getValue()).add(span);
    }

    public final void j(RelativeSizeSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        i(span);
        this.f278050h = 3;
    }

    public final String k(xi0.b bVar) {
        String strJ = null;
        String str = bVar != null ? bVar.f306286a : null;
        Locale localeB = ((s80.b) this.f278046a).b();
        if (this.f278059t && m(localeB, bVar)) {
            return "円";
        }
        if (Build.VERSION.SDK_INT >= 29) {
            xi0.b.Companion.getClass();
            if (Intrinsics.f(bVar, xi0.b.v)) {
                return p.f278067b;
            }
        }
        if (str != null) {
            xi0.b.Companion.getClass();
            strJ = cp5.d.J(xi0.a.a(str));
        }
        return strJ == null ? "" : strJ;
    }

    public final void l() {
        this.f278053m = true;
    }

    public final void n() {
        this.f278059t = true;
    }

    public final void o() {
        this.f278058s = true;
    }

    public final void p() {
        this.f278055p = true;
    }

    public final void q(long j2) {
        BigInteger amount = BigInteger.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(amount, "valueOf(...)");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f278048c = amount;
    }

    public final void r(xi0.b bVar) {
        this.f278047b = bVar;
    }

    public final void s(String str) {
        xi0.b bVarA;
        if (str != null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(str);
        } else {
            bVarA = null;
        }
        this.f278047b = bVarA;
    }

    public final void t(int i, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        this.f = i;
        this.f278049g = roundingMode;
    }

    public final void u(int i) {
        this.e = i;
    }

    public final void v(dj0.d dVar) {
        if (dVar == null) {
            return;
        }
        q(dVar.f115082a);
        this.f278047b = dVar.f115083b;
    }

    public final void w(int i) {
        this.f278056q = Integer.valueOf(i);
    }

    public final void x() {
        this.i = true;
    }
}
