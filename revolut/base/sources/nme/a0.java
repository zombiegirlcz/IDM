package nme;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f217278c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f217279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f217280h;

    public a0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f217276a = z;
        this.f217277b = z3;
        this.f217278c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f217279g = z29;
        this.f217280h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f217276a == a0Var.f217276a && this.f217277b == a0Var.f217277b && this.f217278c == a0Var.f217278c && this.d == a0Var.d && this.e == a0Var.e && this.f == a0Var.f && this.f217279g == a0Var.f217279g && this.f217280h == a0Var.f217280h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217280h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f217276a) * 31, 31, this.f217277b), 31, this.f217278c), 31, this.d), 31, this.e), 31, this.f), 31, this.f217279g);
    }
}
