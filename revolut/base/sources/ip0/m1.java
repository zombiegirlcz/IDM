package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class m1 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165299c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public m1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f165297a = z;
        this.f165298b = z3;
        this.f165299c = z4;
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
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return this.f165297a == m1Var.f165297a && this.f165298b == m1Var.f165298b && this.f165299c == m1Var.f165299c && this.d == m1Var.d && this.e == m1Var.e && this.f == m1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165297a) * 31, 31, this.f165298b), 31, this.f165299c), 31, this.d), 31, this.e);
    }
}
