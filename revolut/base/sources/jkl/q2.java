package jkl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\n¨\u0006\u0014"}, d2 = {"Ljkl/q2;", "", "", "toString", "()Ljava/lang/String;", "", "Ljkl/i0;", "a", "Ljava/util/List;", "getClaims", "()Ljava/util/List;", "claims", "Ljkl/y1;", "b", "getEvidences", "evidences", "Ljkl/p2;", "c", "getScopes", "scopes", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("claims")
    private final List<i0> claims;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("evidence")
    private final List<y1> evidences;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("scopes")
    private final List<p2> scopes;

    public q2(ArrayList arrayList, List list, List list2) {
        this.claims = list;
        this.evidences = list2;
        this.scopes = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.claims, q2Var.claims) && Intrinsics.f(this.evidences, q2Var.evidences) && Intrinsics.f(this.scopes, q2Var.scopes);
    }

    public final int hashCode() {
        List<i0> list = this.claims;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<y1> list2 = this.evidences;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<p2> list3 = this.scopes;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
