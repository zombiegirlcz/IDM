package o3b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingOrderExitStrategy f221715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingOrderExitStrategy f221716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k4l.m0 f221717c;

    public b0(TradingOrderExitStrategy tradingOrderExitStrategy, TradingOrderExitStrategy tradingOrderExitStrategy2, k4l.m0 m0Var) {
        this.f221715a = tradingOrderExitStrategy;
        this.f221716b = tradingOrderExitStrategy2;
        this.f221717c = m0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f221715a, b0Var.f221715a) && Intrinsics.f(this.f221716b, b0Var.f221716b) && this.f221717c == b0Var.f221717c;
    }

    public final int hashCode() {
        TradingOrderExitStrategy tradingOrderExitStrategy = this.f221715a;
        int iHashCode = (tradingOrderExitStrategy == null ? 0 : tradingOrderExitStrategy.hashCode()) * 31;
        TradingOrderExitStrategy tradingOrderExitStrategy2 = this.f221716b;
        int iHashCode2 = (iHashCode + (tradingOrderExitStrategy2 == null ? 0 : tradingOrderExitStrategy2.hashCode())) * 31;
        k4l.m0 m0Var = this.f221717c;
        return iHashCode2 + (m0Var != null ? m0Var.hashCode() : 0);
    }
}
