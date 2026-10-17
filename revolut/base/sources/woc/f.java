package woc;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static dj0.d a(d input) throws Throwable {
        int i;
        Intrinsics.checkNotNullParameter(input, "input");
        dj0.d dVar = input.f298914b;
        BigDecimal bigDecimal = input.e;
        BigDecimal bigDecimal2 = input.f;
        int i2 = input.d;
        dj0.d dVar2 = input.f298913a;
        if (dVar != null && !Intrinsics.f(dVar.f115083b, dVar2.f115083b)) {
            hx7.e.n(new IllegalArgumentException("Initial contribution and target amount should have the same currency"));
            return new dj0.d(0L, dVar2.f115083b);
        }
        if (i2 == 0) {
            hx7.e.n(new IllegalArgumentException("Payments count should be greater than 0"));
            return new dj0.d(0L, dVar2.f115083b);
        }
        if (bigDecimal2.compareTo(bigDecimal) >= 0) {
            hx7.e.n(new IllegalArgumentException("Fee should be less than mean"));
            return new dj0.d(0L, dVar2.f115083b);
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal scale = bigDecimalSubtract.setScale(8, RoundingMode.HALF_DOWN);
        int i3 = e.f298916a[input.f298915c.ordinal()];
        if (i3 == 1) {
            i = 365;
        } else if (i3 == 2) {
            i = 52;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 12;
        }
        Intrinsics.h(scale);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal bigDecimalDivide = scale.divide(bigDecimalValueOf, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal bigDecimalY = pyd.c.Y(dVar2);
        xi0.b bVar = dVar2.f115083b;
        BigDecimal bigDecimalY2 = dVar != null ? pyd.c.Y(dVar) : BigDecimal.ZERO;
        MathContext mathContext = MathContext.DECIMAL64;
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalAdd = ONE.add(bigDecimalDivide);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalPow = bigDecimalAdd.pow(i2, mathContext);
        BigDecimal bigDecimalMultiply = bigDecimalY2.multiply(bigDecimalPow, mathContext);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalSubtract2 = bigDecimalY.subtract(bigDecimalMultiply);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        Intrinsics.h(bigDecimalPow);
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract3 = bigDecimalPow.subtract(ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
        BigDecimal bigDecimalDivide2 = bigDecimalSubtract3.divide(bigDecimalDivide, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
        BigDecimal bigDecimalDivide3 = bigDecimalSubtract2.divide(bigDecimalDivide2, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide3, "divide(...)");
        BigDecimal scale2 = bigDecimalDivide3.compareTo(BigDecimal.ZERO) >= 0 ? bigDecimalDivide3.setScale(2, RoundingMode.CEILING) : bigDecimalDivide3.setScale(2, RoundingMode.FLOOR);
        Intrinsics.h(scale2);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(cp5.d.k(bVar));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BigDecimal bigDecimalMultiply2 = scale2.multiply(bigDecimalValueOf2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        long jLongValue = bigDecimalMultiply2.longValue();
        return new dj0.d(jLongValue < 0 ? 0L : jLongValue, bVar);
    }
}
