package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164179c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164180g;

    public f1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f164177a = z;
        this.f164178b = z3;
        this.f164179c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164180g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return this.f164177a == f1Var.f164177a && this.f164178b == f1Var.f164178b && this.f164179c == f1Var.f164179c && this.d == f1Var.d && this.e == f1Var.e && this.f == f1Var.f && this.f164180g == f1Var.f164180g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164180g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164177a) * 31, 31, this.f164178b), 31, this.f164179c), 31, this.d), 31, this.e), 31, this.f);
    }
}
