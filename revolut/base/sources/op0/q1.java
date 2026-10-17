package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227390c;
    public final boolean d;
    public final boolean e;

    public q1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f227388a = z;
        this.f227389b = z3;
        this.f227390c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return this.f227388a == q1Var.f227388a && this.f227389b == q1Var.f227389b && this.f227390c == q1Var.f227390c && this.d == q1Var.d && this.e == q1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227388a) * 31, 31, this.f227389b), 31, this.f227390c), 31, this.d);
    }
}
