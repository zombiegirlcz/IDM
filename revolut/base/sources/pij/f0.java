package pij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f236544a;

    public f0() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f236544a, ((f0) obj2).f236544a);
    }

    @Override // pij.h0
    public final c0 getView() {
        return this.f236544a;
    }

    public final int hashCode() {
        c0 c0Var = this.f236544a;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.hashCode();
    }

    public f0(c0 c0Var) {
        this.f236544a = c0Var;
    }
}
