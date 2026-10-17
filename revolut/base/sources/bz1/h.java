package bz1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u000b\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\u0010\u0010\"¨\u0006$"}, d2 = {"Lbz1/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "status", "", "Lbz1/i;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "terms", "c", "f", "termsUris", "Lbz1/k;", "Lbz1/k;", "g", "()Lbz1/k;", "userDetails", "h", "workflowId", "Lbz1/b;", "accountsDetails", "Lbz1/g;", "Lbz1/g;", "()Lbz1/g;", "details", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "requiresReactivation", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms")
    private final List<i> terms;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsUris")
    private final List<String> termsUris;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("userDetails")
    private final k userDetails;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("workflowId")
    private final String workflowId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("accountsDetails")
    private final List<b> accountsDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final g details;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresReactivation")
    private final Boolean requiresReactivation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccountsDetails() {
        return this.accountsDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getRequiresReactivation() {
        return this.requiresReactivation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getTerms() {
        return this.terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.status, hVar.status) && Intrinsics.f(this.terms, hVar.terms) && Intrinsics.f(this.termsUris, hVar.termsUris) && Intrinsics.f(this.userDetails, hVar.userDetails) && Intrinsics.f(this.workflowId, hVar.workflowId) && Intrinsics.f(this.accountsDetails, hVar.accountsDetails) && Intrinsics.f(this.details, hVar.details) && Intrinsics.f(this.requiresReactivation, hVar.requiresReactivation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getTermsUris() {
        return this.termsUris;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getUserDetails() {
        return this.userDetails;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        List<i> list = this.terms;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.termsUris;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        k kVar = this.userDetails;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.workflowId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<b> list3 = this.accountsDetails;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        g gVar = this.details;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.requiresReactivation;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }
}
