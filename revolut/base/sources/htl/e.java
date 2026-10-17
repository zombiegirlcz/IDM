package htl;

import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderExtended f155460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestOrdersParams f155461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155462c;

    public e(InvestOrderExtended order, InvestOrdersParams filter, boolean z) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f155460a = order;
        this.f155461b = filter;
        this.f155462c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f155460a, eVar.f155460a) && Intrinsics.f(this.f155461b, eVar.f155461b) && this.f155462c == eVar.f155462c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f155462c) + ((this.f155461b.hashCode() + (this.f155460a.hashCode() * 31)) * 31);
    }
}
