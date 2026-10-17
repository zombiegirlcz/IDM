package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ea0 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164046c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164048h;

    public ea0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f164044a = z;
        this.f164045b = z3;
        this.f164046c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164047g = z29;
        this.f164048h = z31;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164048h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ea0)) {
            return false;
        }
        ea0 ea0Var = (ea0) obj2;
        return this.f164044a == ea0Var.f164044a && this.f164045b == ea0Var.f164045b && this.f164046c == ea0Var.f164046c && this.d == ea0Var.d && this.e == ea0Var.e && this.f == ea0Var.f && this.f164047g == ea0Var.f164047g && this.f164048h == ea0Var.f164048h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164048h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164044a) * 31, 31, this.f164045b), 31, this.f164046c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164047g);
    }
}
