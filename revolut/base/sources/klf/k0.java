package klf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f185520a;

    public k0(j0 j0Var) {
        this.f185520a = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f185520a, ((k0) obj2).f185520a);
    }

    public final int hashCode() {
        j0 j0Var = this.f185520a;
        if (j0Var == null) {
            return 0;
        }
        return j0Var.hashCode();
    }
}
