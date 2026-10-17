package gfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0017"}, d2 = {"Lgfk/h;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "e", "()Ljo3/a;", "minimumBalance", "b", "currentBalance", "c", "Ljava/lang/String;", "g", "startDate", "d", "endDate", "f", "pricingPlanId", "info", "howItWorks", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumBalance")
    @NotNull
    private final jo3.a minimumBalance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentBalance")
    private final jo3.a currentBalance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    @NotNull
    private final String startDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("endDate")
    @NotNull
    private final String endDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pricingPlanId")
    @NotNull
    private final String pricingPlanId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("info")
    private final String info;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("howItWorks")
    private final String howItWorks;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getCurrentBalance() {
        return this.currentBalance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHowItWorks() {
        return this.howItWorks;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMinimumBalance() {
        return this.minimumBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.minimumBalance, hVar.minimumBalance) && Intrinsics.f(this.currentBalance, hVar.currentBalance) && Intrinsics.f(this.startDate, hVar.startDate) && Intrinsics.f(this.endDate, hVar.endDate) && Intrinsics.f(this.pricingPlanId, hVar.pricingPlanId) && Intrinsics.f(this.info, hVar.info) && Intrinsics.f(this.howItWorks, hVar.howItWorks);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPricingPlanId() {
        return this.pricingPlanId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        int iHashCode = this.minimumBalance.hashCode() * 31;
        jo3.a aVar = this.currentBalance;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.startDate), 31, this.endDate), 31, this.pricingPlanId);
        String str = this.info;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.howItWorks;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
