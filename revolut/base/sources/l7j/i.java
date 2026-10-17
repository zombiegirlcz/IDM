package l7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.CommodityExchangeResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityExchangeResult f192673a;

    public i(CommodityExchangeResult exchangeResult) {
        Intrinsics.checkNotNullParameter(exchangeResult, "exchangeResult");
        this.f192673a = exchangeResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f192673a, ((i) obj2).f192673a);
    }

    public final int hashCode() {
        return this.f192673a.hashCode();
    }
}
