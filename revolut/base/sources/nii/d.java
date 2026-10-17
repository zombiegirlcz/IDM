package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f216133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f216134b;

    public d(Object obj2, n1 n1Var) {
        this.f216133a = obj2;
        this.f216134b = n1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f216133a, dVar.f216133a) && Intrinsics.f(this.f216134b, dVar.f216134b);
    }

    public final int hashCode() {
        Object obj2 = this.f216133a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        n1 n1Var = this.f216134b;
        return iHashCode + (n1Var != null ? n1Var.hashCode() : 0);
    }
}
