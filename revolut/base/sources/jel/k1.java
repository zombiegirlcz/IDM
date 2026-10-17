package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173491b;

    public k1(String label, String icon) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f173490a = label;
        this.f173491b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f173490a, k1Var.f173490a) && Intrinsics.f(this.f173491b, k1Var.f173491b);
    }

    public final int hashCode() {
        return this.f173491b.hashCode() + (this.f173490a.hashCode() * 31);
    }
}
