package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class v5 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166770c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166772h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166773j;

    public v5(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f166768a = z;
        this.f166769b = z3;
        this.f166770c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166771g = z29;
        this.f166772h = z31;
        this.i = z41;
        this.f166773j = z49;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj2;
        return this.f166768a == v5Var.f166768a && this.f166769b == v5Var.f166769b && this.f166770c == v5Var.f166770c && this.d == v5Var.d && this.e == v5Var.e && this.f == v5Var.f && this.f166771g == v5Var.f166771g && this.f166772h == v5Var.f166772h && this.i == v5Var.i && this.f166773j == v5Var.f166773j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166773j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166768a) * 31, 31, this.f166769b), 31, this.f166770c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166771g), 31, this.f166772h), 31, this.i);
    }
}
