package v30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f285812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f285813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f285814c;

    public p0(List list, List list2, q0 q0Var, int i) {
        list = (i & 1) != 0 ? null : list;
        list2 = (i & 4) != 0 ? null : list2;
        this.f285812a = list;
        this.f285813b = list2;
        this.f285814c = q0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f285812a, p0Var.f285812a) && Intrinsics.f(this.f285813b, p0Var.f285813b) && Intrinsics.f(this.f285814c, p0Var.f285814c);
    }

    public final int hashCode() {
        List list = this.f285812a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 961;
        List list2 = this.f285813b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        q0 q0Var = this.f285814c;
        return iHashCode2 + (q0Var != null ? q0Var.hashCode() : 0);
    }
}
