package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class x8 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167106c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167108h;
    public final boolean i;

    public x8(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f167104a = z;
        this.f167105b = z3;
        this.f167106c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167107g = z29;
        this.f167108h = z31;
        this.i = z41;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f167107g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj2;
        return this.f167104a == x8Var.f167104a && this.f167105b == x8Var.f167105b && this.f167106c == x8Var.f167106c && this.d == x8Var.d && this.e == x8Var.e && this.f == x8Var.f && this.f167107g == x8Var.f167107g && this.f167108h == x8Var.f167108h && this.i == x8Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167104a) * 31, 31, this.f167105b), 31, this.f167106c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167107g), 31, this.f167108h);
    }
}
