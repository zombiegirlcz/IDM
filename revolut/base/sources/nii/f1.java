package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f216148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216150c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f216151g;

    public f1(g0 configuration, boolean z, n base, boolean z3, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216148a = configuration;
        this.f216149b = z;
        this.f216150c = base;
        this.d = z3;
        this.e = z4;
        this.f = z6;
        this.f216151g = z11;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216150c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f216148a, f1Var.f216148a) && this.f216149b == f1Var.f216149b && this.f216150c.equals(f1Var.f216150c) && this.d == f1Var.d && this.e == f1Var.e && this.f == f1Var.f && this.f216151g == f1Var.f216151g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216151g) + j6.a.c(j6.a.c(j6.a.c((this.f216150c.hashCode() + j6.a.c(this.f216148a.hashCode() * 31, 31, this.f216149b)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
