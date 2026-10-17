package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f143738a;

    public k(b1 b1Var) {
        this.f143738a = b1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f143738a, ((k) obj2).f143738a);
    }

    public final int hashCode() {
        b1 b1Var = this.f143738a;
        if (b1Var == null) {
            return 0;
        }
        return b1Var.hashCode();
    }
}
