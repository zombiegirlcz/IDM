package qzf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqzf/b0;", "", "", "toString", "()Ljava/lang/String;", "", "Lqzf/c0;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "start", "b", "end", "Lqzf/d0;", "Lqzf/d0;", "()Lqzf/d0;", "pickup", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    private final List<c0> start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    private final List<c0> end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pickup")
    private final d0 pickup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d0 getPickup() {
        return this.pickup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getStart() {
        return this.start;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.start, b0Var.start) && Intrinsics.f(this.end, b0Var.end) && Intrinsics.f(this.pickup, b0Var.pickup);
    }

    public final int hashCode() {
        List<c0> list = this.start;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<c0> list2 = this.end;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        d0 d0Var = this.pickup;
        return iHashCode2 + (d0Var != null ? d0Var.hashCode() : 0);
    }
}
