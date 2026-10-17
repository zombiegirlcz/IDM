package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class o20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165614c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165616h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f165617j;
    public final boolean k;

    public o20(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f165612a = z;
        this.f165613b = z3;
        this.f165614c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165615g = z29;
        this.f165616h = z31;
        this.i = z41;
        this.f165617j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o20)) {
            return false;
        }
        o20 o20Var = (o20) obj2;
        return this.f165612a == o20Var.f165612a && this.f165613b == o20Var.f165613b && this.f165614c == o20Var.f165614c && this.d == o20Var.d && this.e == o20Var.e && this.f == o20Var.f && this.f165615g == o20Var.f165615g && this.f165616h == o20Var.f165616h && this.i == o20Var.i && this.f165617j == o20Var.f165617j && this.k == o20Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165612a) * 31, 31, this.f165613b), 31, this.f165614c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165615g), 31, this.f165616h), 31, this.i), 31, this.f165617j);
    }
}
