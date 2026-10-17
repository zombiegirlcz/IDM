package uvg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wvg.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Luvg/z;", "Lwvg/z0;", "", "toString", "()Ljava/lang/String;", "Luvg/x;", "a", "Luvg/x;", "b", "()Luvg/x;", "chart", "Ljava/lang/String;", "lastModified", "Luvg/y;", "c", "Luvg/y;", "()Luvg/y;", "livePoint", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("modifiedChart")
    private final x chart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastModified")
    private final String lastModified;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("livePoint")
    private final y livePoint;

    @Override // wvg.z0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLastModified() {
        return this.lastModified;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final x getChart() {
        return this.chart;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final y getLivePoint() {
        return this.livePoint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.chart, zVar.chart) && Intrinsics.f(this.lastModified, zVar.lastModified) && Intrinsics.f(this.livePoint, zVar.livePoint);
    }

    public final int hashCode() {
        x xVar = this.chart;
        int iHashCode = (xVar == null ? 0 : xVar.hashCode()) * 31;
        String str = this.lastModified;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        y yVar = this.livePoint;
        return iHashCode2 + (yVar != null ? yVar.hashCode() : 0);
    }
}
