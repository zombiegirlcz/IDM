package b4b;

import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f12239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfl.g f12240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2b.a f12241c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final ExpiryDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f12242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TradingOrderExitStrategies f12243h;

    public r(BigDecimal draftMarginChange, bfl.g side, e2b.a orderTypeToShow, BigDecimal assetQuantity, BigDecimal targetRate, ExpiryDate expiryDate, List availableExitStrategies, TradingOrderExitStrategies tradingOrderExitStrategies) {
        Intrinsics.checkNotNullParameter(draftMarginChange, "draftMarginChange");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(orderTypeToShow, "orderTypeToShow");
        Intrinsics.checkNotNullParameter(assetQuantity, "assetQuantity");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(availableExitStrategies, "availableExitStrategies");
        this.f12239a = draftMarginChange;
        this.f12240b = side;
        this.f12241c = orderTypeToShow;
        this.d = assetQuantity;
        this.e = targetRate;
        this.f = expiryDate;
        this.f12242g = availableExitStrategies;
        this.f12243h = tradingOrderExitStrategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f12239a, rVar.f12239a) && this.f12240b == rVar.f12240b && this.f12241c == rVar.f12241c && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f12242g, rVar.f12242g) && Intrinsics.f(this.f12243h, rVar.f12243h);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.e, t61.a.d(this.d, (this.f12241c.hashCode() + wp5.y.b(this.f12240b, this.f12239a.hashCode() * 31, 31)) * 31, 31), 31);
        ExpiryDate expiryDate = this.f;
        int iD2 = p.a.d((iD + (expiryDate == null ? 0 : expiryDate.hashCode())) * 31, 31, this.f12242g);
        TradingOrderExitStrategies tradingOrderExitStrategies = this.f12243h;
        return iD2 + (tradingOrderExitStrategies != null ? tradingOrderExitStrategies.hashCode() : 0);
    }
}
