package ndf;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f214362a;

    public b(InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f214362a = investOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f214362a, ((b) obj2).f214362a);
    }

    public final int hashCode() {
        return this.f214362a.hashCode();
    }
}
