package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z0 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f216255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216257c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public z0(t configuration, boolean z, n base, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216255a = configuration;
        this.f216256b = z;
        this.f216257c = base;
        this.d = z3;
        this.e = z4;
        this.f = z6;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216257c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f216255a, z0Var.f216255a) && this.f216256b == z0Var.f216256b && this.f216257c.equals(z0Var.f216257c) && this.d == z0Var.d && this.e == z0Var.e && this.f == z0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c((this.f216257c.hashCode() + j6.a.c(this.f216255a.hashCode() * 31, 31, this.f216256b)) * 31, 31, this.d), 31, this.e);
    }
}
