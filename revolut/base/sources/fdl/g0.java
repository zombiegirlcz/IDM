package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\nR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\nR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u0014"}, d2 = {"Lfdl/g0;", "", "", "toString", "()Ljava/lang/String;", "Lfdl/b0;", "Lfdl/n0;", "a", "Lfdl/b0;", "d", "()Lfdl/b0;", "strategies", "Lfdl/m0;", "b", "c", "sectors", "Lfdl/l0;", "regions", "Lfdl/c0;", "assets", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("strategies")
    private final b0<n0> strategies;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sectors")
    private final b0<m0> sectors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("regions")
    private final b0<l0> regions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("assets")
    private final b0<c0> assets;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getAssets() {
        return this.assets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getRegions() {
        return this.regions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getSectors() {
        return this.sectors;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getStrategies() {
        return this.strategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.strategies, g0Var.strategies) && Intrinsics.f(this.sectors, g0Var.sectors) && Intrinsics.f(this.regions, g0Var.regions) && Intrinsics.f(this.assets, g0Var.assets);
    }

    public final int hashCode() {
        b0<n0> b0Var = this.strategies;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        b0<m0> b0Var2 = this.sectors;
        int iHashCode2 = (iHashCode + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        b0<l0> b0Var3 = this.regions;
        int iHashCode3 = (iHashCode2 + (b0Var3 == null ? 0 : b0Var3.hashCode())) * 31;
        b0<c0> b0Var4 = this.assets;
        return iHashCode3 + (b0Var4 != null ? b0Var4.hashCode() : 0);
    }
}
