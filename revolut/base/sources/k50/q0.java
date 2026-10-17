package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f181212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f181213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f181214c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f181215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f181216h;

    public q0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f181212a = z;
        this.f181213b = z3;
        this.f181214c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f181215g = z29;
        this.f181216h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f181212a == q0Var.f181212a && this.f181213b == q0Var.f181213b && this.f181214c == q0Var.f181214c && this.d == q0Var.d && this.e == q0Var.e && this.f == q0Var.f && this.f181215g == q0Var.f181215g && this.f181216h == q0Var.f181216h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181216h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f181212a) * 31, 31, this.f181213b), 31, this.f181214c), 31, this.d), 31, this.e), 31, this.f), 31, this.f181215g);
    }
}
