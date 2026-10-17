package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lpcl/j;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "grossExpenseRatio", "b", "netExpenseRatio", "c", "totalExpenseRatio", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("grossExpenseRatio")
    private final Double grossExpenseRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("netExpenseRatio")
    private final Double netExpenseRatio;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalExpenseRatio")
    private final Double totalExpenseRatio;

    public j(Double d, Double d5, Double d6) {
        this.grossExpenseRatio = d;
        this.netExpenseRatio = d5;
        this.totalExpenseRatio = d6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getGrossExpenseRatio() {
        return this.grossExpenseRatio;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getNetExpenseRatio() {
        return this.netExpenseRatio;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getTotalExpenseRatio() {
        return this.totalExpenseRatio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.grossExpenseRatio, jVar.grossExpenseRatio) && Intrinsics.f(this.netExpenseRatio, jVar.netExpenseRatio) && Intrinsics.f(this.totalExpenseRatio, jVar.totalExpenseRatio);
    }

    public final int hashCode() {
        Double d = this.grossExpenseRatio;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d5 = this.netExpenseRatio;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.totalExpenseRatio;
        return iHashCode2 + (d6 != null ? d6.hashCode() : 0);
    }
}
