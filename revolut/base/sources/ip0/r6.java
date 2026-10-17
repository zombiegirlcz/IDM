package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166126c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public r6(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f166124a = z;
        this.f166125b = z3;
        this.f166126c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj2;
        return this.f166124a == r6Var.f166124a && this.f166125b == r6Var.f166125b && this.f166126c == r6Var.f166126c && this.d == r6Var.d && this.e == r6Var.e && this.f == r6Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166124a) * 31, 31, this.f166125b), 31, this.f166126c), 31, this.d), 31, this.e);
    }
}
