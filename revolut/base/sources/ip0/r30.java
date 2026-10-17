package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class r30 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166100c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166102h;

    public r30(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f166098a = z;
        this.f166099b = z3;
        this.f166100c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166101g = z29;
        this.f166102h = z31;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f166102h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r30)) {
            return false;
        }
        r30 r30Var = (r30) obj2;
        return this.f166098a == r30Var.f166098a && this.f166099b == r30Var.f166099b && this.f166100c == r30Var.f166100c && this.d == r30Var.d && this.e == r30Var.e && this.f == r30Var.f && this.f166101g == r30Var.f166101g && this.f166102h == r30Var.f166102h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166102h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166098a) * 31, 31, this.f166099b), 31, this.f166100c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166101g);
    }
}
