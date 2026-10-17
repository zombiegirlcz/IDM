package hfk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\f\u0010 R\u001c\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010 R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0017\u0010'R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u001c\u00101\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b\u001e\u00100R\"\u00103\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\b%\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b\u0006\u0010'R\"\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b2\u0010\u0015R\u001c\u0010=\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010;\u001a\u0004\b6\u0010<¨\u0006>"}, d2 = {"Lhfk/o;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "i", "()Ljo3/a;", "refundAmount", "Lgfk/c;", "b", "Lgfk/c;", "j", "()Lgfk/c;", "refundAmountCharge", "", "Lhfk/n;", "c", "Ljava/util/List;", "()Ljava/util/List;", "fees", "d", "n", "taxes", "e", "o", "totalDueAmount", "", "f", "Ljava/lang/Long;", "()Ljava/lang/Long;", "endDate", "g", "penalisationPeriodEndDate", "", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasPaymentsBeforeEndDate", "Lhfk/i;", "Lhfk/i;", "l", "()Lhfk/i;", "screenConfig", "Lhfk/l;", "Lhfk/l;", "()Lhfk/l;", "noticePeriod", "k", "ineligibilityReasons", "Ljava/lang/String;", "planId", "m", "creditCardActivationRequired", "Lhfk/p;", "rewards", "Lhfk/q;", "Lhfk/q;", "()Lhfk/q;", "successAction", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundAmount")
    private final jo3.a refundAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundAmountCharge")
    private final gfk.c refundAmountCharge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final List<n> fees;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("taxes")
    private final List<n> taxes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalDueAmount")
    private final jo3.a totalDueAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("endDate")
    private final Long endDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("penalisationPeriodEndDate")
    private final Long penalisationPeriodEndDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasPaymentsBeforeEndDate")
    private final Boolean hasPaymentsBeforeEndDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("template")
    private final i screenConfig;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("noticePeriod")
    private final l noticePeriod;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("ineligibilityReasons")
    private final List<String> ineligibilityReasons;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    private final String planId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditCardActivationRequired")
    private final Boolean creditCardActivationRequired;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewards")
    private final List<p> rewards;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("successAction")
    private final q successAction;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getCreditCardActivationRequired() {
        return this.creditCardActivationRequired;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getHasPaymentsBeforeEndDate() {
        return this.hasPaymentsBeforeEndDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getIneligibilityReasons() {
        return this.ineligibilityReasons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.refundAmount, oVar.refundAmount) && Intrinsics.f(this.refundAmountCharge, oVar.refundAmountCharge) && Intrinsics.f(this.fees, oVar.fees) && Intrinsics.f(this.taxes, oVar.taxes) && Intrinsics.f(this.totalDueAmount, oVar.totalDueAmount) && Intrinsics.f(this.endDate, oVar.endDate) && Intrinsics.f(this.penalisationPeriodEndDate, oVar.penalisationPeriodEndDate) && Intrinsics.f(this.hasPaymentsBeforeEndDate, oVar.hasPaymentsBeforeEndDate) && Intrinsics.f(this.screenConfig, oVar.screenConfig) && Intrinsics.f(this.noticePeriod, oVar.noticePeriod) && Intrinsics.f(this.ineligibilityReasons, oVar.ineligibilityReasons) && Intrinsics.f(this.planId, oVar.planId) && Intrinsics.f(this.creditCardActivationRequired, oVar.creditCardActivationRequired) && Intrinsics.f(this.rewards, oVar.rewards) && Intrinsics.f(this.successAction, oVar.successAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getNoticePeriod() {
        return this.noticePeriod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getPenalisationPeriodEndDate() {
        return this.penalisationPeriodEndDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    public final int hashCode() {
        jo3.a aVar = this.refundAmount;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        gfk.c cVar = this.refundAmountCharge;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<n> list = this.fees;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<n> list2 = this.taxes;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        jo3.a aVar2 = this.totalDueAmount;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Long l2 = this.endDate;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.penalisationPeriodEndDate;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.hasPaymentsBeforeEndDate;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        i iVar = this.screenConfig;
        int iHashCode9 = (iHashCode8 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        l lVar = this.noticePeriod;
        int iHashCode10 = (iHashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        List<String> list3 = this.ineligibilityReasons;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.planId;
        int iHashCode12 = (iHashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.creditCardActivationRequired;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<p> list4 = this.rewards;
        int iHashCode14 = (iHashCode13 + (list4 == null ? 0 : list4.hashCode())) * 31;
        q qVar = this.successAction;
        return iHashCode14 + (qVar != null ? qVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getRefundAmount() {
        return this.refundAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final gfk.c getRefundAmountCharge() {
        return this.refundAmountCharge;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getRewards() {
        return this.rewards;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final i getScreenConfig() {
        return this.screenConfig;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final q getSuccessAction() {
        return this.successAction;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final jo3.a getTotalDueAmount() {
        return this.totalDueAmount;
    }
}
