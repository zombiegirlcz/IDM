package lfj;

import ip0.v7;
import kfj.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Llfj/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSubscriptionId", "subscriptionId", "b", "getMobilePlanId", "mobilePlanId", "", "c", "Z", "getUseRevPoints", "()Z", "useRevPoints", "Lkfj/m2;", "d", "Lkfj/m2;", "getPointsRedemptionOption", "()Lkfj/m2;", "pointsRedemptionOption", "Ljo3/a;", "e", "Ljo3/a;", "getPrice", "()Ljo3/a;", "price", "f", "getPocketId", "pocketId", "g", "getPocketCurrency", "pocketCurrency", "Llfj/s;", "h", "Llfj/s;", "getAutoRenewal", "()Llfj/s;", "autoRenewal", "i", "getChangeToken", "changeToken", "Llfj/x;", "j", "Llfj/x;", "getTerms", "()Llfj/x;", "terms", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptionId")
    @NotNull
    private final String subscriptionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlanId")
    @NotNull
    private final String mobilePlanId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("useRevPoints")
    private final boolean useRevPoints;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsRedemptionOption")
    private final m2 pointsRedemptionOption;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.a price;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketCurrency")
    private final String pocketCurrency;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoRenewal")
    private final s autoRenewal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("changeToken")
    private final String changeToken;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final x terms;

    public u(String subscriptionId, String mobilePlanId, boolean z, m2 m2Var, jo3.a price, String str, String str2, s sVar, String str3, x xVar) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(price, "price");
        this.subscriptionId = subscriptionId;
        this.mobilePlanId = mobilePlanId;
        this.useRevPoints = z;
        this.pointsRedemptionOption = m2Var;
        this.price = price;
        this.pocketId = str;
        this.pocketCurrency = str2;
        this.autoRenewal = sVar;
        this.changeToken = str3;
        this.terms = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.subscriptionId, uVar.subscriptionId) && Intrinsics.f(this.mobilePlanId, uVar.mobilePlanId) && this.useRevPoints == uVar.useRevPoints && Intrinsics.f(this.pointsRedemptionOption, uVar.pointsRedemptionOption) && Intrinsics.f(this.price, uVar.price) && Intrinsics.f(this.pocketId, uVar.pocketId) && Intrinsics.f(this.pocketCurrency, uVar.pocketCurrency) && Intrinsics.f(this.autoRenewal, uVar.autoRenewal) && Intrinsics.f(this.changeToken, uVar.changeToken) && Intrinsics.f(this.terms, uVar.terms);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.subscriptionId.hashCode() * 31, 31, this.mobilePlanId), 31, this.useRevPoints);
        m2 m2Var = this.pointsRedemptionOption;
        int iJ = v7.j(this.price, (iC + (m2Var == null ? 0 : m2Var.hashCode())) * 31, 31);
        String str = this.pocketId;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pocketCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        s sVar = this.autoRenewal;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str3 = this.changeToken;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        x xVar = this.terms;
        return iHashCode4 + (xVar != null ? xVar.hashCode() : 0);
    }
}
