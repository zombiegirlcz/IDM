package tsl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder.InvestSecuritiesOrder f274174a;

    public d(InvestOrder.InvestSecuritiesOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f274174a = investOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f274174a, ((d) obj2).f274174a);
    }

    public final int hashCode() {
        return this.f274174a.hashCode();
    }
}
