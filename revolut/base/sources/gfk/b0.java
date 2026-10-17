package gfk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u00102\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00107\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u001e\u00106R\u001c\u0010;\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b.\u0010:R\u001c\u0010=\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b<\u00106R\u001c\u0010B\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010D\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010?\u001a\u0004\bC\u0010AR\u001c\u0010H\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010F\u001a\u0004\b\u0015\u0010GR\u001c\u0010L\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\b\r\u0010KR\u001c\u0010N\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\bM\u0010AR\u001c\u0010P\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\bO\u0010AR\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010U\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010S\u001a\u0004\b4\u0010TR\"\u0010X\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010?\u0012\u0004\bV\u0010W\u001a\u0004\b\u0010\u0010A¨\u0006Y"}, d2 = {"Lgfk/b0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "id", "b", "accountType", "c", "billingCycleId", "d", "billingPeriod", "", "e", "J", "r", "()J", "startDate", "f", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "endDate", "g", "o", "nextBillingDate", "Lgfk/s;", "h", "Lgfk/s;", "()Lgfk/s;", "currentBilling", "", "Ljava/util/List;", "n", "()Ljava/util/List;", "nextBilling", "Lgfk/z;", "j", "Lgfk/z;", "p", "()Lgfk/z;", "nextPlan", "Ljo3/a;", "k", "Ljo3/a;", "q", "()Ljo3/a;", "refund", "Lgfk/q0;", "l", "Lgfk/q0;", "()Lgfk/q0;", "discount", "Lgfk/f;", "Lgfk/f;", "()Lgfk/f;", "freeTrial", "s", "upcomingDiscount", "", "Ljava/lang/Boolean;", "u", "()Ljava/lang/Boolean;", "isDefault", "w", "isRevolutCardRequiredForInsuranceActivation", "Lgfk/b;", "Lgfk/b;", "()Lgfk/b;", "cashbackBoostCampaign", "Lgfk/p0;", "Lgfk/p0;", "()Lgfk/p0;", "billingPeriodChange", "t", "isBillingPeriodChangeBeneficial", "v", "isFirstInvoice", "familyRole", "Lgfk/w;", "Lgfk/w;", "()Lgfk/w;", "gift", "getCanChangeBillingPeriod$annotations", "()V", "canChangeBillingPeriod", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountType")
    private final String accountType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingCycleId")
    private final String billingCycleId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("billingPeriod")
    private final String billingPeriod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("startDate")
    private final long startDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("endDate")
    private final Long endDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextBillingDate")
    private final Long nextBillingDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentBilling")
    private final s currentBilling;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("nextBilling")
    private final List<s> nextBilling;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPlan")
    private final z nextPlan;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("refund")
    private final jo3.a refund;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("discount")
    private final q0 discount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeTrial")
    private final f freeTrial;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("upcomingDiscount")
    private final q0 upcomingDiscount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("isDefault")
    private final Boolean isDefault;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("isRevolutCardRequiredForInsuranceActivation")
    private final Boolean isRevolutCardRequiredForInsuranceActivation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackBoostCampaign")
    private final b cashbackBoostCampaign;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingPeriodChange")
    private final p0 billingPeriodChange;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("isBillingPeriodChangeBeneficial")
    private final Boolean isBillingPeriodChangeBeneficial;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("isFirstInvoice")
    private final Boolean isFirstInvoice;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("familyRole")
    private final String familyRole;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("gift")
    private final w gift;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("canChangeBillingPeriod")
    private final Boolean canChangeBillingPeriod;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillingCycleId() {
        return this.billingCycleId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBillingPeriod() {
        return this.billingPeriod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p0 getBillingPeriodChange() {
        return this.billingPeriodChange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getCanChangeBillingPeriod() {
        return this.canChangeBillingPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.id, b0Var.id) && Intrinsics.f(this.accountType, b0Var.accountType) && Intrinsics.f(this.billingCycleId, b0Var.billingCycleId) && Intrinsics.f(this.billingPeriod, b0Var.billingPeriod) && this.startDate == b0Var.startDate && Intrinsics.f(this.endDate, b0Var.endDate) && Intrinsics.f(this.nextBillingDate, b0Var.nextBillingDate) && Intrinsics.f(this.currentBilling, b0Var.currentBilling) && Intrinsics.f(this.nextBilling, b0Var.nextBilling) && Intrinsics.f(this.nextPlan, b0Var.nextPlan) && Intrinsics.f(this.refund, b0Var.refund) && Intrinsics.f(this.discount, b0Var.discount) && Intrinsics.f(this.freeTrial, b0Var.freeTrial) && Intrinsics.f(this.upcomingDiscount, b0Var.upcomingDiscount) && Intrinsics.f(this.isDefault, b0Var.isDefault) && Intrinsics.f(this.isRevolutCardRequiredForInsuranceActivation, b0Var.isRevolutCardRequiredForInsuranceActivation) && Intrinsics.f(this.cashbackBoostCampaign, b0Var.cashbackBoostCampaign) && Intrinsics.f(this.billingPeriodChange, b0Var.billingPeriodChange) && Intrinsics.f(this.isBillingPeriodChangeBeneficial, b0Var.isBillingPeriodChangeBeneficial) && Intrinsics.f(this.isFirstInvoice, b0Var.isFirstInvoice) && Intrinsics.f(this.familyRole, b0Var.familyRole) && Intrinsics.f(this.gift, b0Var.gift) && Intrinsics.f(this.canChangeBillingPeriod, b0Var.canChangeBillingPeriod);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getCashbackBoostCampaign() {
        return this.cashbackBoostCampaign;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final s getCurrentBilling() {
        return this.currentBilling;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final q0 getDiscount() {
        return this.discount;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.accountType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingCycleId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billingPeriod;
        int iC = a0.d.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.startDate);
        Long l2 = this.endDate;
        int iHashCode4 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.nextBillingDate;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        s sVar = this.currentBilling;
        int iHashCode6 = (iHashCode5 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        List<s> list = this.nextBilling;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        z zVar = this.nextPlan;
        int iHashCode8 = (iHashCode7 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        jo3.a aVar = this.refund;
        int iHashCode9 = (iHashCode8 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        q0 q0Var = this.discount;
        int iHashCode10 = (iHashCode9 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        f fVar = this.freeTrial;
        int iHashCode11 = (iHashCode10 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        q0 q0Var2 = this.upcomingDiscount;
        int iHashCode12 = (iHashCode11 + (q0Var2 == null ? 0 : q0Var2.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRevolutCardRequiredForInsuranceActivation;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        b bVar = this.cashbackBoostCampaign;
        int iHashCode15 = (iHashCode14 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        p0 p0Var = this.billingPeriodChange;
        int iHashCode16 = (iHashCode15 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        Boolean bool3 = this.isBillingPeriodChangeBeneficial;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFirstInvoice;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str4 = this.familyRole;
        int iHashCode19 = (iHashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        w wVar = this.gift;
        int iHashCode20 = (iHashCode19 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        Boolean bool5 = this.canChangeBillingPeriod;
        return iHashCode20 + (bool5 != null ? bool5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFamilyRole() {
        return this.familyRole;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final f getFreeTrial() {
        return this.freeTrial;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final w getGift() {
        return this.gift;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getNextBilling() {
        return this.nextBilling;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getNextBillingDate() {
        return this.nextBillingDate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final z getNextPlan() {
        return this.nextPlan;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final jo3.a getRefund() {
        return this.refund;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final q0 getUpcomingDiscount() {
        return this.upcomingDiscount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getIsBillingPeriodChangeBeneficial() {
        return this.isBillingPeriodChangeBeneficial;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Boolean getIsFirstInvoice() {
        return this.isFirstInvoice;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Boolean getIsRevolutCardRequiredForInsuranceActivation() {
        return this.isRevolutCardRequiredForInsuranceActivation;
    }
}
