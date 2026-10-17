package sfd;

import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRate;
import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRatePoint;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static double a(ChartRate chartRate, Integer num) {
        BigDecimal bigDecimal = chartRate != null ? chartRate.f86882b : null;
        ChartRatePoint chartRatePointB = b(chartRate, num);
        if (bigDecimal == null || chartRatePointB == null) {
            return 0.0d;
        }
        BigDecimal bigDecimalSubtract = chartRatePointB.a().subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100.0d);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimal, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide.doubleValue();
    }

    public static ChartRatePoint b(ChartRate chartRate, Integer num) {
        if (num == null) {
            if (chartRate != null) {
                return (ChartRatePoint) d0.o0(chartRate.f86883c);
            }
            return null;
        }
        if (chartRate == null) {
            return null;
        }
        return (ChartRatePoint) d0.e0(num.intValue(), chartRate.f86883c);
    }
}
