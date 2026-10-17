package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lpcl/v;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "grossMarginRfy", "b", "c", "operatingMarginRfy", "netProfitMarginRfy", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("grossMarginRfy")
    private final Double grossMarginRfy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("operatingMarginRfy")
    private final Double operatingMarginRfy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("netProfitMarginRfy")
    private final Double netProfitMarginRfy;

    public v(Double d, Double d5, Double d6) {
        this.grossMarginRfy = d;
        this.operatingMarginRfy = d5;
        this.netProfitMarginRfy = d6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getGrossMarginRfy() {
        return this.grossMarginRfy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getNetProfitMarginRfy() {
        return this.netProfitMarginRfy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getOperatingMarginRfy() {
        return this.operatingMarginRfy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.grossMarginRfy, vVar.grossMarginRfy) && Intrinsics.f(this.operatingMarginRfy, vVar.operatingMarginRfy) && Intrinsics.f(this.netProfitMarginRfy, vVar.netProfitMarginRfy);
    }

    public final int hashCode() {
        Double d = this.grossMarginRfy;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.operatingMarginRfy;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.netProfitMarginRfy;
        return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
    }
}
