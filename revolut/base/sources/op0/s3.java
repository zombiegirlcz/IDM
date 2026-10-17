package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227414c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f227415g;

    public s3(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f227412a = z;
        this.f227413b = z3;
        this.f227414c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f227415g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return this.f227412a == s3Var.f227412a && this.f227413b == s3Var.f227413b && this.f227414c == s3Var.f227414c && this.d == s3Var.d && this.e == s3Var.e && this.f == s3Var.f && this.f227415g == s3Var.f227415g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227415g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227412a) * 31, 31, this.f227413b), 31, this.f227414c), 31, this.d), 31, this.e), 31, this.f);
    }
}
