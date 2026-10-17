package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f216135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216137c;
    public final boolean d;
    public final boolean e;

    public d1(c0 configuration, boolean z, n base, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216135a = configuration;
        this.f216136b = z;
        this.f216137c = base;
        this.d = z3;
        this.e = z4;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216137c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f216135a, d1Var.f216135a) && this.f216136b == d1Var.f216136b && this.f216137c.equals(d1Var.f216137c) && this.d == d1Var.d && this.e == d1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c((this.f216137c.hashCode() + j6.a.c(this.f216135a.hashCode() * 31, 31, this.f216136b)) * 31, 31, this.d);
    }
}
