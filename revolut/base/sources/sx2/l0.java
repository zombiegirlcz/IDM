package sx2;

/* JADX INFO: loaded from: classes21.dex */
public final class l0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f266304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f266305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f266306c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f266307g;

    public l0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f266304a = z;
        this.f266305b = z3;
        this.f266306c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f266307g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f266304a == l0Var.f266304a && this.f266305b == l0Var.f266305b && this.f266306c == l0Var.f266306c && this.d == l0Var.d && this.e == l0Var.e && this.f == l0Var.f && this.f266307g == l0Var.f266307g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266307g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f266304a) * 31, 31, this.f266305b), 31, this.f266306c), 31, this.d), 31, this.e), 31, this.f);
    }
}
