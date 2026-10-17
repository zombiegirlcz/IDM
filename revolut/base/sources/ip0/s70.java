package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class s70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166318c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166320h;

    public s70(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f166316a = z;
        this.f166317b = z3;
        this.f166318c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166319g = z29;
        this.f166320h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s70)) {
            return false;
        }
        s70 s70Var = (s70) obj2;
        return this.f166316a == s70Var.f166316a && this.f166317b == s70Var.f166317b && this.f166318c == s70Var.f166318c && this.d == s70Var.d && this.e == s70Var.e && this.f == s70Var.f && this.f166319g == s70Var.f166319g && this.f166320h == s70Var.f166320h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166320h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166316a) * 31, 31, this.f166317b), 31, this.f166318c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166319g);
    }
}
