package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f185392b;

    public u0(String description, t0 t0Var) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f185391a = description;
        this.f185392b = t0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f185391a, u0Var.f185391a) && Intrinsics.f(this.f185392b, u0Var.f185392b);
    }

    public final int hashCode() {
        int iHashCode = this.f185391a.hashCode() * 31;
        t0 t0Var = this.f185392b;
        return iHashCode + (t0Var == null ? 0 : t0Var.hashCode());
    }
}
