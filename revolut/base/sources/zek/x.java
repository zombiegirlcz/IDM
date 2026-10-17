package zek;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u00102\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00107\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u001e\u00106R\u001c\u0010;\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b.\u0010:R\u001c\u0010=\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b<\u00106R\u001c\u0010B\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010D\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010?\u001a\u0004\bC\u0010AR\u001c\u0010H\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010F\u001a\u0004\b\u0015\u0010GR\u001c\u0010I\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b\u0010\u0010AR\u001c\u0010K\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\bJ\u0010AR\u001c\u0010M\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\bL\u0010AR\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010R\u001a\u0004\u0018\u00010O8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010P\u001a\u0004\b4\u0010QR\u001c\u0010V\u001a\u0004\u0018\u00010S8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010T\u001a\u0004\b\r\u0010U¨\u0006W"}, d2 = {"Lzek/x;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "id", "b", "accountType", "c", "billingCycleId", "d", "billingPeriod", "", "e", "J", "r", "()J", "startDate", "f", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "endDate", "g", "o", "nextBillingDate", "Lzek/l;", "h", "Lzek/l;", "()Lzek/l;", "currentBilling", "", "Ljava/util/List;", "n", "()Ljava/util/List;", "nextBilling", "Lzek/t;", "j", "Lzek/t;", "p", "()Lzek/t;", "nextPlan", "Ljo3/b;", "k", "Ljo3/b;", "q", "()Ljo3/b;", "refund", "Lzek/b0;", "l", "Lzek/b0;", "()Lzek/b0;", "discount", "Lzek/i;", "Lzek/i;", "()Lzek/i;", "freeTrial", "s", "upcomingDiscount", "", "Ljava/lang/Boolean;", "u", "()Ljava/lang/Boolean;", "isDefault", "w", "isRevolutCardRequiredForInsuranceActivation", "Lzek/b;", "Lzek/b;", "()Lzek/b;", "cashbackBoostCampaign", "canChangeBillingPeriod", "t", "isBillingPeriodChangeBeneficial", "v", "isFirstInvoice", "familyRole", "Lzek/q;", "Lzek/q;", "()Lzek/q;", "gift", "Lzek/a0;", "Lzek/a0;", "()Lzek/a0;", "billingPeriodChange", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountType")
    @NotNull
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
    private final l currentBilling;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("nextBilling")
    private final List<l> nextBilling;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPlan")
    private final t nextPlan;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("refund")
    private final jo3.b refund;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("discount")
    private final b0 discount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeTrial")
    private final i freeTrial;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("upcomingDiscount")
    private final b0 upcomingDiscount;

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
    @lg.b("canChangeBillingPeriod")
    private final Boolean canChangeBillingPeriod;

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
    private final q gift;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingPeriodChange")
    private final a0 billingPeriodChange;

    public x(String id10, String accountType, String str, String str2, long j2, Long l2, Long l3, l lVar, ArrayList arrayList, t tVar, jo3.b bVar, b0 b0Var, i iVar, b0 b0Var2, Boolean bool, Boolean bool2, b bVar2, Boolean bool3, Boolean bool4, Boolean bool5, String str3, q qVar, a0 a0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.id = id10;
        this.accountType = accountType;
        this.billingCycleId = str;
        this.billingPeriod = str2;
        this.startDate = j2;
        this.endDate = l2;
        this.nextBillingDate = l3;
        this.currentBilling = lVar;
        this.nextBilling = arrayList;
        this.nextPlan = tVar;
        this.refund = bVar;
        this.discount = b0Var;
        this.freeTrial = iVar;
        this.upcomingDiscount = b0Var2;
        this.isDefault = bool;
        this.isRevolutCardRequiredForInsuranceActivation = bool2;
        this.cashbackBoostCampaign = bVar2;
        this.canChangeBillingPeriod = bool3;
        this.isBillingPeriodChangeBeneficial = bool4;
        this.isFirstInvoice = bool5;
        this.familyRole = str3;
        this.gift = qVar;
        this.billingPeriodChange = a0Var;
    }

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
    public final a0 getBillingPeriodChange() {
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
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.id, xVar.id) && Intrinsics.f(this.accountType, xVar.accountType) && Intrinsics.f(this.billingCycleId, xVar.billingCycleId) && Intrinsics.f(this.billingPeriod, xVar.billingPeriod) && this.startDate == xVar.startDate && Intrinsics.f(this.endDate, xVar.endDate) && Intrinsics.f(this.nextBillingDate, xVar.nextBillingDate) && Intrinsics.f(this.currentBilling, xVar.currentBilling) && Intrinsics.f(this.nextBilling, xVar.nextBilling) && Intrinsics.f(this.nextPlan, xVar.nextPlan) && Intrinsics.f(this.refund, xVar.refund) && Intrinsics.f(this.discount, xVar.discount) && Intrinsics.f(this.freeTrial, xVar.freeTrial) && Intrinsics.f(this.upcomingDiscount, xVar.upcomingDiscount) && Intrinsics.f(this.isDefault, xVar.isDefault) && Intrinsics.f(this.isRevolutCardRequiredForInsuranceActivation, xVar.isRevolutCardRequiredForInsuranceActivation) && Intrinsics.f(this.cashbackBoostCampaign, xVar.cashbackBoostCampaign) && Intrinsics.f(this.canChangeBillingPeriod, xVar.canChangeBillingPeriod) && Intrinsics.f(this.isBillingPeriodChangeBeneficial, xVar.isBillingPeriodChangeBeneficial) && Intrinsics.f(this.isFirstInvoice, xVar.isFirstInvoice) && Intrinsics.f(this.familyRole, xVar.familyRole) && Intrinsics.f(this.gift, xVar.gift) && Intrinsics.f(this.billingPeriodChange, xVar.billingPeriodChange);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getCashbackBoostCampaign() {
        return this.cashbackBoostCampaign;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final l getCurrentBilling() {
        return this.currentBilling;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getDiscount() {
        return this.discount;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.accountType);
        String str = this.billingCycleId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billingPeriod;
        int iC2 = a0.d.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.startDate);
        Long l2 = this.endDate;
        int iHashCode2 = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.nextBillingDate;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        l lVar = this.currentBilling;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        List<l> list = this.nextBilling;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        t tVar = this.nextPlan;
        int iHashCode6 = (iHashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        jo3.b bVar = this.refund;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b0 b0Var = this.discount;
        int iHashCode8 = (iHashCode7 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        i iVar = this.freeTrial;
        int iHashCode9 = (iHashCode8 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        b0 b0Var2 = this.upcomingDiscount;
        int iHashCode10 = (iHashCode9 + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        Boolean bool = this.isDefault;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRevolutCardRequiredForInsuranceActivation;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        b bVar2 = this.cashbackBoostCampaign;
        int iHashCode13 = (iHashCode12 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Boolean bool3 = this.canChangeBillingPeriod;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isBillingPeriodChangeBeneficial;
        int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isFirstInvoice;
        int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str3 = this.familyRole;
        int iHashCode17 = (iHashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        q qVar = this.gift;
        int iHashCode18 = (iHashCode17 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        a0 a0Var = this.billingPeriodChange;
        return iHashCode18 + (a0Var != null ? a0Var.hashCode() : 0);
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
    public final i getFreeTrial() {
        return this.freeTrial;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final q getGift() {
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
    public final t getNextPlan() {
        return this.nextPlan;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final jo3.b getRefund() {
        return this.refund;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final b0 getUpcomingDiscount() {
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
