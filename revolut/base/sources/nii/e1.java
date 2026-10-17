package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f216143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f216145c;
    public final boolean d;

    public e1(e0 configuration, boolean z, n base, boolean z3) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(base, "base");
        this.f216143a = configuration;
        this.f216144b = z;
        this.f216145c = base;
        this.d = z3;
    }

    @Override // nii.i1
    public final n a() {
        return this.f216145c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f216143a, e1Var.f216143a) && this.f216144b == e1Var.f216144b && this.f216145c.equals(e1Var.f216145c) && this.d == e1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f216145c.hashCode() + j6.a.c(this.f216143a.hashCode() * 31, 31, this.f216144b)) * 31);
    }
}
