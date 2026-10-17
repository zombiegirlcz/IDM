package ts0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f273898a;

    public p0(l0 l0Var) {
        this.f273898a = l0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f273898a, ((p0) obj2).f273898a);
    }

    public final int hashCode() {
        l0 l0Var = this.f273898a;
        if (l0Var == null) {
            return 0;
        }
        return l0Var.hashCode();
    }
}
