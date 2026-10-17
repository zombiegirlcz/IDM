package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227379c;
    public final boolean d;
    public final boolean e;

    public p2(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f227377a = z;
        this.f227378b = z3;
        this.f227379c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return this.f227377a == p2Var.f227377a && this.f227378b == p2Var.f227378b && this.f227379c == p2Var.f227379c && this.d == p2Var.d && this.e == p2Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227377a) * 31, 31, this.f227378b), 31, this.f227379c), 31, this.d);
    }
}
