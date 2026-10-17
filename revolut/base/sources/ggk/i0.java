package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f143729a;

    public i0(l0 l0Var) {
        this.f143729a = l0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f143729a, ((i0) obj2).f143729a);
    }

    public final int hashCode() {
        l0 l0Var = this.f143729a;
        if (l0Var == null) {
            return 0;
        }
        return l0Var.hashCode();
    }
}
