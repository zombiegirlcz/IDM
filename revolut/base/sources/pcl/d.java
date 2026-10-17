package pcl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lpcl/d;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "dailyOpen", "Lpcl/g;", "b", "Lpcl/g;", "()Lpcl/g;", "dayRange", "c", "fiftyTwoWeekRange", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dailyOpen")
    private final BigDecimal dailyOpen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dayRange")
    private final g dayRange;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fiftyTwoWeekRange")
    private final g fiftyTwoWeekRange;

    public d(BigDecimal bigDecimal, g gVar, g gVar2) {
        this.dailyOpen = bigDecimal;
        this.dayRange = gVar;
        this.fiftyTwoWeekRange = gVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getDailyOpen() {
        return this.dailyOpen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getDayRange() {
        return this.dayRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getFiftyTwoWeekRange() {
        return this.fiftyTwoWeekRange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.dailyOpen, dVar.dailyOpen) && Intrinsics.f(this.dayRange, dVar.dayRange) && Intrinsics.f(this.fiftyTwoWeekRange, dVar.fiftyTwoWeekRange);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.dailyOpen;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        g gVar = this.dayRange;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.fiftyTwoWeekRange;
        return iHashCode2 + (gVar2 != null ? gVar2.hashCode() : 0);
    }
}
