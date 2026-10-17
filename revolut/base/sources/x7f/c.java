package x7f;

import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigDecimal f303189c = new BigDecimal("0.3333333");
    public static final BigDecimal d;
    public static final BigDecimal e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f303190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f303191b;

    static {
        BigDecimal bigDecimal = new BigDecimal("0.6666667");
        d = bigDecimal;
        BigDecimal bigDecimalAdd = bigDecimal.add(new BigDecimal("0.001"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        e = bigDecimalAdd;
    }

    public c(BigDecimal neutralThreshold, BigDecimal saturationBound) {
        Intrinsics.checkNotNullParameter(neutralThreshold, "neutralThreshold");
        Intrinsics.checkNotNullParameter(saturationBound, "saturationBound");
        this.f303190a = neutralThreshold;
        this.f303191b = saturationBound;
        if (neutralThreshold.compareTo(BigDecimal.ZERO) <= 0 || saturationBound.compareTo(neutralThreshold) <= 0) {
            throw new IllegalArgumentException(("Expected 0 < neutralThreshold < saturationBound, but was " + neutralThreshold + " and " + saturationBound).toString());
        }
    }

    public static float a(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalSubtract2 = bigDecimal3.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        BigDecimal bigDecimal6 = (BigDecimal) f.j(bigDecimalSubtract.divide(bigDecimalSubtract2, MathContext.DECIMAL128), BigDecimal.ZERO, BigDecimal.ONE);
        Intrinsics.h(bigDecimal6);
        BigDecimal bigDecimalSubtract3 = bigDecimal5.subtract(bigDecimal4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
        BigDecimal bigDecimalMultiply = bigDecimal6.multiply(bigDecimalSubtract3);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalAdd = bigDecimal4.add(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd.floatValue();
    }

    public final float b(BigDecimal diff) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        BigDecimal bigDecimal = this.f303190a;
        BigDecimal bigDecimalNegate = bigDecimal.negate();
        Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        int iCompareTo = diff.compareTo(bigDecimalNegate);
        BigDecimal bigDecimal2 = this.f303191b;
        BigDecimal bigDecimal3 = f303189c;
        if (iCompareTo <= 0) {
            BigDecimal bigDecimalNegate2 = bigDecimal2.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
            BigDecimal bigDecimalNegate3 = bigDecimal.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate3, "negate(...)");
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return a(diff, bigDecimalNegate2, bigDecimalNegate3, ZERO, bigDecimal3);
        }
        if (diff.compareTo(bigDecimal) < 0) {
            BigDecimal bigDecimalNegate4 = bigDecimal.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate4, "negate(...)");
            return a(diff, bigDecimalNegate4, bigDecimal, bigDecimal3, d);
        }
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        return a(diff, bigDecimal, bigDecimal2, e, ONE);
    }
}
