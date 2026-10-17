package icl;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0014"}, d2 = {"Licl/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "d", "()J", "start", "b", "c", "end", "Lko3/b;", "Lko3/b;", "()Lko3/b;", "baseline", "Ljava/lang/String;", "baselineYtm", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    private final long start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    private final long end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseline")
    private final ko3.b baseline;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("baselineYtm")
    private final String baselineYtm;

    public a(long j2, long j3, ko3.b bVar, String str) {
        this.start = j2;
        this.end = j3;
        this.baseline = bVar;
        this.baselineYtm = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ko3.b getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBaselineYtm() {
        return this.baselineYtm;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.start == aVar.start && this.end == aVar.end && Intrinsics.f(this.baseline, aVar.baseline) && Intrinsics.f(this.baselineYtm, aVar.baselineYtm);
    }

    public final int hashCode() {
        int iC = d.c(Long.hashCode(this.start) * 31, 31, this.end);
        ko3.b bVar = this.baseline;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.baselineYtm;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
