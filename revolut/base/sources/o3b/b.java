package o3b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static BigDecimal a(String str, BigDecimal bigDecimal) {
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalAdd = ONE.add(new BigDecimal(str));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalAdd);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public static BigDecimal b(String str, BigDecimal bigDecimal) {
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        BigDecimal bigDecimalSubtract = ONE.subtract(new BigDecimal(str));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalSubtract);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    public final TradingOrderExitStrategy.Price c(bfl.g side, BigDecimal currentRate, BigDecimal baseRate, xi0.b currency, int i) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimalB;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        int[] iArr = a.f221713a;
        int i2 = iArr[side.ordinal()];
        if (i2 == 1) {
            bigDecimal = (BigDecimal) zhm.d0.y0(zhm.v.k(currentRate, baseRate));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimal = (BigDecimal) zhm.d0.s0(zhm.v.k(currentRate, baseRate));
        }
        int i3 = iArr[side.ordinal()];
        if (i3 == 1) {
            bigDecimalB = b("0.01", bigDecimal);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalB = a("0.01", bigDecimal);
        }
        BigDecimal scale = bigDecimalB.setScale(i, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return new TradingOrderExitStrategy.Price(new ej0.b(scale, currency));
    }

    public final TradingOrderExitStrategy.Price d(bfl.g side, BigDecimal currentRate, BigDecimal baseRate, xi0.b currency, int i) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimalA;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        int[] iArr = a.f221713a;
        int i2 = iArr[side.ordinal()];
        if (i2 == 1) {
            bigDecimal = (BigDecimal) zhm.d0.s0(zhm.v.k(currentRate, baseRate));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimal = (BigDecimal) zhm.d0.y0(zhm.v.k(currentRate, baseRate));
        }
        int i3 = iArr[side.ordinal()];
        if (i3 == 1) {
            bigDecimalA = a("0.02", bigDecimal);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bigDecimalA = b("0.02", bigDecimal);
        }
        BigDecimal scale = bigDecimalA.setScale(i, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return new TradingOrderExitStrategy.Price(new ej0.b(scale, currency));
    }
}
