package tw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f274856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f274857b;

    public n0(Object obj2, boolean z) {
        this.f274856a = z;
        this.f274857b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f274856a == n0Var.f274856a && Intrinsics.f(this.f274857b, n0Var.f274857b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f274856a) * 31;
        Object obj2 = this.f274857b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
