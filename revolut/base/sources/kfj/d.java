package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0010\u0010\"R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010.\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u001c\u00108\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107R\u001c\u0010<\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b\u0005\u0010;R\u001c\u0010=\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b>\u0010\u0004R\u001c\u0010C\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\b\n\u0010BR\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010H\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010F\u001a\u0004\b\u0015\u0010G¨\u0006I"}, d2 = {"Lkfj/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "previousSubscriptionId", "Lkfj/p;", "b", "Lkfj/p;", "e", "()Lkfj/p;", "offer", "Lkfj/g;", "c", "Lkfj/g;", "n", "()Lkfj/g;", "selectedMobilePlan", "d", "h", "phoneNumberId", "g", "phoneNumber", "Lkfj/b5;", "f", "Lkfj/b5;", "p", "()Lkfj/b5;", "terms", "Lkfj/a;", "Lkfj/a;", "()Lkfj/a;", "autoRenewal", "Lkfj/c5;", "Lkfj/c5;", "q", "()Lkfj/c5;", "validityDisclaimer", "Lkfj/t2;", "i", "Lkfj/t2;", "l", "()Lkfj/t2;", "priceBreakdown", "Lkfj/e;", "j", "Lkfj/e;", "()Lkfj/e;", "porting", "Lkfj/m4;", "Lkfj/m4;", "m", "()Lkfj/m4;", "refund", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "activationDate", "planChangeType", "o", "simProfileId", "Lkfj/c;", "Lkfj/c;", "()Lkfj/c;", "additionalInformation", "orderFulfillmentMode", "Lkfj/p3;", "Lkfj/p3;", "()Lkfj/p3;", "dataUsageDescription", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousSubscriptionId")
    private final String previousSubscriptionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("offer")
    private final p offer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("selectedMobilePlan")
    private final g selectedMobilePlan;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("phoneNumberId")
    private final String phoneNumberId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("phoneNumber")
    private final String phoneNumber;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("terms")
    @NotNull
    private final b5 terms;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoRenewal")
    private final a autoRenewal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("validityDisclaimer")
    private final c5 validityDisclaimer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("priceBreakdown")
    @NotNull
    private final t2 priceBreakdown;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("porting")
    private final e porting;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("refund")
    private final m4 refund;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationDate")
    private final Long activationDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("planChangeType")
    private final String planChangeType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("simProfileId")
    private final String simProfileId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("additionalInformation")
    private final c additionalInformation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderFulfillmentMode")
    private final String orderFulfillmentMode;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("dataUsageDescription")
    private final p3 dataUsageDescription;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getActivationDate() {
        return this.activationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getAdditionalInformation() {
        return this.additionalInformation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getAutoRenewal() {
        return this.autoRenewal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p3 getDataUsageDescription() {
        return this.dataUsageDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final p getOffer() {
        return this.offer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.previousSubscriptionId, dVar.previousSubscriptionId) && Intrinsics.f(this.offer, dVar.offer) && Intrinsics.f(this.selectedMobilePlan, dVar.selectedMobilePlan) && Intrinsics.f(this.phoneNumberId, dVar.phoneNumberId) && Intrinsics.f(this.phoneNumber, dVar.phoneNumber) && Intrinsics.f(this.terms, dVar.terms) && Intrinsics.f(this.autoRenewal, dVar.autoRenewal) && Intrinsics.f(this.validityDisclaimer, dVar.validityDisclaimer) && Intrinsics.f(this.priceBreakdown, dVar.priceBreakdown) && Intrinsics.f(this.porting, dVar.porting) && Intrinsics.f(this.refund, dVar.refund) && Intrinsics.f(this.activationDate, dVar.activationDate) && Intrinsics.f(this.planChangeType, dVar.planChangeType) && Intrinsics.f(this.simProfileId, dVar.simProfileId) && Intrinsics.f(this.additionalInformation, dVar.additionalInformation) && Intrinsics.f(this.orderFulfillmentMode, dVar.orderFulfillmentMode) && Intrinsics.f(this.dataUsageDescription, dVar.dataUsageDescription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOrderFulfillmentMode() {
        return this.orderFulfillmentMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    public final int hashCode() {
        String str = this.previousSubscriptionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        p pVar = this.offer;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        g gVar = this.selectedMobilePlan;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str2 = this.phoneNumberId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNumber;
        int iHashCode5 = (this.terms.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        a aVar = this.autoRenewal;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c5 c5Var = this.validityDisclaimer;
        int iHashCode7 = (this.priceBreakdown.hashCode() + ((iHashCode6 + (c5Var == null ? 0 : c5Var.hashCode())) * 31)) * 31;
        e eVar = this.porting;
        int iHashCode8 = (iHashCode7 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        m4 m4Var = this.refund;
        int iHashCode9 = (iHashCode8 + (m4Var == null ? 0 : m4Var.hashCode())) * 31;
        Long l2 = this.activationDate;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.planChangeType;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.simProfileId;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        c cVar = this.additionalInformation;
        int iHashCode13 = (iHashCode12 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str6 = this.orderFulfillmentMode;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        p3 p3Var = this.dataUsageDescription;
        return iHashCode14 + (p3Var != null ? p3Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPlanChangeType() {
        return this.planChangeType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e getPorting() {
        return this.porting;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPreviousSubscriptionId() {
        return this.previousSubscriptionId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final t2 getPriceBreakdown() {
        return this.priceBreakdown;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final m4 getRefund() {
        return this.refund;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final g getSelectedMobilePlan() {
        return this.selectedMobilePlan;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSimProfileId() {
        return this.simProfileId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final b5 getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final c5 getValidityDisclaimer() {
        return this.validityDisclaimer;
    }
}
