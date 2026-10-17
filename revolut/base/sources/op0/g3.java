package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227273c;
    public final boolean d;
    public final boolean e;

    public g3(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f227271a = z;
        this.f227272b = z3;
        this.f227273c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return this.f227271a == g3Var.f227271a && this.f227272b == g3Var.f227272b && this.f227273c == g3Var.f227273c && this.d == g3Var.d && this.e == g3Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227271a) * 31, 31, this.f227272b), 31, this.f227273c), 31, this.d);
    }
}
