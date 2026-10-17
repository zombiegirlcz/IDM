package o3b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4l.n0 f221776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingOrderExitStrategy f221777b;

    public x(k4l.n0 strategyType, TradingOrderExitStrategy tradingOrderExitStrategy) {
        Intrinsics.checkNotNullParameter(strategyType, "strategyType");
        this.f221776a = strategyType;
        this.f221777b = tradingOrderExitStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f221776a == xVar.f221776a && Intrinsics.f(this.f221777b, xVar.f221777b);
    }

    public final int hashCode() {
        int iHashCode = this.f221776a.hashCode() * 31;
        TradingOrderExitStrategy tradingOrderExitStrategy = this.f221777b;
        return iHashCode + (tradingOrderExitStrategy == null ? 0 : tradingOrderExitStrategy.hashCode());
    }
}
