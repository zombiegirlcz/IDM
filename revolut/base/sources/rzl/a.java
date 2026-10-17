package rzl;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static BigDecimal a(BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimalAbs = value.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalPow = bigDecimalValueOf.pow(0);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
        BigDecimal bigDecimalDivide = bigDecimalAbs.divide(bigDecimalPow, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal bigDecimalRemainder = bigDecimalDivide.remainder(BigDecimal.ONE);
        Intrinsics.checkNotNullExpressionValue(bigDecimalRemainder, "remainder(...)");
        return bigDecimalRemainder;
    }

    public static BigDecimal b(BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        BigDecimal bigDecimalAbs = value.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalPow = bigDecimalValueOf.pow(0);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
        BigDecimal bigDecimalDivide = bigDecimalAbs.divide(bigDecimalPow, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        BigDecimal scale = bigDecimalDivide.setScale(0, RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return scale;
    }
}
