package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pd0 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f165815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165817c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165819h;
    public final boolean i;

    public pd0(Object obj2, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f165815a = obj2;
        this.f165816b = z;
        this.f165817c = z3;
        this.d = z4;
        this.e = z6;
        this.f = z11;
        this.f165818g = z12;
        this.f165819h = z29;
        this.i = z31;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pd0)) {
            return false;
        }
        pd0 pd0Var = (pd0) obj2;
        return Intrinsics.f(this.f165815a, pd0Var.f165815a) && this.f165816b == pd0Var.f165816b && this.f165817c == pd0Var.f165817c && this.d == pd0Var.d && this.e == pd0Var.e && this.f == pd0Var.f && this.f165818g == pd0Var.f165818g && this.f165819h == pd0Var.f165819h && this.i == pd0Var.i;
    }

    public final int hashCode() {
        Object obj2 = this.f165815a;
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((obj2 == null ? 0 : obj2.hashCode()) * 31, 31, this.f165816b), 31, this.f165817c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165818g), 31, this.f165819h);
    }
}
