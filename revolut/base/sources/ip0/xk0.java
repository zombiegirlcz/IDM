package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class xk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167191c;
    public final boolean d;
    public final boolean e;

    public xk0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f167189a = z;
        this.f167190b = z3;
        this.f167191c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xk0)) {
            return false;
        }
        xk0 xk0Var = (xk0) obj2;
        return this.f167189a == xk0Var.f167189a && this.f167190b == xk0Var.f167190b && this.f167191c == xk0Var.f167191c && this.d == xk0Var.d && this.e == xk0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167189a) * 31, 31, this.f167190b), 31, this.f167191c), 31, this.d);
    }
}
