package u80;

import android.text.style.RelativeSizeSpan;
import d9.e1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class v implements t {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f278073a;

    public v(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f278073a = languageProvider;
    }

    @Override // u80.t
    public final CharSequence b(BigDecimal rate, xi0.b currency, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (rate.compareTo(BigDecimal.ZERO) <= 0) {
            return "";
        }
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        qd0.b languageProvider = this.f278073a;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        int iP = cp5.d.p(currency);
        BigDecimal bigDecimalM = e1.M(rate, 4, 6);
        if (iP <= 2) {
            iP = 4;
        }
        BigDecimal bigDecimalMultiply = bigDecimalM.multiply(new BigDecimal(String.valueOf(Math.pow(10.0d, bigDecimalM.scale()))));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        k.Companion.getClass();
        k kVarA = j.a(languageProvider);
        kVarA.q(bigDecimalMultiply.longValue());
        kVarA.r(xi0.b.a(currency, Integer.valueOf(bigDecimalM.scale())));
        if (!z) {
            kVarA.l();
        }
        if (z4) {
            kVarA.e();
        } else {
            kVarA.u(cp5.d.z(currency) ? iP : 4);
        }
        if (z3) {
            kVarA.j(new RelativeSizeSpan(0.75f));
        }
        return kVarA.b();
    }

    @Override // u80.t
    public final BigDecimal c(BigDecimal rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal bigDecimalR = t61.a.r(rate.setScale(8, roundingMode));
        BigDecimal bigDecimalAbs = bigDecimalR.abs();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal scale = (bigDecimalAbs.compareTo(bigDecimalValueOf) > 0 || bigDecimalR.equals(BigDecimal.ZERO)) ? bigDecimalR.setScale(2, roundingMode) : bigDecimalAbs.compareTo(BigDecimal.ONE) >= 0 ? bigDecimalR.setScale(5 - (((int) Math.log10(bigDecimalAbs.doubleValue())) + 1), roundingMode) : e1.L(bigDecimalR, 5, roundingMode, 8);
        Intrinsics.checkNotNullExpressionValue(scale, "run(...)");
        return scale;
    }

    @Override // u80.t
    public final BigDecimal d(String rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        if (rate.length() == 0) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.h(bigDecimal);
            return bigDecimal;
        }
        String strReplace = new Regex("[^0-9,.]").replace(rate, "");
        int length = strReplace.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = strReplace.charAt(!z ? i : length);
            boolean z3 = cCharAt == f0.P0(".") || cCharAt == f0.P0(",");
            if (z) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i++;
            } else {
                z = true;
            }
        }
        String string = strReplace.subSequence(i, length + 1).toString();
        double dDoubleValue = 0.0d;
        if (string.length() == 0) {
            return new BigDecimal(String.valueOf(0.0d));
        }
        Locale localeB = ((s80.b) this.f278073a).b();
        String strD = a0.D(string, " ", "", false);
        try {
            try {
                dDoubleValue = oc.c.i(localeB).parse(strD).doubleValue();
            } catch (ParseException unused) {
                NumberFormat numberFormat = NumberFormat.getInstance(localeB);
                Intrinsics.i(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
                Number number = ((DecimalFormat) numberFormat).parse(strD);
                if (number != null) {
                    dDoubleValue = number.doubleValue();
                }
            }
        } catch (Throwable unused2) {
        }
        return new BigDecimal(String.valueOf(dDoubleValue));
    }

    @Override // u80.t
    public final CharSequence e(BigDecimal rate, xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        BigDecimal bigDecimalC = q.c(rate);
        k.Companion.getClass();
        k kVarA = j.a(this.f278073a);
        kVarA.q((long) (Math.pow(10.0d, bigDecimalC.scale()) * bigDecimalC.doubleValue()));
        kVarA.r(xi0.b.a(currency, Integer.valueOf(bigDecimalC.scale())));
        kVarA.e();
        if (!z) {
            kVarA.l();
        }
        return kVarA.a();
    }

    @Override // u80.t
    public final CharSequence f(BigDecimal rate, xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        qd0.b languageProvider = this.f278073a;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        BigDecimal bigDecimalC = c(rate);
        k.Companion.getClass();
        k kVarA = j.a(languageProvider);
        kVarA.q(bigDecimalC.unscaledValue().longValue());
        kVarA.r(xi0.b.a(currency, Integer.valueOf(bigDecimalC.scale())));
        kVarA.u(bigDecimalC.scale());
        if (!z) {
            kVarA.l();
        }
        return kVarA.b();
    }

    @Override // u80.t
    public final xi0.b g(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Companion.getClass();
        Intrinsics.checkNotNullParameter(currency, "<this>");
        Intrinsics.checkNotNullParameter(currency, "<this>");
        return currency.c() < 4 ? new xi0.b(4, currency.f306286a, 9) : currency;
    }
}
