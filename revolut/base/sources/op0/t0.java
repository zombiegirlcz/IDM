package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227421c;
    public final boolean d;

    public t0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f227419a = z;
        this.f227420b = z3;
        this.f227421c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return this.f227419a == t0Var.f227419a && this.f227420b == t0Var.f227420b && this.f227421c == t0Var.f227421c && this.d == t0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f227419a) * 31, 31, this.f227420b), 31, this.f227421c);
    }
}
