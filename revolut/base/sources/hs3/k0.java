package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f154901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f154902b;

    public k0(c cVar, j0 layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f154901a = layout;
        this.f154902b = cVar;
    }

    public static k0 a(k0 k0Var, c cVar) {
        j0 layout = k0Var.f154901a;
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new k0(cVar, layout);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f154901a == k0Var.f154901a && Intrinsics.f(this.f154902b, k0Var.f154902b);
    }

    public final int hashCode() {
        int iHashCode = this.f154901a.hashCode() * 31;
        c cVar = this.f154902b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
