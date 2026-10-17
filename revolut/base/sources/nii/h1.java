package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f216166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216168c;
    public final boolean d;
    public final boolean e;

    public h1(l0 configuration, boolean z, n base, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216166a = configuration;
        this.f216167b = z;
        this.f216168c = base;
        this.d = z3;
        this.e = z4;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216168c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f216166a, h1Var.f216166a) && this.f216167b == h1Var.f216167b && this.f216168c.equals(h1Var.f216168c) && this.d == h1Var.d && this.e == h1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c((this.f216168c.hashCode() + j6.a.c(this.f216166a.hashCode() * 31, 31, this.f216167b)) * 31, 31, this.d);
    }
}
