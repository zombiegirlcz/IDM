package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f113580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f113581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f113582c;

    public k2(q2 q2Var, j2 j2Var, p2 p2Var) {
        this.f113580a = q2Var;
        this.f113581b = j2Var;
        this.f113582c = p2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Intrinsics.f(this.f113580a, k2Var.f113580a) && Intrinsics.f(this.f113581b, k2Var.f113581b) && Intrinsics.f(this.f113582c, k2Var.f113582c);
    }

    public final int hashCode() {
        q2 q2Var = this.f113580a;
        int iHashCode = (q2Var == null ? 0 : q2Var.hashCode()) * 31;
        j2 j2Var = this.f113581b;
        int iHashCode2 = (iHashCode + (j2Var == null ? 0 : j2Var.hashCode())) * 31;
        p2 p2Var = this.f113582c;
        return iHashCode2 + (p2Var != null ? p2Var.hashCode() : 0);
    }
}
