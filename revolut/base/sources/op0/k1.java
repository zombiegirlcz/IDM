package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227329c;
    public final boolean d;

    public k1(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f227327a = z;
        this.f227328b = z3;
        this.f227329c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return this.f227327a == k1Var.f227327a && this.f227328b == k1Var.f227328b && this.f227329c == k1Var.f227329c && this.d == k1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f227327a) * 31, 31, this.f227328b), 31, this.f227329c);
    }
}
