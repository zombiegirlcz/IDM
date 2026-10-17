package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class p7 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165778c;
    public final boolean d;
    public final boolean e;

    public p7(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f165776a = z;
        this.f165777b = z3;
        this.f165778c = z4;
        this.d = z6;
        this.e = z11;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj2;
        return this.f165776a == p7Var.f165776a && this.f165777b == p7Var.f165777b && this.f165778c == p7Var.f165778c && this.d == p7Var.d && this.e == p7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165776a) * 31, 31, this.f165777b), 31, this.f165778c), 31, this.d);
    }
}
