package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227268c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f227269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227270h;

    public g2(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f227266a = z;
        this.f227267b = z3;
        this.f227268c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f227269g = z29;
        this.f227270h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj2;
        return this.f227266a == g2Var.f227266a && this.f227267b == g2Var.f227267b && this.f227268c == g2Var.f227268c && this.d == g2Var.d && this.e == g2Var.e && this.f == g2Var.f && this.f227269g == g2Var.f227269g && this.f227270h == g2Var.f227270h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227270h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227266a) * 31, 31, this.f227267b), 31, this.f227268c), 31, this.d), 31, this.e), 31, this.f), 31, this.f227269g);
    }
}
