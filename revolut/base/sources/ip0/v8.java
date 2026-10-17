package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166783c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166785h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166786j;
    public final boolean k;

    public v8(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f166781a = z;
        this.f166782b = z3;
        this.f166783c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166784g = z29;
        this.f166785h = z31;
        this.i = z41;
        this.f166786j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj2;
        return this.f166781a == v8Var.f166781a && this.f166782b == v8Var.f166782b && this.f166783c == v8Var.f166783c && this.d == v8Var.d && this.e == v8Var.e && this.f == v8Var.f && this.f166784g == v8Var.f166784g && this.f166785h == v8Var.f166785h && this.i == v8Var.i && this.f166786j == v8Var.f166786j && this.k == v8Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166781a) * 31, 31, this.f166782b), 31, this.f166783c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166784g), 31, this.f166785h), 31, this.i), 31, this.f166786j);
    }
}
