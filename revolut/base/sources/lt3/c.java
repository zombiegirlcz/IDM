package lt3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0019"}, d2 = {"Llt3/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "sourceFacilityId", "b", "d", "intendedPlanId", "c", "f", "offerToken", "billingOption", "e", "intent", "entryPoint", "Ljo3/a;", "g", "Ljo3/a;", "()Ljo3/a;", "selectedCreditLimit", "analyticsEntryPoint", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourceFacilityId")
    private final String sourceFacilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("intendedPlanId")
    private final String intendedPlanId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("offerToken")
    private final String offerToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("billingOption")
    private final String billingOption;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("intent")
    private final String intent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("entryPoint")
    private final String entryPoint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("selectedCreditLimit")
    private final jo3.a selectedCreditLimit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("analyticsEntryPoint")
    private final String analyticsEntryPoint;

    public c(String str, String str2, String str3, String str4, String str5, String str6, jo3.a aVar, String str7) {
        this.sourceFacilityId = str;
        this.intendedPlanId = str2;
        this.offerToken = str3;
        this.billingOption = str4;
        this.intent = str5;
        this.entryPoint = str6;
        this.selectedCreditLimit = aVar;
        this.analyticsEntryPoint = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsEntryPoint() {
        return this.analyticsEntryPoint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillingOption() {
        return this.billingOption;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIntendedPlanId() {
        return this.intendedPlanId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIntent() {
        return this.intent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.sourceFacilityId, cVar.sourceFacilityId) && Intrinsics.f(this.intendedPlanId, cVar.intendedPlanId) && Intrinsics.f(this.offerToken, cVar.offerToken) && Intrinsics.f(this.billingOption, cVar.billingOption) && Intrinsics.f(this.intent, cVar.intent) && Intrinsics.f(this.entryPoint, cVar.entryPoint) && Intrinsics.f(this.selectedCreditLimit, cVar.selectedCreditLimit) && Intrinsics.f(this.analyticsEntryPoint, cVar.analyticsEntryPoint);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getSelectedCreditLimit() {
        return this.selectedCreditLimit;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSourceFacilityId() {
        return this.sourceFacilityId;
    }

    public final int hashCode() {
        String str = this.sourceFacilityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.intendedPlanId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offerToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billingOption;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.intent;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.entryPoint;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        jo3.a aVar = this.selectedCreditLimit;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str7 = this.analyticsEntryPoint;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }
}
