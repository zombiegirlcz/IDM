package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227382c;
    public final boolean d;

    public p3(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f227380a = z;
        this.f227381b = z3;
        this.f227382c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return this.f227380a == p3Var.f227380a && this.f227381b == p3Var.f227381b && this.f227382c == p3Var.f227382c && this.d == p3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f227380a) * 31, 31, this.f227381b), 31, this.f227382c);
    }
}
