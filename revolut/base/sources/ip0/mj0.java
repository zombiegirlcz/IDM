package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class mj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165393c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165394g;

    public mj0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f165391a = z;
        this.f165392b = z3;
        this.f165393c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165394g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mj0)) {
            return false;
        }
        mj0 mj0Var = (mj0) obj2;
        return this.f165391a == mj0Var.f165391a && this.f165392b == mj0Var.f165392b && this.f165393c == mj0Var.f165393c && this.d == mj0Var.d && this.e == mj0Var.e && this.f == mj0Var.f && this.f165394g == mj0Var.f165394g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165394g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165391a) * 31, 31, this.f165392b), 31, this.f165393c), 31, this.d), 31, this.e), 31, this.f);
    }
}
