package k4l;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f180992a;

    public n(InvestOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f180992a = order;
    }

    @Override // k4l.p
    public final InvestOrder a() {
        return this.f180992a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f180992a, ((n) obj2).f180992a);
    }

    public final int hashCode() {
        return this.f180992a.hashCode();
    }
}
