package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f113616a;

    public p2(l2 l2Var) {
        this.f113616a = l2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p2) && Intrinsics.f(this.f113616a, ((p2) obj2).f113616a);
    }

    public final int hashCode() {
        l2 l2Var = this.f113616a;
        if (l2Var == null) {
            return 0;
        }
        return l2Var.hashCode();
    }
}
