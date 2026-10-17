package bp0;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import aw0.p9;
import aw0.wa;
import com.revolut.core.ui_kit.models.NumberClause;
import d9.e1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f17500a;

    public j(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f17500a = languageProvider;
    }

    public final DecimalFormat a(String str, RoundingMode roundingMode) {
        DecimalFormat decimalFormat = new DecimalFormat(str, DecimalFormatSymbols.getInstance(((s80.b) this.f17500a).a()));
        decimalFormat.setRoundingMode(roundingMode.ordinal());
        return decimalFormat;
    }

    public final String b(NumberClause clause) {
        Pair pair;
        Intrinsics.checkNotNullParameter(clause, "clause");
        NumberClause.Format f57895b = clause.getF57895b();
        if (Intrinsics.f(f57895b, NumberClause.Format.Default.f57900a)) {
            String str = a("#,###", RoundingMode.DOWN).format(clause.getF57894a());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (f57895b instanceof NumberClause.Format.Compact) {
            BigDecimal f57894a = clause.getF57894a();
            boolean f57899a = ((NumberClause.Format.Compact) f57895b).getF57899a();
            double dDoubleValue = f57894a.doubleValue();
            long jLongValue = f57894a.longValue();
            if (Math.abs(jLongValue) < 1000) {
                Double dValueOf = Double.valueOf(dDoubleValue);
                m70.a.c(t0.f186434a);
                pair = new Pair(dValueOf, "");
            } else {
                pair = Math.abs(jLongValue) < 1000000 ? new Pair(Double.valueOf(dDoubleValue / ((double) 1000)), "k") : Math.abs(jLongValue) < 1000000000 ? new Pair(Double.valueOf(dDoubleValue / ((double) 1000000)), "M") : new Pair(Double.valueOf(dDoubleValue / ((double) 1000000000)), "B");
            }
            double dDoubleValue2 = ((Number) pair.f186385a).doubleValue();
            String str2 = (String) pair.f186386b;
            String str3 = a(f57899a ? "#.#" : "#", RoundingMode.DOWN).format(dDoubleValue2) + str2;
            Intrinsics.checkNotNullExpressionValue(str3, "toString(...)");
            return str3;
        }
        int i = 2;
        if (!(f57895b instanceof NumberClause.Format.FixedDigitsAfterDot)) {
            if (!(f57895b instanceof NumberClause.Format.AllDigitsAfterDot)) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal f57894a2 = clause.getF57894a();
            NumberClause.Format.AllDigitsAfterDot allDigitsAfterDot = (NumberClause.Format.AllDigitsAfterDot) f57895b;
            wa f57897a = allDigitsAfterDot.getF57897a();
            p9 f57898b = allDigitsAfterDot.getF57898b();
            int i2 = i.f17498a[f57897a.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    f57894a2 = e1.Q(f57894a2);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f57894a2 = e1.R(f57894a2);
                }
            }
            int i3 = i.f17499b[f57898b.ordinal()];
            if (i3 == 1) {
                if (e1.G(f57894a2)) {
                    return j6.a.q("+", f57894a2.toPlainString());
                }
                String plainString = f57894a2.toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                return plainString;
            }
            if (i3 == 2) {
                String plainString2 = f57894a2.toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
                return plainString2;
            }
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            String plainString3 = f57894a2.abs().toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString3, "toPlainString(...)");
            return plainString3;
        }
        BigDecimal f57894a3 = clause.getF57894a();
        NumberClause.Format.FixedDigitsAfterDot fixedDigitsAfterDot = (NumberClause.Format.FixedDigitsAfterDot) f57895b;
        int f57901a = fixedDigitsAfterDot.getF57901a();
        wa f57903c = fixedDigitsAfterDot.getF57903c();
        RoundingMode f57902b = fixedDigitsAfterDot.getF57902b();
        p9 d = fixedDigitsAfterDot.getD();
        double dDoubleValue3 = f57894a3.doubleValue();
        StringBuilder sb6 = new StringBuilder();
        if (d == p9.ALWAYS && f57894a3.compareTo(BigDecimal.ZERO) > 0) {
            sb6.append("+");
        }
        sb6.append("#,##0");
        if (f57901a > 0) {
            sb6.append(".");
            if (1 <= f57901a) {
                int i5 = 1;
                while (true) {
                    int i6 = i.f17498a[f57903c.ordinal()];
                    String str4 = "0";
                    if (i6 != 1) {
                        if (i6 != i) {
                            if (i6 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (i5 == f57901a) {
                        }
                        str4 = "#";
                    }
                    sb6.append(str4);
                    if (i5 == f57901a) {
                        break;
                    }
                    i5++;
                    i = 2;
                }
            }
        }
        if (d == p9.ALWAYS) {
            sb6.append(";-#");
        }
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "with(...)");
        DecimalFormat decimalFormatA = a(string, f57902b);
        if (d == p9.NEVER) {
            decimalFormatA.setNegativePrefix("");
        }
        String str5 = decimalFormatA.format(dDoubleValue3);
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        return str5;
    }
}
