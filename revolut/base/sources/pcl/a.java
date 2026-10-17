package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lpcl/a;", "", "", "toString", "()Ljava/lang/String;", "Lko3/b;", "a", "Lko3/b;", "()Lko3/b;", "dailyOpenPricePrecise", "Lpcl/f;", "b", "Lpcl/f;", "()Lpcl/f;", "dayRangePrecise", "c", "fiftyTwoWeekRangePrecise", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dailyOpenPricePrecise")
    private final ko3.b dailyOpenPricePrecise;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dayRangePrecise")
    private final f dayRangePrecise;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fiftyTwoWeekRangePrecise")
    private final f fiftyTwoWeekRangePrecise;

    public a(ko3.b bVar, f fVar, f fVar2) {
        this.dailyOpenPricePrecise = bVar;
        this.dayRangePrecise = fVar;
        this.fiftyTwoWeekRangePrecise = fVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ko3.b getDailyOpenPricePrecise() {
        return this.dailyOpenPricePrecise;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getDayRangePrecise() {
        return this.dayRangePrecise;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getFiftyTwoWeekRangePrecise() {
        return this.fiftyTwoWeekRangePrecise;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.dailyOpenPricePrecise, aVar.dailyOpenPricePrecise) && Intrinsics.f(this.dayRangePrecise, aVar.dayRangePrecise) && Intrinsics.f(this.fiftyTwoWeekRangePrecise, aVar.fiftyTwoWeekRangePrecise);
    }

    public final int hashCode() {
        ko3.b bVar = this.dailyOpenPricePrecise;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        f fVar = this.dayRangePrecise;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.fiftyTwoWeekRangePrecise;
        return iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0);
    }
}
