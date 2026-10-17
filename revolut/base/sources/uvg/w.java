package uvg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wvg.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0017"}, d2 = {"Luvg/w;", "Lwvg/z0;", "", "toString", "()Ljava/lang/String;", "Luvg/u;", "a", "Luvg/u;", "b", "()Luvg/u;", "chart", "Luvg/v;", "Luvg/v;", "d", "()Luvg/v;", "livePoint", "Luvg/t;", "c", "Luvg/t;", "()Luvg/t;", "livePeriod", "Ljava/lang/String;", "lastModified", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("modifiedChart")
    private final u chart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("livePoint")
    private final v livePoint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("livePeriod")
    private final t livePeriod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("lastModified")
    private final String lastModified;

    @Override // wvg.z0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLastModified() {
        return this.lastModified;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getChart() {
        return this.chart;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t getLivePeriod() {
        return this.livePeriod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getLivePoint() {
        return this.livePoint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.chart, wVar.chart) && Intrinsics.f(this.livePoint, wVar.livePoint) && Intrinsics.f(this.livePeriod, wVar.livePeriod) && Intrinsics.f(this.lastModified, wVar.lastModified);
    }

    public final int hashCode() {
        u uVar = this.chart;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        v vVar = this.livePoint;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        t tVar = this.livePeriod;
        int iHashCode3 = (iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.lastModified;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
