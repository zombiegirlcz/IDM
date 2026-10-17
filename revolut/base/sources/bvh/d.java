package bvh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbvh/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCheckId", "checkId", "b", "getProviderClosingUri", "providerClosingUri", "Lbvh/j0;", "c", "Lbvh/j0;", "getUpdatedExternalRef", "()Lbvh/j0;", "updatedExternalRef", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkId")
    private final String checkId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("providerClosingUri")
    private final String providerClosingUri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedExternalRef")
    private final j0 updatedExternalRef;

    public d(String str, String str2, j0 j0Var) {
        this.checkId = str;
        this.providerClosingUri = str2;
        this.updatedExternalRef = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.checkId, dVar.checkId) && Intrinsics.f(this.providerClosingUri, dVar.providerClosingUri) && Intrinsics.f(this.updatedExternalRef, dVar.updatedExternalRef);
    }

    public final int hashCode() {
        String str = this.checkId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.providerClosingUri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        j0 j0Var = this.updatedExternalRef;
        return iHashCode2 + (j0Var != null ? j0Var.hashCode() : 0);
    }
}
