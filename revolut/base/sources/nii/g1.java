package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f216163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216165c;
    public final boolean d;
    public final boolean e;

    public g1(j0 configuration, boolean z, n base, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216163a = configuration;
        this.f216164b = z;
        this.f216165c = base;
        this.d = z3;
        this.e = z4;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216165c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f216163a, g1Var.f216163a) && this.f216164b == g1Var.f216164b && this.f216165c.equals(g1Var.f216165c) && this.d == g1Var.d && this.e == g1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c((this.f216165c.hashCode() + j6.a.c(this.f216163a.hashCode() * 31, 31, this.f216164b)) * 31, 31, this.d);
    }
}
