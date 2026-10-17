package q2b;

import bfl.g;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import d9.e1;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import k4l.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static BigDecimal d(BigDecimal bigDecimal, BigDecimal bigDecimal2, Integer num) {
        return e1.I(bigDecimal2) ? BigDecimal.ZERO : num != null ? bigDecimal.divide(bigDecimal2, num.intValue(), RoundingMode.HALF_EVEN) : bigDecimal.divide(bigDecimal2, MathContext.DECIMAL128);
    }

    public final ej0.b a(g side, BigDecimal quantity, BigDecimal baseRate, TradingOrderExitStrategy strategy, n0 strategyType, xi0.b instrumentCurrency) {
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(strategyType, "strategyType");
        Intrinsics.checkNotNullParameter(instrumentCurrency, "instrumentCurrency");
        if (strategy instanceof TradingOrderExitStrategy.Amount) {
            return ((TradingOrderExitStrategy.Amount) strategy).f104662a;
        }
        if (strategy instanceof TradingOrderExitStrategy.Distance) {
            BigDecimal bigDecimalMultiply2 = ((TradingOrderExitStrategy.Distance) strategy).f104663a.multiply(baseRate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            BigDecimal bigDecimalMultiply3 = bigDecimalMultiply2.multiply(quantity);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply3, "multiply(...)");
            BigDecimal scale = bigDecimalMultiply3.setScale(instrumentCurrency.c(), RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            return new ej0.b(scale, instrumentCurrency);
        }
        if (!(strategy instanceof TradingOrderExitStrategy.Price)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = a.f241557a[side.ordinal()];
        if (i == 1) {
            int i2 = a.f241558b[strategyType.ordinal()];
            if (i2 == 1) {
                BigDecimal bigDecimalSubtract = ((TradingOrderExitStrategy.Price) strategy).f104664a.f126703a.subtract(baseRate);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                bigDecimalMultiply = bigDecimalSubtract.multiply(quantity);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalSubtract2 = baseRate.subtract(((TradingOrderExitStrategy.Price) strategy).f104664a.f126703a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                bigDecimalMultiply = bigDecimalSubtract2.multiply(quantity);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = a.f241558b[strategyType.ordinal()];
            if (i3 == 1) {
                BigDecimal bigDecimalSubtract3 = baseRate.subtract(((TradingOrderExitStrategy.Price) strategy).f104664a.f126703a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
                bigDecimalMultiply = bigDecimalSubtract3.multiply(quantity);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalSubtract4 = ((TradingOrderExitStrategy.Price) strategy).f104664a.f126703a.subtract(baseRate);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract4, "subtract(...)");
                bigDecimalMultiply = bigDecimalSubtract4.multiply(quantity);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
        }
        BigDecimal scale2 = bigDecimalMultiply.setScale(instrumentCurrency.c(), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
        return new ej0.b(scale2, instrumentCurrency);
    }

    public final BigDecimal b(g side, BigDecimal quantity, BigDecimal baseRate, TradingOrderExitStrategy strategy, n0 strategyType) {
        BigDecimal bigDecimalD;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(strategyType, "strategyType");
        if (strategy instanceof TradingOrderExitStrategy.Amount) {
            BigDecimal bigDecimalD2 = d(((TradingOrderExitStrategy.Amount) strategy).f104662a.f126703a, quantity, null);
            Intrinsics.checkNotNullExpressionValue(bigDecimalD2, "divideSafe$default(...)");
            BigDecimal bigDecimalD3 = d(bigDecimalD2, baseRate, 4);
            Intrinsics.checkNotNullExpressionValue(bigDecimalD3, "divideSafe(...)");
            return bigDecimalD3;
        }
        if (strategy instanceof TradingOrderExitStrategy.Distance) {
            return ((TradingOrderExitStrategy.Distance) strategy).f104663a;
        }
        if (!(strategy instanceof TradingOrderExitStrategy.Price)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = a.f241557a[side.ordinal()];
        if (i == 1) {
            int i2 = a.f241558b[strategyType.ordinal()];
            if (i2 == 1) {
                BigDecimal bigDecimalSubtract = ((TradingOrderExitStrategy.Price) strategy).f104664a.f126703a.subtract(baseRate);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                bigDecimalD = d(bigDecimalSubtract, baseRate, 4);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalSubtract2 = baseRate.subtract(((TradingOrderExitStrategy.Price) strategy).f104664a.f126703a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                bigDecimalD = d(bigDecimalSubtract2, baseRate, 4);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = a.f241558b[strategyType.ordinal()];
            if (i3 == 1) {
                BigDecimal bigDecimalSubtract3 = baseRate.subtract(((TradingOrderExitStrategy.Price) strategy).f104664a.f126703a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "subtract(...)");
                bigDecimalD = d(bigDecimalSubtract3, baseRate, 4);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimalSubtract4 = ((TradingOrderExitStrategy.Price) strategy).f104664a.f126703a.subtract(baseRate);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract4, "subtract(...)");
                bigDecimalD = d(bigDecimalSubtract4, baseRate, 4);
            }
        }
        Intrinsics.h(bigDecimalD);
        return bigDecimalD;
    }

    public final ej0.b c(g side, BigDecimal quantity, BigDecimal baseRate, n0 strategyType, TradingOrderExitStrategy strategy, xi0.b instrumentCurrency, int i) {
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalAdd;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(strategyType, "strategyType");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(instrumentCurrency, "instrumentCurrency");
        if (strategy instanceof TradingOrderExitStrategy.Amount) {
            int i2 = a.f241558b[strategyType.ordinal()];
            if (i2 == 1) {
                int i3 = a.f241557a[side.ordinal()];
                if (i3 == 1) {
                    BigDecimal bigDecimalD = d(((TradingOrderExitStrategy.Amount) strategy).f104662a.f126703a, quantity, null);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalD, "divideSafe$default(...)");
                    bigDecimalAdd = baseRate.add(bigDecimalD);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BigDecimal bigDecimalD2 = d(((TradingOrderExitStrategy.Amount) strategy).f104662a.f126703a, quantity, null);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalD2, "divideSafe$default(...)");
                    bigDecimalAdd = baseRate.subtract(bigDecimalD2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "subtract(...)");
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = a.f241557a[side.ordinal()];
                if (i5 == 1) {
                    BigDecimal bigDecimalD3 = d(((TradingOrderExitStrategy.Amount) strategy).f104662a.f126703a, quantity, null);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalD3, "divideSafe$default(...)");
                    bigDecimalAdd = baseRate.subtract(bigDecimalD3);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "subtract(...)");
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BigDecimal bigDecimalD4 = d(((TradingOrderExitStrategy.Amount) strategy).f104662a.f126703a, quantity, null);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalD4, "divideSafe$default(...)");
                    bigDecimalAdd = baseRate.add(bigDecimalD4);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                }
            }
            BigDecimal scale = bigDecimalAdd.setScale(i, RoundingMode.HALF_EVEN);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            return new ej0.b(scale, instrumentCurrency);
        }
        if (!(strategy instanceof TradingOrderExitStrategy.Distance)) {
            if (strategy instanceof TradingOrderExitStrategy.Price) {
                return ((TradingOrderExitStrategy.Price) strategy).f104664a;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i6 = a.f241558b[strategyType.ordinal()];
        if (i6 == 1) {
            int i21 = a.f241557a[side.ordinal()];
            if (i21 == 1) {
                BigDecimal bigDecimal = ((TradingOrderExitStrategy.Distance) strategy).f104663a;
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                BigDecimal bigDecimalAdd2 = ONE.add(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                bigDecimalMultiply = baseRate.multiply(bigDecimalAdd2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimal2 = ((TradingOrderExitStrategy.Distance) strategy).f104663a;
                BigDecimal ONE2 = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
                BigDecimal bigDecimalSubtract = ONE2.subtract(bigDecimal2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                bigDecimalMultiply = baseRate.multiply(bigDecimalSubtract);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i22 = a.f241557a[side.ordinal()];
            if (i22 == 1) {
                BigDecimal bigDecimal3 = ((TradingOrderExitStrategy.Distance) strategy).f104663a;
                BigDecimal ONE3 = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE3, "ONE");
                BigDecimal bigDecimalSubtract2 = ONE3.subtract(bigDecimal3);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                bigDecimalMultiply = baseRate.multiply(bigDecimalSubtract2);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            } else {
                if (i22 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                BigDecimal bigDecimal4 = ((TradingOrderExitStrategy.Distance) strategy).f104663a;
                BigDecimal ONE4 = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE4, "ONE");
                BigDecimal bigDecimalAdd3 = ONE4.add(bigDecimal4);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd3, "add(...)");
                bigDecimalMultiply = baseRate.multiply(bigDecimalAdd3);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            }
        }
        BigDecimal scale2 = bigDecimalMultiply.setScale(i, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
        return new ej0.b(scale2, instrumentCurrency);
    }
}
