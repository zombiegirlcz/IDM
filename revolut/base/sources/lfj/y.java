package lfj;

import java.util.ArrayList;
import java.util.List;
import kfj.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u00100\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00106\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010E\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\u0004¨\u0006I"}, d2 = {"Llfj/y;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPhoneNumberId", "phoneNumberId", "b", "getPocketId", "pocketId", "c", "getDataPlanId", "dataPlanId", "d", "getOrderFulfillmentMode", "orderFulfillmentMode", "Llfj/s;", "e", "Llfj/s;", "getAutoRenewal", "()Llfj/s;", "autoRenewal", "Llfj/w;", "f", "Llfj/w;", "getOffer", "()Llfj/w;", "offer", "Lkfj/m2;", "g", "Lkfj/m2;", "getPointsRedemption", "()Lkfj/m2;", "pointsRedemption", "", "h", "Ljava/lang/Boolean;", "getUseRevPointsForRecurring", "()Ljava/lang/Boolean;", "useRevPointsForRecurring", "", "Llfj/a0;", "i", "Ljava/util/List;", "getSimProfiles", "()Ljava/util/List;", "simProfiles", "Ljo3/a;", "j", "Ljo3/a;", "getPrice", "()Ljo3/a;", "price", "k", "getPocketCurrency", "pocketCurrency", "Llfj/x;", "l", "Llfj/x;", "getTerms", "()Llfj/x;", "terms", "Llfj/z;", "m", "Llfj/z;", "getPorting", "()Llfj/z;", "porting", "n", "getReceiverUsername", "receiverUsername", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("phoneNumberId")
    private final String phoneNumberId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlanId")
    @NotNull
    private final String dataPlanId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("orderFulfillmentMode")
    private final String orderFulfillmentMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("autoRenewal")
    @NotNull
    private final s autoRenewal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("offer")
    private final w offer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsRedemptionOption")
    private final m2 pointsRedemption;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("useRevPointsForRecurring")
    private final Boolean useRevPointsForRecurring;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("simProfiles")
    private final List<a0> simProfiles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    private final jo3.a price;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("pocketCurrency")
    private final String pocketCurrency;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final x terms;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("porting")
    private final z porting;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("receiverUsername")
    private final String receiverUsername;

    public y(String str, String str2, String dataPlanId, String str3, s autoRenewal, w wVar, m2 m2Var, Boolean bool, ArrayList arrayList, jo3.a aVar, String str4, x xVar, z zVar, String str5) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        Intrinsics.checkNotNullParameter(autoRenewal, "autoRenewal");
        this.phoneNumberId = str;
        this.pocketId = str2;
        this.dataPlanId = dataPlanId;
        this.orderFulfillmentMode = str3;
        this.autoRenewal = autoRenewal;
        this.offer = wVar;
        this.pointsRedemption = m2Var;
        this.useRevPointsForRecurring = bool;
        this.simProfiles = arrayList;
        this.price = aVar;
        this.pocketCurrency = str4;
        this.terms = xVar;
        this.porting = zVar;
        this.receiverUsername = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.phoneNumberId, yVar.phoneNumberId) && Intrinsics.f(this.pocketId, yVar.pocketId) && Intrinsics.f(this.dataPlanId, yVar.dataPlanId) && Intrinsics.f(this.orderFulfillmentMode, yVar.orderFulfillmentMode) && Intrinsics.f(this.autoRenewal, yVar.autoRenewal) && Intrinsics.f(this.offer, yVar.offer) && Intrinsics.f(this.pointsRedemption, yVar.pointsRedemption) && Intrinsics.f(this.useRevPointsForRecurring, yVar.useRevPointsForRecurring) && Intrinsics.f(this.simProfiles, yVar.simProfiles) && Intrinsics.f(this.price, yVar.price) && Intrinsics.f(this.pocketCurrency, yVar.pocketCurrency) && Intrinsics.f(this.terms, yVar.terms) && Intrinsics.f(this.porting, yVar.porting) && Intrinsics.f(this.receiverUsername, yVar.receiverUsername);
    }

    public final int hashCode() {
        String str = this.phoneNumberId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pocketId;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.dataPlanId);
        String str3 = this.orderFulfillmentMode;
        int iHashCode2 = (this.autoRenewal.hashCode() + ((iC + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        w wVar = this.offer;
        int iHashCode3 = (iHashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        m2 m2Var = this.pointsRedemption;
        int iHashCode4 = (iHashCode3 + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        Boolean bool = this.useRevPointsForRecurring;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<a0> list = this.simProfiles;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        jo3.a aVar = this.price;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.pocketCurrency;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        x xVar = this.terms;
        int iHashCode9 = (iHashCode8 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        z zVar = this.porting;
        int iHashCode10 = (iHashCode9 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        String str5 = this.receiverUsername;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }
}
