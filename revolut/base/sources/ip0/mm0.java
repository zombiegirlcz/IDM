package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class mm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165402c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165404h;

    public mm0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f165400a = z;
        this.f165401b = z3;
        this.f165402c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165403g = z29;
        this.f165404h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mm0)) {
            return false;
        }
        mm0 mm0Var = (mm0) obj2;
        return this.f165400a == mm0Var.f165400a && this.f165401b == mm0Var.f165401b && this.f165402c == mm0Var.f165402c && this.d == mm0Var.d && this.e == mm0Var.e && this.f == mm0Var.f && this.f165403g == mm0Var.f165403g && this.f165404h == mm0Var.f165404h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165404h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165400a) * 31, 31, this.f165401b), 31, this.f165402c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165403g);
    }
}
