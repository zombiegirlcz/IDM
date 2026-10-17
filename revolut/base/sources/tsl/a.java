package tsl;

import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestCommodityOrder f274171a;

    public a(InvestCommodityOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f274171a = investOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f274171a, ((a) obj2).f274171a);
    }

    public final int hashCode() {
        return this.f274171a.hashCode();
    }
}
