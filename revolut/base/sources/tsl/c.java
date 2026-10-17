package tsl;

import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestMutualFundOrder f274173a;

    public c(InvestMutualFundOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f274173a = investOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f274173a, ((c) obj2).f274173a);
    }

    public final int hashCode() {
        return this.f274173a.hashCode();
    }
}
