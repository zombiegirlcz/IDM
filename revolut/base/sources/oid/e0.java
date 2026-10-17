package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f225627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f225628b;

    public e0() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f225627a, e0Var.f225627a) && Intrinsics.f(this.f225628b, e0Var.f225628b);
    }

    public final int hashCode() {
        f0 f0Var = this.f225627a;
        int iHashCode = (f0Var == null ? 0 : f0Var.hashCode()) * 31;
        g0 g0Var = this.f225628b;
        return (iHashCode + (g0Var != null ? g0Var.hashCode() : 0)) * 31;
    }

    public e0(f0 f0Var, g0 g0Var, int i) {
        f0Var = (i & 1) != 0 ? null : f0Var;
        g0Var = (i & 2) != 0 ? null : g0Var;
        this.f225627a = f0Var;
        this.f225628b = g0Var;
    }
}
