package hxb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u001f\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b&\u0010\tR\u001c\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0007\u001a\u0004\b\u0019\u0010\t¨\u0006)"}, d2 = {"Lhxb/g;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "cashForCardSpend", "b", "Ljava/lang/String;", "h", "pointsForCardSpend", "k", "pointsToMilesRatio", "d", "cashForSpareChange", "e", "j", "pointsForSpareChange", "f", "bonusPoints", "Lhxb/h;", "g", "Lhxb/h;", "()Lhxb/h;", "booster", "plan", "Lhxb/l0;", "i", "Lhxb/l0;", "m", "()Lhxb/l0;", "yearlySavings", "pointsForPocketYearly", "milesForBonusPoints", "l", "staysDiscountForBonusPoints", "planUpgradeSpendThreshold", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashForCardSpend")
    @NotNull
    private final jo3.a cashForCardSpend;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsForCardSpend")
    @NotNull
    private final String pointsForCardSpend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsToMilesRatio")
    @NotNull
    private final String pointsToMilesRatio;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cashForSpareChange")
    private final jo3.a cashForSpareChange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pointsForSpareChange")
    private final String pointsForSpareChange;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("bonusPoints")
    private final String bonusPoints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("booster")
    private final h booster;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("plan")
    @NotNull
    private final String plan;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("yearlySavings")
    private final l0 yearlySavings;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsForPocketYearly")
    private final jo3.a pointsForPocketYearly;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("milesForBonusPoints")
    private final String milesForBonusPoints;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("staysDiscountForBonusPoints")
    private final jo3.a staysDiscountForBonusPoints;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("planUpgradeSpendThreshold")
    private final jo3.a planUpgradeSpendThreshold;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBonusPoints() {
        return this.bonusPoints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getBooster() {
        return this.booster;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getCashForCardSpend() {
        return this.cashForCardSpend;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getCashForSpareChange() {
        return this.cashForSpareChange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMilesForBonusPoints() {
        return this.milesForBonusPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.cashForCardSpend, gVar.cashForCardSpend) && Intrinsics.f(this.pointsForCardSpend, gVar.pointsForCardSpend) && Intrinsics.f(this.pointsToMilesRatio, gVar.pointsToMilesRatio) && Intrinsics.f(this.cashForSpareChange, gVar.cashForSpareChange) && Intrinsics.f(this.pointsForSpareChange, gVar.pointsForSpareChange) && Intrinsics.f(this.bonusPoints, gVar.bonusPoints) && Intrinsics.f(this.booster, gVar.booster) && Intrinsics.f(this.plan, gVar.plan) && Intrinsics.f(this.yearlySavings, gVar.yearlySavings) && Intrinsics.f(this.pointsForPocketYearly, gVar.pointsForPocketYearly) && Intrinsics.f(this.milesForBonusPoints, gVar.milesForBonusPoints) && Intrinsics.f(this.staysDiscountForBonusPoints, gVar.staysDiscountForBonusPoints) && Intrinsics.f(this.planUpgradeSpendThreshold, gVar.planUpgradeSpendThreshold);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getPlanUpgradeSpendThreshold() {
        return this.planUpgradeSpendThreshold;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPointsForCardSpend() {
        return this.pointsForCardSpend;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.cashForCardSpend.hashCode() * 31, 31, this.pointsForCardSpend), 31, this.pointsToMilesRatio);
        jo3.a aVar = this.cashForSpareChange;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.pointsForSpareChange;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bonusPoints;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar = this.booster;
        int iC2 = p.a.c((iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.plan);
        l0 l0Var = this.yearlySavings;
        int iHashCode4 = (iC2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        jo3.a aVar2 = this.pointsForPocketYearly;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str3 = this.milesForBonusPoints;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jo3.a aVar3 = this.staysDiscountForBonusPoints;
        int iHashCode7 = (iHashCode6 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.planUpgradeSpendThreshold;
        return iHashCode7 + (aVar4 != null ? aVar4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getPointsForPocketYearly() {
        return this.pointsForPocketYearly;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPointsForSpareChange() {
        return this.pointsForSpareChange;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPointsToMilesRatio() {
        return this.pointsToMilesRatio;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final jo3.a getStaysDiscountForBonusPoints() {
        return this.staysDiscountForBonusPoints;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final l0 getYearlySavings() {
        return this.yearlySavings;
    }
}
