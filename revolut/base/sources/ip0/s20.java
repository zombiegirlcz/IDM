package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class s20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166277c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166279h;

    public s20(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f166275a = z;
        this.f166276b = z3;
        this.f166277c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166278g = z29;
        this.f166279h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s20)) {
            return false;
        }
        s20 s20Var = (s20) obj2;
        return this.f166275a == s20Var.f166275a && this.f166276b == s20Var.f166276b && this.f166277c == s20Var.f166277c && this.d == s20Var.d && this.e == s20Var.e && this.f == s20Var.f && this.f166278g == s20Var.f166278g && this.f166279h == s20Var.f166279h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166279h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166275a) * 31, 31, this.f166276b), 31, this.f166277c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166278g);
    }
}
