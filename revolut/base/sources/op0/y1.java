package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227484c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f227485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227486h;
    public final boolean i;

    public y1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f227482a = z;
        this.f227483b = z3;
        this.f227484c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f227485g = z29;
        this.f227486h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return this.f227482a == y1Var.f227482a && this.f227483b == y1Var.f227483b && this.f227484c == y1Var.f227484c && this.d == y1Var.d && this.e == y1Var.e && this.f == y1Var.f && this.f227485g == y1Var.f227485g && this.f227486h == y1Var.f227486h && this.i == y1Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227482a) * 31, 31, this.f227483b), 31, this.f227484c), 31, this.d), 31, this.e), 31, this.f), 31, this.f227485g), 31, this.f227486h);
    }
}
