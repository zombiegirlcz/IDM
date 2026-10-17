package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165603c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165605h;

    public o1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f165601a = z;
        this.f165602b = z3;
        this.f165603c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165604g = z29;
        this.f165605h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return this.f165601a == o1Var.f165601a && this.f165602b == o1Var.f165602b && this.f165603c == o1Var.f165603c && this.d == o1Var.d && this.e == o1Var.e && this.f == o1Var.f && this.f165604g == o1Var.f165604g && this.f165605h == o1Var.f165605h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165605h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165601a) * 31, 31, this.f165602b), 31, this.f165603c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165604g);
    }
}
