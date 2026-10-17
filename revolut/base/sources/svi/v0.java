package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f266008b;

    public v0(String iconStr, a1 a1Var) {
        Intrinsics.checkNotNullParameter(iconStr, "iconStr");
        this.f266007a = iconStr;
        this.f266008b = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f266007a, v0Var.f266007a) && this.f266008b == v0Var.f266008b;
    }

    public final int hashCode() {
        int iHashCode = this.f266007a.hashCode() * 31;
        a1 a1Var = this.f266008b;
        return iHashCode + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
