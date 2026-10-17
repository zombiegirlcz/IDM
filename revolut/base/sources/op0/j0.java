package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227310c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f227311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227312h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f227313j;

    public j0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f227308a = z;
        this.f227309b = z3;
        this.f227310c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f227311g = z29;
        this.f227312h = z31;
        this.i = z41;
        this.f227313j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f227308a == j0Var.f227308a && this.f227309b == j0Var.f227309b && this.f227310c == j0Var.f227310c && this.d == j0Var.d && this.e == j0Var.e && this.f == j0Var.f && this.f227311g == j0Var.f227311g && this.f227312h == j0Var.f227312h && this.i == j0Var.i && this.f227313j == j0Var.f227313j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227313j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227308a) * 31, 31, this.f227309b), 31, this.f227310c), 31, this.d), 31, this.e), 31, this.f), 31, this.f227311g), 31, this.f227312h), 31, this.i);
    }
}
