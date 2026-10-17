package bvh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lbvh/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "uri", "b", "token", "", "Lbvh/a0;", "Ljava/util/List;", "()Ljava/util/List;", "redirects", "Lbvh/k0;", "d", "Lbvh/k0;", "()Lbvh/k0;", "vendorSideAttributes", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("uri")
    private final String uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    private final String token;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("redirects")
    private final List<a0> redirects;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("vendorSideAttributes")
    private final k0 vendorSideAttributes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getRedirects() {
        return this.redirects;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k0 getVendorSideAttributes() {
        return this.vendorSideAttributes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.uri, pVar.uri) && Intrinsics.f(this.token, pVar.token) && Intrinsics.f(this.redirects, pVar.redirects) && Intrinsics.f(this.vendorSideAttributes, pVar.vendorSideAttributes);
    }

    public final int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<a0> list = this.redirects;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        k0 k0Var = this.vendorSideAttributes;
        return iHashCode3 + (k0Var != null ? k0Var.hashCode() : 0);
    }
}
