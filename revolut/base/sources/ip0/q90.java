package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class q90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165944c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165946h;

    public q90(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f165942a = z;
        this.f165943b = z3;
        this.f165944c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165945g = z29;
        this.f165946h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q90)) {
            return false;
        }
        q90 q90Var = (q90) obj2;
        return this.f165942a == q90Var.f165942a && this.f165943b == q90Var.f165943b && this.f165944c == q90Var.f165944c && this.d == q90Var.d && this.e == q90Var.e && this.f == q90Var.f && this.f165945g == q90Var.f165945g && this.f165946h == q90Var.f165946h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165946h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165942a) * 31, 31, this.f165943b), 31, this.f165944c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165945g);
    }
}
