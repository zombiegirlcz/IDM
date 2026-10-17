package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Lpcl/u;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "b", "()Ljo3/b;", "dailyOpenPrice", "Lpcl/z;", "Lpcl/z;", "c", "()Lpcl/z;", "dayRange", "d", "fiftyTwoWeekRange", "e", "fiveYearRange", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "beta", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dailyOpenPrice")
    private final jo3.b dailyOpenPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dayRange")
    private final z dayRange;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fiftyTwoWeekRange")
    private final z fiftyTwoWeekRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fiveYearRange")
    private final z fiveYearRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("beta")
    private final Double beta;

    public u(jo3.b bVar, z zVar, z zVar2, z zVar3, Double d) {
        this.dailyOpenPrice = bVar;
        this.dayRange = zVar;
        this.fiftyTwoWeekRange = zVar2;
        this.fiveYearRange = zVar3;
        this.beta = d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getBeta() {
        return this.beta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getDailyOpenPrice() {
        return this.dailyOpenPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final z getDayRange() {
        return this.dayRange;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final z getFiftyTwoWeekRange() {
        return this.fiftyTwoWeekRange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final z getFiveYearRange() {
        return this.fiveYearRange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.dailyOpenPrice, uVar.dailyOpenPrice) && Intrinsics.f(this.dayRange, uVar.dayRange) && Intrinsics.f(this.fiftyTwoWeekRange, uVar.fiftyTwoWeekRange) && Intrinsics.f(this.fiveYearRange, uVar.fiveYearRange) && Intrinsics.f(this.beta, uVar.beta);
    }

    public final int hashCode() {
        jo3.b bVar = this.dailyOpenPrice;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        z zVar = this.dayRange;
        int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        z zVar2 = this.fiftyTwoWeekRange;
        int iHashCode3 = (iHashCode2 + (zVar2 == null ? 0 : zVar2.hashCode())) * 31;
        z zVar3 = this.fiveYearRange;
        int iHashCode4 = (iHashCode3 + (zVar3 == null ? 0 : zVar3.hashCode())) * 31;
        Double d = this.beta;
        return iHashCode4 + (d != null ? d.hashCode() : 0);
    }
}
