package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143737b;

    public j1(String icon, String title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f143736a = icon;
        this.f143737b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f143736a, j1Var.f143736a) && Intrinsics.f(this.f143737b, j1Var.f143737b);
    }

    public final int hashCode() {
        return this.f143737b.hashCode() + (this.f143736a.hashCode() * 31);
    }
}
