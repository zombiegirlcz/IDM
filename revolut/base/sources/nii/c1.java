package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f216130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216132c;
    public final boolean d;

    public c1(b0 configuration, boolean z, n base, boolean z3) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216130a = configuration;
        this.f216131b = z;
        this.f216132c = base;
        this.d = z3;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216132c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f216130a, c1Var.f216130a) && this.f216131b == c1Var.f216131b && this.f216132c.equals(c1Var.f216132c) && this.d == c1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f216132c.hashCode() + j6.a.c(this.f216130a.hashCode() * 31, 31, this.f216131b)) * 31);
    }
}
