package tsl;

import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestMarginOrder f274176a;

    public h(InvestMarginOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f274176a = investOrder;
    }

    @Override // tsl.f
    public final InvestOrder a() {
        return this.f274176a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f274176a, ((h) obj2).f274176a);
    }

    public final int hashCode() {
        return this.f274176a.hashCode();
    }
}
