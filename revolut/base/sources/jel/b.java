package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f173409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f173410b;

    public b(z2 z2Var, x2 x2Var) {
        this.f173409a = z2Var;
        this.f173410b = x2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f173409a, bVar.f173409a) && Intrinsics.f(this.f173410b, bVar.f173410b);
    }

    public final int hashCode() {
        z2 z2Var = this.f173409a;
        int iHashCode = (z2Var == null ? 0 : z2Var.hashCode()) * 31;
        x2 x2Var = this.f173410b;
        return iHashCode + (x2Var != null ? x2Var.hashCode() : 0);
    }
}
