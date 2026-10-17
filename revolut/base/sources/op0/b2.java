package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227185c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f227186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227187h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f227188j;

    public b2(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f227183a = z;
        this.f227184b = z3;
        this.f227185c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f227186g = z29;
        this.f227187h = z31;
        this.i = z41;
        this.f227188j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return this.f227183a == b2Var.f227183a && this.f227184b == b2Var.f227184b && this.f227185c == b2Var.f227185c && this.d == b2Var.d && this.e == b2Var.e && this.f == b2Var.f && this.f227186g == b2Var.f227186g && this.f227187h == b2Var.f227187h && this.i == b2Var.i && this.f227188j == b2Var.f227188j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227188j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227183a) * 31, 31, this.f227184b), 31, this.f227185c), 31, this.d), 31, this.e), 31, this.f), 31, this.f227186g), 31, this.f227187h), 31, this.i);
    }
}
