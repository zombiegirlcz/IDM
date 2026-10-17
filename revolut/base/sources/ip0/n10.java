package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class n10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165439c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165441h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f165442j;

    public n10(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f165437a = z;
        this.f165438b = z3;
        this.f165439c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165440g = z29;
        this.f165441h = z31;
        this.i = z41;
        this.f165442j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n10)) {
            return false;
        }
        n10 n10Var = (n10) obj2;
        return this.f165437a == n10Var.f165437a && this.f165438b == n10Var.f165438b && this.f165439c == n10Var.f165439c && this.d == n10Var.d && this.e == n10Var.e && this.f == n10Var.f && this.f165440g == n10Var.f165440g && this.f165441h == n10Var.f165441h && this.i == n10Var.i && this.f165442j == n10Var.f165442j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165442j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165437a) * 31, 31, this.f165438b), 31, this.f165439c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165440g), 31, this.f165441h), 31, this.i);
    }
}
