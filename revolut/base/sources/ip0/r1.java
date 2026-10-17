package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166080c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166082h;

    public r1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f166078a = z;
        this.f166079b = z3;
        this.f166080c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166081g = z29;
        this.f166082h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return this.f166078a == r1Var.f166078a && this.f166079b == r1Var.f166079b && this.f166080c == r1Var.f166080c && this.d == r1Var.d && this.e == r1Var.e && this.f == r1Var.f && this.f166081g == r1Var.f166081g && this.f166082h == r1Var.f166082h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166082h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166078a) * 31, 31, this.f166079b), 31, this.f166080c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166081g);
    }
}
