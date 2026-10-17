package hul;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f155749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ztl.a f155750b;

    public n(InvestOrder order, ztl.a aVar) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f155749a = order;
        this.f155750b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f155749a, nVar.f155749a) && Intrinsics.f(this.f155750b, nVar.f155750b);
    }

    public final int hashCode() {
        int iHashCode = this.f155749a.hashCode() * 31;
        ztl.a aVar = this.f155750b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
