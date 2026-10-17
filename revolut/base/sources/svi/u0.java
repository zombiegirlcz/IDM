package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f266001b;

    public u0(String icon, a1 a1Var) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f266000a = icon;
        this.f266001b = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f266000a, u0Var.f266000a) && this.f266001b == u0Var.f266001b;
    }

    public final int hashCode() {
        int iHashCode = this.f266000a.hashCode() * 31;
        a1 a1Var = this.f266001b;
        return iHashCode + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
