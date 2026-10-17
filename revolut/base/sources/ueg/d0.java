package ueg;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f279376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f279377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f279378c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f279379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f279380h;

    public d0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f279376a = z;
        this.f279377b = z3;
        this.f279378c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f279379g = z29;
        this.f279380h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f279376a == d0Var.f279376a && this.f279377b == d0Var.f279377b && this.f279378c == d0Var.f279378c && this.d == d0Var.d && this.e == d0Var.e && this.f == d0Var.f && this.f279379g == d0Var.f279379g && this.f279380h == d0Var.f279380h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f279380h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f279376a) * 31, 31, this.f279377b), 31, this.f279378c), 31, this.d), 31, this.e), 31, this.f), 31, this.f279379g);
    }
}
