package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166915c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166917h;

    public w1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f166913a = z;
        this.f166914b = z3;
        this.f166915c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166916g = z29;
        this.f166917h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return this.f166913a == w1Var.f166913a && this.f166914b == w1Var.f166914b && this.f166915c == w1Var.f166915c && this.d == w1Var.d && this.e == w1Var.e && this.f == w1Var.f && this.f166916g == w1Var.f166916g && this.f166917h == w1Var.f166917h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166917h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166913a) * 31, 31, this.f166914b), 31, this.f166915c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166916g);
    }
}
