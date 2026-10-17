package tsl;

import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestFundOrder f274172a;

    public b(InvestFundOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f274172a = investOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f274172a, ((b) obj2).f274172a);
    }

    public final int hashCode() {
        return this.f274172a.hashCode();
    }
}
