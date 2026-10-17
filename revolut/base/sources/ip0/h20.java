package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class h20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164497c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164498g;

    public h20(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f164495a = z;
        this.f164496b = z3;
        this.f164497c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164498g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h20)) {
            return false;
        }
        h20 h20Var = (h20) obj2;
        return this.f164495a == h20Var.f164495a && this.f164496b == h20Var.f164496b && this.f164497c == h20Var.f164497c && this.d == h20Var.d && this.e == h20Var.e && this.f == h20Var.f && this.f164498g == h20Var.f164498g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164498g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164495a) * 31, 31, this.f164496b), 31, this.f164497c), 31, this.d), 31, this.e), 31, this.f);
    }
}
