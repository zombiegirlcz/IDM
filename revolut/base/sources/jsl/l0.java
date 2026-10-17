package jsl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f178222a;

    public l0(InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f178222a = investOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f178222a, ((l0) obj2).f178222a);
    }

    public final int hashCode() {
        return this.f178222a.hashCode();
    }
}
