package tx0;

/* JADX INFO: loaded from: classes20.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f275226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f275228c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public q0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f275226a = z;
        this.f275227b = z3;
        this.f275228c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean a() {
        return this.f;
    }

    public final boolean b() {
        return this.f275228c;
    }

    public final boolean c() {
        return this.f275227b;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f275226a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f275226a == q0Var.f275226a && this.f275227b == q0Var.f275227b && this.f275228c == q0Var.f275228c && this.d == q0Var.d && this.e == q0Var.e && this.f == q0Var.f;
    }

    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f275226a) * 31, 31, this.f275227b), 31, this.f275228c), 31, this.d), 31, this.e);
    }
}
