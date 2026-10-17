package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164782c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164784h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f164785j;
    public final boolean k;

    public j20(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f164780a = z;
        this.f164781b = z3;
        this.f164782c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164783g = z29;
        this.f164784h = z31;
        this.i = z41;
        this.f164785j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j20)) {
            return false;
        }
        j20 j20Var = (j20) obj2;
        return this.f164780a == j20Var.f164780a && this.f164781b == j20Var.f164781b && this.f164782c == j20Var.f164782c && this.d == j20Var.d && this.e == j20Var.e && this.f == j20Var.f && this.f164783g == j20Var.f164783g && this.f164784h == j20Var.f164784h && this.i == j20Var.i && this.f164785j == j20Var.f164785j && this.k == j20Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164780a) * 31, 31, this.f164781b), 31, this.f164782c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164783g), 31, this.f164784h), 31, this.i), 31, this.f164785j);
    }
}
