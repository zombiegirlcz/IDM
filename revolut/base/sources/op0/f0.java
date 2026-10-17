package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227243c;
    public final boolean d;
    public final boolean e;

    public f0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f227241a = z;
        this.f227242b = z3;
        this.f227243c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f227241a == f0Var.f227241a && this.f227242b == f0Var.f227242b && this.f227243c == f0Var.f227243c && this.d == f0Var.d && this.e == f0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227241a) * 31, 31, this.f227242b), 31, this.f227243c), 31, this.d);
    }
}
