package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class vm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166851c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166853h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166854j;

    public vm0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f166849a = z;
        this.f166850b = z3;
        this.f166851c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166852g = z29;
        this.f166853h = z31;
        this.i = z41;
        this.f166854j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vm0)) {
            return false;
        }
        vm0 vm0Var = (vm0) obj2;
        return this.f166849a == vm0Var.f166849a && this.f166850b == vm0Var.f166850b && this.f166851c == vm0Var.f166851c && this.d == vm0Var.d && this.e == vm0Var.e && this.f == vm0Var.f && this.f166852g == vm0Var.f166852g && this.f166853h == vm0Var.f166853h && this.i == vm0Var.i && this.f166854j == vm0Var.f166854j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166854j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166849a) * 31, 31, this.f166850b), 31, this.f166851c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166852g), 31, this.f166853h), 31, this.i);
    }
}
