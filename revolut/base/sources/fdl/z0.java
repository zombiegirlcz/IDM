package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfdl/z0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "f", "()Ljo3/a;", "volume", "", "b", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "unitVolume", "Lfdl/t2;", "c", "Lfdl/t2;", "()Lfdl/t2;", "dailyRange", "d", "fiftyTwoWeekRange", "fiveYearRange", "", "Z", "()Z", "highlyVolatile", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("volume")
    private final jo3.a volume;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("unitVolume")
    private final Long unitVolume;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dayRange")
    private final t2 dailyRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("52weekRange")
    private final t2 fiftyTwoWeekRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("5YearRange")
    private final t2 fiveYearRange;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("highlyVolatile")
    private final boolean highlyVolatile;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final t2 getDailyRange() {
        return this.dailyRange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t2 getFiftyTwoWeekRange() {
        return this.fiftyTwoWeekRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t2 getFiveYearRange() {
        return this.fiveYearRange;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHighlyVolatile() {
        return this.highlyVolatile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getUnitVolume() {
        return this.unitVolume;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.volume, z0Var.volume) && Intrinsics.f(this.unitVolume, z0Var.unitVolume) && Intrinsics.f(this.dailyRange, z0Var.dailyRange) && Intrinsics.f(this.fiftyTwoWeekRange, z0Var.fiftyTwoWeekRange) && Intrinsics.f(this.fiveYearRange, z0Var.fiveYearRange) && this.highlyVolatile == z0Var.highlyVolatile;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getVolume() {
        return this.volume;
    }

    public final int hashCode() {
        jo3.a aVar = this.volume;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Long l2 = this.unitVolume;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        t2 t2Var = this.dailyRange;
        int iHashCode3 = (iHashCode2 + (t2Var == null ? 0 : t2Var.hashCode())) * 31;
        t2 t2Var2 = this.fiftyTwoWeekRange;
        int iHashCode4 = (iHashCode3 + (t2Var2 == null ? 0 : t2Var2.hashCode())) * 31;
        t2 t2Var3 = this.fiveYearRange;
        return Boolean.hashCode(this.highlyVolatile) + ((iHashCode4 + (t2Var3 != null ? t2Var3.hashCode() : 0)) * 31);
    }
}
