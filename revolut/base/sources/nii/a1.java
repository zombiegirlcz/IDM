package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f216108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216110c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public a1(v configuration, boolean z, n base, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216108a = configuration;
        this.f216109b = z;
        this.f216110c = base;
        this.d = z3;
        this.e = z4;
        this.f = z6;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216110c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f216108a, a1Var.f216108a) && this.f216109b == a1Var.f216109b && this.f216110c.equals(a1Var.f216110c) && this.d == a1Var.d && this.e == a1Var.e && this.f == a1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c((this.f216110c.hashCode() + j6.a.c(this.f216108a.hashCode() * 31, 31, this.f216109b)) * 31, 31, this.d), 31, this.e);
    }
}
