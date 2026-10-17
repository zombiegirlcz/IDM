package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f216118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216120c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f216122h;

    public b1(z configuration, boolean z, n base, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216118a = configuration;
        this.f216119b = z;
        this.f216120c = base;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f216121g = z11;
        this.f216122h = z12;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216120c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f216118a, b1Var.f216118a) && this.f216119b == b1Var.f216119b && this.f216120c.equals(b1Var.f216120c) && this.d == b1Var.d && this.e == b1Var.e && this.f == b1Var.f && this.f216121g == b1Var.f216121g && this.f216122h == b1Var.f216122h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216122h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f216120c.hashCode() + j6.a.c(this.f216118a.hashCode() * 31, 31, this.f216119b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f216121g);
    }
}
