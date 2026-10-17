package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class g60 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164353c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public g60(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f164351a = z;
        this.f164352b = z3;
        this.f164353c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g60)) {
            return false;
        }
        g60 g60Var = (g60) obj2;
        return this.f164351a == g60Var.f164351a && this.f164352b == g60Var.f164352b && this.f164353c == g60Var.f164353c && this.d == g60Var.d && this.e == g60Var.e && this.f == g60Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164351a) * 31, 31, this.f164352b), 31, this.f164353c), 31, this.d), 31, this.e);
    }
}
