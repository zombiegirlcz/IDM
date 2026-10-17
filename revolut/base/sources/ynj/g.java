package ynj;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dej.j3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {
    public static Float a(j3 subscriptionState, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(subscriptionState, "subscriptionState");
        switch (f.f315482a[subscriptionState.ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (l2 == null) {
                    return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                }
                long jLongValue = l2.longValue();
                long jLongValue2 = l3 != null ? l3.longValue() : jLongValue;
                if (jLongValue == 0) {
                    return Float.valueOf(100.0f);
                }
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(jLongValue2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                BigDecimal bigDecimalMultiply = bigDecimalValueOf.multiply(new BigDecimal(String.valueOf(100.0f)));
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(jLongValue);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                BigDecimal scale = bigDecimalDivide.setScale(1, RoundingMode.HALF_UP);
                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(100);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf4, "valueOf(...)");
                return Float.valueOf(((BigDecimal) kotlin.ranges.f.j(scale, bigDecimalValueOf3, bigDecimalValueOf4)).floatValue());
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
