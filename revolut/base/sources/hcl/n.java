package hcl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lhcl/n;", "", "", "toString", "()Ljava/lang/String;", "", "Lhcl/l;", "a", "Ljava/util/List;", "()Ljava/util/List;", "countriesAllocation", "Lhcl/b3;", "b", "sectorsAllocation", "Lhcl/h0;", "c", "topHoldingsAllocation", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("countriesAllocation")
    private final List<l> countriesAllocation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sectorsAllocation")
    private final List<b3> sectorsAllocation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("topHoldingsAllocation")
    private final List<h0> topHoldingsAllocation;

    public n(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.countriesAllocation = arrayList;
        this.sectorsAllocation = arrayList2;
        this.topHoldingsAllocation = arrayList3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCountriesAllocation() {
        return this.countriesAllocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSectorsAllocation() {
        return this.sectorsAllocation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getTopHoldingsAllocation() {
        return this.topHoldingsAllocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.countriesAllocation, nVar.countriesAllocation) && Intrinsics.f(this.sectorsAllocation, nVar.sectorsAllocation) && Intrinsics.f(this.topHoldingsAllocation, nVar.topHoldingsAllocation);
    }

    public final int hashCode() {
        List<l> list = this.countriesAllocation;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<b3> list2 = this.sectorsAllocation;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<h0> list3 = this.topHoldingsAllocation;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
