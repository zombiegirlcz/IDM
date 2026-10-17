package a14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0014"}, d2 = {"La14/c;", "La14/d;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "label", "b", "c", "intendedPlanId", "f", "productMetadata", "appType", "e", "g", "subtype", "billingOption", "offerToken", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("intendedPlanId")
    private final String intendedPlanId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("productMetadata")
    private final String productMetadata;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("appType")
    private final String appType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("subtype")
    private final String subtype;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("billingOption")
    private final String billingOption;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("offerToken")
    private final String offerToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppType() {
        return this.appType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillingOption() {
        return this.billingOption;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIntendedPlanId() {
        return this.intendedPlanId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.label, cVar.label) && Intrinsics.f(this.intendedPlanId, cVar.intendedPlanId) && Intrinsics.f(this.productMetadata, cVar.productMetadata) && Intrinsics.f(this.appType, cVar.appType) && Intrinsics.f(this.subtype, cVar.subtype) && Intrinsics.f(this.billingOption, cVar.billingOption) && Intrinsics.f(this.offerToken, cVar.offerToken);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProductMetadata() {
        return this.productMetadata;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    public final int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.intendedPlanId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productMetadata;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtype;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.billingOption;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offerToken;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }
}
