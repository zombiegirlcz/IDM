package k4l;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f180990a;

    public l(InvestOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f180990a = order;
    }

    @Override // k4l.p
    public final InvestOrder a() {
        return this.f180990a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f180990a, ((l) obj2).f180990a);
    }

    public final int hashCode() {
        return this.f180990a.hashCode();
    }
}
