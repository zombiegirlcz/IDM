package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166282c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166284h;

    public s3(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f166280a = z;
        this.f166281b = z3;
        this.f166282c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166283g = z29;
        this.f166284h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return this.f166280a == s3Var.f166280a && this.f166281b == s3Var.f166281b && this.f166282c == s3Var.f166282c && this.d == s3Var.d && this.e == s3Var.e && this.f == s3Var.f && this.f166283g == s3Var.f166283g && this.f166284h == s3Var.f166284h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166284h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166280a) * 31, 31, this.f166281b), 31, this.f166282c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166283g);
    }
}
