package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0019"}, d2 = {"Lot3/u;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "g", "()Z", "physicalCardEnabled", "b", "Ljava/lang/String;", "h", "selectionScreenType", "c", "cardProductType", "d", "cardSubProductType", "e", "facilityId", "f", "intendedPlanId", "billingOption", "offerToken", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("physicalCardEnabled")
    private final boolean physicalCardEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("selectionScreenType")
    private final String selectionScreenType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardProductType")
    private final String cardProductType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cardSubProductType")
    private final String cardSubProductType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("facilityId")
    private final String facilityId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("intendedPlanId")
    private final String intendedPlanId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingOption")
    private final String billingOption;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("offerToken")
    private final String offerToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBillingOption() {
        return this.billingOption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardProductType() {
        return this.cardProductType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCardSubProductType() {
        return this.cardSubProductType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIntendedPlanId() {
        return this.intendedPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.physicalCardEnabled == uVar.physicalCardEnabled && Intrinsics.f(this.selectionScreenType, uVar.selectionScreenType) && Intrinsics.f(this.cardProductType, uVar.cardProductType) && Intrinsics.f(this.cardSubProductType, uVar.cardSubProductType) && Intrinsics.f(this.facilityId, uVar.facilityId) && Intrinsics.f(this.intendedPlanId, uVar.intendedPlanId) && Intrinsics.f(this.billingOption, uVar.billingOption) && Intrinsics.f(this.offerToken, uVar.offerToken);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getPhysicalCardEnabled() {
        return this.physicalCardEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSelectionScreenType() {
        return this.selectionScreenType;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.physicalCardEnabled) * 31;
        String str = this.selectionScreenType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardProductType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardSubProductType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.facilityId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.intendedPlanId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.billingOption;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerToken;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }
}
