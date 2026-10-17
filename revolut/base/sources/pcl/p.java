package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lpcl/p;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "dividendYield", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "dividendPerShareRfy", "c", "payoutRatio", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dividendYield")
    private final Double dividendYield;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dividendPerShareRfy")
    private final jo3.b dividendPerShareRfy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("payoutRatio")
    private final Double payoutRatio;

    public p(Double d, jo3.b bVar, Double d5) {
        this.dividendYield = d;
        this.dividendPerShareRfy = bVar;
        this.payoutRatio = d5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getDividendPerShareRfy() {
        return this.dividendPerShareRfy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getDividendYield() {
        return this.dividendYield;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getPayoutRatio() {
        return this.payoutRatio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.dividendYield, pVar.dividendYield) && Intrinsics.f(this.dividendPerShareRfy, pVar.dividendPerShareRfy) && Intrinsics.f(this.payoutRatio, pVar.payoutRatio);
    }

    public final int hashCode() {
        Double d = this.dividendYield;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        jo3.b bVar = this.dividendPerShareRfy;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Double d5 = this.payoutRatio;
        return iHashCode2 + (d5 != null ? d5.hashCode() : 0);
    }
}
