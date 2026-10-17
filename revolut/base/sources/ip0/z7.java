package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167409c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167411h;

    public z7(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f167407a = z;
        this.f167408b = z3;
        this.f167409c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167410g = z29;
        this.f167411h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj2;
        return this.f167407a == z7Var.f167407a && this.f167408b == z7Var.f167408b && this.f167409c == z7Var.f167409c && this.d == z7Var.d && this.e == z7Var.e && this.f == z7Var.f && this.f167410g == z7Var.f167410g && this.f167411h == z7Var.f167411h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167411h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167407a) * 31, 31, this.f167408b), 31, this.f167409c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167410g);
    }
}
