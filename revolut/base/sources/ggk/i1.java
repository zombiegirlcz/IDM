package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f143730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f143731b;

    public i1(l1 primary, l1 l1Var) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f143730a = primary;
        this.f143731b = l1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f143730a, i1Var.f143730a) && Intrinsics.f(this.f143731b, i1Var.f143731b);
    }

    public final int hashCode() {
        int iHashCode = this.f143730a.hashCode() * 31;
        l1 l1Var = this.f143731b;
        return iHashCode + (l1Var == null ? 0 : l1Var.hashCode());
    }
}
