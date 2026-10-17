package o3b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategy;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f221778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nel.n f221779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f221780c;
    public final BigDecimal d;
    public final bfl.g e;
    public final r2b.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TradingOrderExitStrategy f221781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TradingOrderExitStrategy f221782h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f221783j;

    public y(BigDecimal quantity, nel.n instrument, BigDecimal currentRate, BigDecimal baseRate, bfl.g tradeSide, r2b.c exitStrategyTarget, TradingOrderExitStrategy tradingOrderExitStrategy, TradingOrderExitStrategy tradingOrderExitStrategy2, String str, List availableExitStrategies) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(baseRate, "baseRate");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(exitStrategyTarget, "exitStrategyTarget");
        Intrinsics.checkNotNullParameter(availableExitStrategies, "availableExitStrategies");
        this.f221778a = quantity;
        this.f221779b = instrument;
        this.f221780c = currentRate;
        this.d = baseRate;
        this.e = tradeSide;
        this.f = exitStrategyTarget;
        this.f221781g = tradingOrderExitStrategy;
        this.f221782h = tradingOrderExitStrategy2;
        this.i = str;
        this.f221783j = availableExitStrategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f221778a, yVar.f221778a) && Intrinsics.f(this.f221779b, yVar.f221779b) && Intrinsics.f(this.f221780c, yVar.f221780c) && Intrinsics.f(this.d, yVar.d) && this.e == yVar.e && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f221781g, yVar.f221781g) && Intrinsics.f(this.f221782h, yVar.f221782h) && Intrinsics.f(this.i, yVar.i) && Intrinsics.f(this.f221783j, yVar.f221783j);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + wp5.y.b(this.e, t61.a.d(this.d, t61.a.d(this.f221780c, a10.b.d(this.f221779b, this.f221778a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        TradingOrderExitStrategy tradingOrderExitStrategy = this.f221781g;
        int iHashCode2 = (iHashCode + (tradingOrderExitStrategy == null ? 0 : tradingOrderExitStrategy.hashCode())) * 31;
        TradingOrderExitStrategy tradingOrderExitStrategy2 = this.f221782h;
        int iHashCode3 = (iHashCode2 + (tradingOrderExitStrategy2 == null ? 0 : tradingOrderExitStrategy2.hashCode())) * 31;
        String str = this.i;
        return this.f221783j.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
