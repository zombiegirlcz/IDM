package evh;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b$\u00104R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b&\u0010\u0004¨\u00068"}, d2 = {"Levh/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "method", "b", "applicableDocumentsScope", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "applicableCountries", "d", "e", "formId", "", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "formParams", "Levh/f;", "dataPoints", "Levh/k;", "g", "Levh/k;", "l", "()Levh/k;", "screenConfiguration", "authenticationMethod", "i", "p", "signatureProcessType", "j", "onboardingStep", "k", "o", "sdkVendor", "n", "screenName", "Lkg/w;", "m", "Lkg/w;", "()Lkg/w;", "screenFlowConfiguration", "q", "supportDeeplink", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "pollingInterval", "identityId", "registeredIdentityId", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("method")
    private final String method;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("applicableDocumentsScope")
    private final String applicableDocumentsScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("applicableCountries")
    private final List<String> applicableCountries;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("formId")
    private final String formId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("formParams")
    private final Map<String, String> formParams;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("dataPoints")
    private final List<f> dataPoints;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("screenConfiguration")
    private final k screenConfiguration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("authenticationMethod")
    private final String authenticationMethod;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("signatureProcessType")
    private final String signatureProcessType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("onboardingStep")
    private final String onboardingStep;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("vendor")
    private final String sdkVendor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("screenName")
    private final String screenName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("screenNameFlowConfiguration")
    private final kg.w screenFlowConfiguration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportDeeplink")
    private final String supportDeeplink;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("pollingInterval")
    private final Integer pollingInterval;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("identityId")
    private final String identityId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("registeredIdentityId")
    private final String registeredIdentityId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getApplicableCountries() {
        return this.applicableCountries;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApplicableDocumentsScope() {
        return this.applicableDocumentsScope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getDataPoints() {
        return this.dataPoints;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.method, eVar.method) && Intrinsics.f(this.applicableDocumentsScope, eVar.applicableDocumentsScope) && Intrinsics.f(this.applicableCountries, eVar.applicableCountries) && Intrinsics.f(this.formId, eVar.formId) && Intrinsics.f(this.formParams, eVar.formParams) && Intrinsics.f(this.dataPoints, eVar.dataPoints) && Intrinsics.f(this.screenConfiguration, eVar.screenConfiguration) && Intrinsics.f(this.authenticationMethod, eVar.authenticationMethod) && Intrinsics.f(this.signatureProcessType, eVar.signatureProcessType) && Intrinsics.f(this.onboardingStep, eVar.onboardingStep) && Intrinsics.f(this.sdkVendor, eVar.sdkVendor) && Intrinsics.f(this.screenName, eVar.screenName) && Intrinsics.f(this.screenFlowConfiguration, eVar.screenFlowConfiguration) && Intrinsics.f(this.supportDeeplink, eVar.supportDeeplink) && Intrinsics.f(this.pollingInterval, eVar.pollingInterval) && Intrinsics.f(this.identityId, eVar.identityId) && Intrinsics.f(this.registeredIdentityId, eVar.registeredIdentityId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Map getFormParams() {
        return this.formParams;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getIdentityId() {
        return this.identityId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final int hashCode() {
        String str = this.method;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.applicableDocumentsScope;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.applicableCountries;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.formId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.formParams;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        List<f> list2 = this.dataPoints;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        k kVar = this.screenConfiguration;
        int iHashCode7 = (iHashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str4 = this.authenticationMethod;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.signatureProcessType;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.onboardingStep;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sdkVendor;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.screenName;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        kg.w wVar = this.screenFlowConfiguration;
        int iHashCode13 = (iHashCode12 + (wVar == null ? 0 : wVar.f183891a.hashCode())) * 31;
        String str9 = this.supportDeeplink;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.pollingInterval;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.identityId;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.registeredIdentityId;
        return iHashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOnboardingStep() {
        return this.onboardingStep;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getPollingInterval() {
        return this.pollingInterval;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final k getScreenConfiguration() {
        return this.screenConfiguration;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final kg.w getScreenFlowConfiguration() {
        return this.screenFlowConfiguration;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSdkVendor() {
        return this.sdkVendor;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSignatureProcessType() {
        return this.signatureProcessType;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getSupportDeeplink() {
        return this.supportDeeplink;
    }
}
