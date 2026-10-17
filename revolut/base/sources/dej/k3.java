package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2 f113584b;

    public k3(String icon, m2 severity) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(severity, "severity");
        this.f113583a = icon;
        this.f113584b = severity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.f113583a, k3Var.f113583a) && this.f113584b == k3Var.f113584b;
    }

    public final int hashCode() {
        return this.f113584b.hashCode() + (this.f113583a.hashCode() * 31);
    }
}
