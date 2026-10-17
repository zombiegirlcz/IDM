package wtl;

import aii.r;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f300036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ztl.a f300037b;

    public d(InvestOrder investOrder, ztl.a aVar) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        this.f300036a = investOrder;
        this.f300037b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f300036a, dVar.f300036a) && Intrinsics.f(this.f300037b, dVar.f300037b);
    }

    public final int hashCode() {
        int iHashCode = this.f300036a.hashCode() * 31;
        ztl.a aVar = this.f300037b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
