package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227406c;

    public r4(boolean z, boolean z3, boolean z4) {
        this.f227404a = z;
        this.f227405b = z3;
        this.f227406c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj2;
        return this.f227404a == r4Var.f227404a && this.f227405b == r4Var.f227405b && this.f227406c == r4Var.f227406c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227406c) + j6.a.c(Boolean.hashCode(this.f227404a) * 31, 31, this.f227405b);
    }
}
