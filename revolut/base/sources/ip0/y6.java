package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class y6 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167253c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167255h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f167256j;
    public final boolean k;

    public y6(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f167251a = z;
        this.f167252b = z3;
        this.f167253c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167254g = z29;
        this.f167255h = z31;
        this.i = z41;
        this.f167256j = z49;
        this.k = z54;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj2;
        return this.f167251a == y6Var.f167251a && this.f167252b == y6Var.f167252b && this.f167253c == y6Var.f167253c && this.d == y6Var.d && this.e == y6Var.e && this.f == y6Var.f && this.f167254g == y6Var.f167254g && this.f167255h == y6Var.f167255h && this.i == y6Var.i && this.f167256j == y6Var.f167256j && this.k == y6Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167251a) * 31, 31, this.f167252b), 31, this.f167253c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167254g), 31, this.f167255h), 31, this.i), 31, this.f167256j);
    }
}
