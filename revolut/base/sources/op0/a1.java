package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227159c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f227160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227161h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f227162j;

    public a1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f227157a = z;
        this.f227158b = z3;
        this.f227159c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f227160g = z29;
        this.f227161h = z31;
        this.i = z41;
        this.f227162j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f227157a == a1Var.f227157a && this.f227158b == a1Var.f227158b && this.f227159c == a1Var.f227159c && this.d == a1Var.d && this.e == a1Var.e && this.f == a1Var.f && this.f227160g == a1Var.f227160g && this.f227161h == a1Var.f227161h && this.i == a1Var.i && this.f227162j == a1Var.f227162j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227162j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227157a) * 31, 31, this.f227158b), 31, this.f227159c), 31, this.d), 31, this.e), 31, this.f), 31, this.f227160g), 31, this.f227161h), 31, this.i);
    }
}
