package tsl;

import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOptionOrder f274175a;

    public e(InvestOptionOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f274175a = investOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f274175a, ((e) obj2).f274175a);
    }

    public final int hashCode() {
        return this.f274175a.hashCode();
    }
}
