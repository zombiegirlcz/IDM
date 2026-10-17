package hcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\nR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\nR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u0014"}, d2 = {"Lhcl/v;", "", "", "toString", "()Ljava/lang/String;", "", "Lhcl/d0;", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "strategies", "Lhcl/b0;", "b", "c", "sectors", "Lhcl/a0;", "regions", "Lhcl/r;", "assets", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("strategies")
    private final List<d0> strategies;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sectors")
    private final List<b0> sectors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("regions")
    private final List<a0> regions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("assets")
    private final List<r> assets;

    public v(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.strategies = arrayList;
        this.sectors = arrayList2;
        this.regions = arrayList3;
        this.assets = arrayList4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAssets() {
        return this.assets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getRegions() {
        return this.regions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSectors() {
        return this.sectors;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getStrategies() {
        return this.strategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.strategies, vVar.strategies) && Intrinsics.f(this.sectors, vVar.sectors) && Intrinsics.f(this.regions, vVar.regions) && Intrinsics.f(this.assets, vVar.assets);
    }

    public final int hashCode() {
        List<d0> list = this.strategies;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<b0> list2 = this.sectors;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<a0> list3 = this.regions;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<r> list4 = this.assets;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }
}
