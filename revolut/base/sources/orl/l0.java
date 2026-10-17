package orl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lorl/l0;", "", "", "toString", "()Ljava/lang/String;", "Lorl/k0;", "a", "Lorl/k0;", "b", "()Lorl/k0;", "market", "limit", "c", "stop", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("MARKET")
    private final k0 market;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("LIMIT")
    private final k0 limit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("STOP")
    private final k0 stop;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k0 getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k0 getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k0 getStop() {
        return this.stop;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.market, l0Var.market) && Intrinsics.f(this.limit, l0Var.limit) && Intrinsics.f(this.stop, l0Var.stop);
    }

    public final int hashCode() {
        k0 k0Var = this.market;
        int iHashCode = (k0Var == null ? 0 : k0Var.hashCode()) * 31;
        k0 k0Var2 = this.limit;
        int iHashCode2 = (iHashCode + (k0Var2 == null ? 0 : k0Var2.hashCode())) * 31;
        k0 k0Var3 = this.stop;
        return iHashCode2 + (k0Var3 != null ? k0Var3.hashCode() : 0);
    }
}
