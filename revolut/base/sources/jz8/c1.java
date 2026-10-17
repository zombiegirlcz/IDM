package jz8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f179608b;

    public c1(String id10, u0 u0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f179607a = id10;
        this.f179608b = u0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f179607a, c1Var.f179607a) && Intrinsics.f(this.f179608b, c1Var.f179608b);
    }

    public final int hashCode() {
        int iHashCode = this.f179607a.hashCode() * 31;
        u0 u0Var = this.f179608b;
        return iHashCode + (u0Var == null ? 0 : u0Var.hashCode());
    }
}
