package atl;

import aii.r;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f9095a;

    public b(InvestOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f9095a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f9095a, ((b) obj2).f9095a);
    }

    public final int hashCode() {
        return this.f9095a.hashCode();
    }
}
