package uvg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wvg.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Luvg/m;", "Lwvg/z0;", "", "toString", "()Ljava/lang/String;", "Luvg/l;", "a", "Luvg/l;", "b", "()Luvg/l;", "chart", "Ljava/lang/String;", "lastModified", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("modifiedPortfolioPerformance")
    private final l chart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastModified")
    private final String lastModified;

    @Override // wvg.z0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLastModified() {
        return this.lastModified;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getChart() {
        return this.chart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.chart, mVar.chart) && Intrinsics.f(this.lastModified, mVar.lastModified);
    }

    public final int hashCode() {
        l lVar = this.chart;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        String str = this.lastModified;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
