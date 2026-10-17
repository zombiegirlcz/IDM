package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lpcl/i;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "b", "()Ljo3/b;", "incomeDividend", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "dividendYield", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("incomeDividend")
    private final jo3.b incomeDividend;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dividendYield")
    private final Double dividendYield;

    public i(jo3.b bVar, Double d) {
        this.incomeDividend = bVar;
        this.dividendYield = d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getDividendYield() {
        return this.dividendYield;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getIncomeDividend() {
        return this.incomeDividend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.incomeDividend, iVar.incomeDividend) && Intrinsics.f(this.dividendYield, iVar.dividendYield);
    }

    public final int hashCode() {
        jo3.b bVar = this.incomeDividend;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Double d = this.dividendYield;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }
}
