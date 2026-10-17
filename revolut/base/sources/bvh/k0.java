package bvh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"Lbvh/k0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "vendorSideProjectId", "b", "c", "vendorSidePlanId", "e", "vendorSideWorkflowId", "vendorSideApiUri", "vendorSideConsentConfigurationId", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("vendorSideProjectId")
    private final String vendorSideProjectId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("vendorSidePlanId")
    private final String vendorSidePlanId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("vendorSideWorkflowId")
    private final String vendorSideWorkflowId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("vendorSideApiUri")
    private final String vendorSideApiUri;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("vendorSideConsentConfigurationId")
    private final String vendorSideConsentConfigurationId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getVendorSideApiUri() {
        return this.vendorSideApiUri;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getVendorSideConsentConfigurationId() {
        return this.vendorSideConsentConfigurationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getVendorSidePlanId() {
        return this.vendorSidePlanId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVendorSideProjectId() {
        return this.vendorSideProjectId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVendorSideWorkflowId() {
        return this.vendorSideWorkflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.vendorSideProjectId, k0Var.vendorSideProjectId) && Intrinsics.f(this.vendorSidePlanId, k0Var.vendorSidePlanId) && Intrinsics.f(this.vendorSideWorkflowId, k0Var.vendorSideWorkflowId) && Intrinsics.f(this.vendorSideApiUri, k0Var.vendorSideApiUri) && Intrinsics.f(this.vendorSideConsentConfigurationId, k0Var.vendorSideConsentConfigurationId);
    }

    public final int hashCode() {
        String str = this.vendorSideProjectId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vendorSidePlanId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorSideWorkflowId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vendorSideApiUri;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vendorSideConsentConfigurationId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
