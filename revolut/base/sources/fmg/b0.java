package fmg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f136413b;

    public b0(int i, k0 tintColor) {
        Intrinsics.checkNotNullParameter(tintColor, "tintColor");
        this.f136412a = i;
        this.f136413b = tintColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f136412a == b0Var.f136412a && this.f136413b == b0Var.f136413b;
    }

    public final int hashCode() {
        return this.f136413b.hashCode() + (Integer.hashCode(this.f136412a) * 31);
    }
}
