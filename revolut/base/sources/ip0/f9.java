package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class f9 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164218c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164219g;

    public f9(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f164216a = z;
        this.f164217b = z3;
        this.f164218c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164219g = z29;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164219g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj2;
        return this.f164216a == f9Var.f164216a && this.f164217b == f9Var.f164217b && this.f164218c == f9Var.f164218c && this.d == f9Var.d && this.e == f9Var.e && this.f == f9Var.f && this.f164219g == f9Var.f164219g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164219g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164216a) * 31, 31, this.f164217b), 31, this.f164218c), 31, this.d), 31, this.e), 31, this.f);
    }
}
