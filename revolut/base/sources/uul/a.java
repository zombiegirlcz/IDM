package uul;

import aii.r;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f283244a;

    public a(InvestOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f283244a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f283244a, ((a) obj2).f283244a);
    }

    public final int hashCode() {
        return this.f283244a.hashCode();
    }
}
