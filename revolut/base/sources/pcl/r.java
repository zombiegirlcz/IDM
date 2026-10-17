package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lpcl/r;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "returnOnEquityRfy", "returnOnAssetsRfy", "c", "returnOnInvestmentRfy", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("returnOnEquityRfy")
    private final Double returnOnEquityRfy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("returnOnAssetsRfy")
    private final Double returnOnAssetsRfy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("returnOnInvestmentRfy")
    private final Double returnOnInvestmentRfy;

    public r(Double d, Double d5, Double d6) {
        this.returnOnEquityRfy = d;
        this.returnOnAssetsRfy = d5;
        this.returnOnInvestmentRfy = d6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getReturnOnAssetsRfy() {
        return this.returnOnAssetsRfy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getReturnOnEquityRfy() {
        return this.returnOnEquityRfy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getReturnOnInvestmentRfy() {
        return this.returnOnInvestmentRfy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.returnOnEquityRfy, rVar.returnOnEquityRfy) && Intrinsics.f(this.returnOnAssetsRfy, rVar.returnOnAssetsRfy) && Intrinsics.f(this.returnOnInvestmentRfy, rVar.returnOnInvestmentRfy);
    }

    public final int hashCode() {
        Double d = this.returnOnEquityRfy;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.returnOnAssetsRfy;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.returnOnInvestmentRfy;
        return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
    }
}
