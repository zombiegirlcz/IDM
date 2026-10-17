package tsl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder.InvestSecuritiesOrder f274177a;

    public i(InvestOrder.InvestSecuritiesOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f274177a = investOrder;
    }

    @Override // tsl.f
    public final InvestOrder a() {
        return this.f274177a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f274177a, ((i) obj2).f274177a);
    }

    public final int hashCode() {
        return this.f274177a.hashCode();
    }
}
