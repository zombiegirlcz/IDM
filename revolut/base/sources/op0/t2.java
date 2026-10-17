package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227425c;
    public final boolean d;
    public final boolean e;

    public t2(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f227423a = z;
        this.f227424b = z3;
        this.f227425c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return this.f227423a == t2Var.f227423a && this.f227424b == t2Var.f227424b && this.f227425c == t2Var.f227425c && this.d == t2Var.d && this.e == t2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227423a) * 31, 31, this.f227424b), 31, this.f227425c), 31, this.d);
    }
}
