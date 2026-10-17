package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173447c;

    public g0(String title, String subtitle, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f173445a = title;
        this.f173446b = subtitle;
        this.f173447c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f173445a, g0Var.f173445a) && Intrinsics.f(this.f173446b, g0Var.f173446b) && Intrinsics.f(this.f173447c, g0Var.f173447c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f173445a.hashCode() * 31, 31, this.f173446b);
        String str = this.f173447c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
