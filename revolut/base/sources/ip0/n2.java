package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165445c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165447h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f165448j;

    public n2(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f165443a = z;
        this.f165444b = z3;
        this.f165445c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165446g = z29;
        this.f165447h = z31;
        this.i = z41;
        this.f165448j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return this.f165443a == n2Var.f165443a && this.f165444b == n2Var.f165444b && this.f165445c == n2Var.f165445c && this.d == n2Var.d && this.e == n2Var.e && this.f == n2Var.f && this.f165446g == n2Var.f165446g && this.f165447h == n2Var.f165447h && this.i == n2Var.i && this.f165448j == n2Var.f165448j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165448j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165443a) * 31, 31, this.f165444b), 31, this.f165445c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165446g), 31, this.f165447h), 31, this.i);
    }
}
