package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143809c;

    public z0(String title, String icon, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f143807a = title;
        this.f143808b = icon;
        this.f143809c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f143807a, z0Var.f143807a) && Intrinsics.f(this.f143808b, z0Var.f143808b) && Intrinsics.f(this.f143809c, z0Var.f143809c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f143807a.hashCode() * 31, 31, this.f143808b);
        String str = this.f143809c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
