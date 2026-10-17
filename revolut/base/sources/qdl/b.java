package qdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lqdl/b;", "", "", "toString", "()Ljava/lang/String;", "Lqdl/d;", "a", "Lqdl/d;", "b", "()Lqdl/d;", "state", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "deactivationDurationMillis", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final d state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("deactivationDurationMillis")
    private final Long deactivationDurationMillis;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getDeactivationDurationMillis() {
        return this.deactivationDurationMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.state == bVar.state && Intrinsics.f(this.deactivationDurationMillis, bVar.deactivationDurationMillis);
    }

    public final int hashCode() {
        d dVar = this.state;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        Long l2 = this.deactivationDurationMillis;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
