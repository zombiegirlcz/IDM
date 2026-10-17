package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227356c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public n0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f227354a = z;
        this.f227355b = z3;
        this.f227356c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f227354a == n0Var.f227354a && this.f227355b == n0Var.f227355b && this.f227356c == n0Var.f227356c && this.d == n0Var.d && this.e == n0Var.e && this.f == n0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227354a) * 31, 31, this.f227355b), 31, this.f227356c), 31, this.d), 31, this.e);
    }
}
