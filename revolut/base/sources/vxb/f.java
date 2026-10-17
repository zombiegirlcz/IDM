package vxb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u001f\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b&\u0010\tR\u001c\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0007\u001a\u0004\b\u0019\u0010\t¨\u0006)"}, d2 = {"Lvxb/f;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "c", "()Ljo3/b;", "cashForCardSpend", "b", "Ljava/lang/String;", "h", "pointsForCardSpend", "k", "pointsToMilesRatio", "d", "cashForSpareChange", "e", "j", "pointsForSpareChange", "f", "bonusPoints", "Lvxb/g;", "g", "Lvxb/g;", "()Lvxb/g;", "booster", "plan", "Lvxb/f0;", "i", "Lvxb/f0;", "m", "()Lvxb/f0;", "yearlySavings", "pointsForPocketYearly", "milesForBonusPoints", "l", "staysDiscountForBonusPoints", "planUpgradeSpendThreshold", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashForCardSpend")
    @NotNull
    private final jo3.b cashForCardSpend;

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
    private final jo3.b cashForSpareChange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pointsForSpareChange")
    private final String pointsForSpareChange;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("bonusPoints")
    private final String bonusPoints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("booster")
    private final g booster;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("plan")
    @NotNull
    private final String plan;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("yearlySavings")
    private final f0 yearlySavings;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsForPocketYearly")
    private final jo3.b pointsForPocketYearly;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("milesForBonusPoints")
    private final String milesForBonusPoints;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("staysDiscountForBonusPoints")
    private final jo3.b staysDiscountForBonusPoints;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("planUpgradeSpendThreshold")
    private final jo3.b planUpgradeSpendThreshold;

    public f(jo3.b cashForCardSpend, String pointsForCardSpend, String pointsToMilesRatio, jo3.b bVar, String str, String str2, g gVar, String plan, f0 f0Var, jo3.b bVar2, String str3, jo3.b bVar3, jo3.b bVar4) {
        Intrinsics.checkNotNullParameter(cashForCardSpend, "cashForCardSpend");
        Intrinsics.checkNotNullParameter(pointsForCardSpend, "pointsForCardSpend");
        Intrinsics.checkNotNullParameter(pointsToMilesRatio, "pointsToMilesRatio");
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.cashForCardSpend = cashForCardSpend;
        this.pointsForCardSpend = pointsForCardSpend;
        this.pointsToMilesRatio = pointsToMilesRatio;
        this.cashForSpareChange = bVar;
        this.pointsForSpareChange = str;
        this.bonusPoints = str2;
        this.booster = gVar;
        this.plan = plan;
        this.yearlySavings = f0Var;
        this.pointsForPocketYearly = bVar2;
        this.milesForBonusPoints = str3;
        this.staysDiscountForBonusPoints = bVar3;
        this.planUpgradeSpendThreshold = bVar4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBonusPoints() {
        return this.bonusPoints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getBooster() {
        return this.booster;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getCashForCardSpend() {
        return this.cashForCardSpend;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getCashForSpareChange() {
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
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.cashForCardSpend, fVar.cashForCardSpend) && Intrinsics.f(this.pointsForCardSpend, fVar.pointsForCardSpend) && Intrinsics.f(this.pointsToMilesRatio, fVar.pointsToMilesRatio) && Intrinsics.f(this.cashForSpareChange, fVar.cashForSpareChange) && Intrinsics.f(this.pointsForSpareChange, fVar.pointsForSpareChange) && Intrinsics.f(this.bonusPoints, fVar.bonusPoints) && Intrinsics.f(this.booster, fVar.booster) && Intrinsics.f(this.plan, fVar.plan) && Intrinsics.f(this.yearlySavings, fVar.yearlySavings) && Intrinsics.f(this.pointsForPocketYearly, fVar.pointsForPocketYearly) && Intrinsics.f(this.milesForBonusPoints, fVar.milesForBonusPoints) && Intrinsics.f(this.staysDiscountForBonusPoints, fVar.staysDiscountForBonusPoints) && Intrinsics.f(this.planUpgradeSpendThreshold, fVar.planUpgradeSpendThreshold);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.b getPlanUpgradeSpendThreshold() {
        return this.planUpgradeSpendThreshold;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPointsForCardSpend() {
        return this.pointsForCardSpend;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.cashForCardSpend.hashCode() * 31, 31, this.pointsForCardSpend), 31, this.pointsToMilesRatio);
        jo3.b bVar = this.cashForSpareChange;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.pointsForSpareChange;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bonusPoints;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        g gVar = this.booster;
        int iC2 = p.a.c((iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.plan);
        f0 f0Var = this.yearlySavings;
        int iHashCode4 = (iC2 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        jo3.b bVar2 = this.pointsForPocketYearly;
        int iHashCode5 = (iHashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str3 = this.milesForBonusPoints;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jo3.b bVar3 = this.staysDiscountForBonusPoints;
        int iHashCode7 = (iHashCode6 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        jo3.b bVar4 = this.planUpgradeSpendThreshold;
        return iHashCode7 + (bVar4 != null ? bVar4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.b getPointsForPocketYearly() {
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
    public final jo3.b getStaysDiscountForBonusPoints() {
        return this.staysDiscountForBonusPoints;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final f0 getYearlySavings() {
        return this.yearlySavings;
    }
}
