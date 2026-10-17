package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167085c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167087h;
    public final boolean i;

    public x2(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f167083a = z;
        this.f167084b = z3;
        this.f167085c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167086g = z29;
        this.f167087h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return this.f167083a == x2Var.f167083a && this.f167084b == x2Var.f167084b && this.f167085c == x2Var.f167085c && this.d == x2Var.d && this.e == x2Var.e && this.f == x2Var.f && this.f167086g == x2Var.f167086g && this.f167087h == x2Var.f167087h && this.i == x2Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167083a) * 31, 31, this.f167084b), 31, this.f167085c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167086g), 31, this.f167087h);
    }
}
