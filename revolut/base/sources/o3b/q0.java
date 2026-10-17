package o3b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2b.b f221759a;

    public q0(q2b.b priceCalculator) {
        Intrinsics.checkNotNullParameter(priceCalculator, "priceCalculator");
        this.f221759a = priceCalculator;
    }

    public final BigDecimal a(k4l.n0 n0Var, TradingOrderExitStrategy tradingOrderExitStrategy, bfl.g gVar, o0 o0Var, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, xi0.b bVar) {
        boolean z = tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Amount;
        q2b.b bVar2 = this.f221759a;
        if (z) {
            int i = p0.f221757c[o0Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimal3 = BigDecimal.ZERO;
            }
            Intrinsics.h(bigDecimal3);
            bigDecimal3 = bVar2.a(gVar, bigDecimal, bigDecimal2, new TradingOrderExitStrategy.Price(new ej0.b(bigDecimal3, bVar)), n0Var, bVar).f126703a;
        } else if (tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Distance) {
            int i2 = p0.f221757c[o0Var.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimal3 = BigDecimal.ZERO;
            }
            Intrinsics.h(bigDecimal3);
            bigDecimal3 = bVar2.b(gVar, bigDecimal, bigDecimal2, new TradingOrderExitStrategy.Price(new ej0.b(bigDecimal3, bVar)), n0Var);
        } else {
            if (!(tradingOrderExitStrategy instanceof TradingOrderExitStrategy.Price)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = p0.f221757c[o0Var.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimal3 = bigDecimal4;
            }
        }
        return bigDecimal3.max(BigDecimal.ZERO);
    }
}
