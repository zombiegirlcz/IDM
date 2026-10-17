package uw1;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f283514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f283515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f283516c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f283517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f283518h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f283519j;

    public d(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f283514a = z;
        this.f283515b = z3;
        this.f283516c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f283517g = z29;
        this.f283518h = z31;
        this.i = z41;
        this.f283519j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f283514a == dVar.f283514a && this.f283515b == dVar.f283515b && this.f283516c == dVar.f283516c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.f283517g == dVar.f283517g && this.f283518h == dVar.f283518h && this.i == dVar.i && this.f283519j == dVar.f283519j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283519j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f283514a) * 31, 31, this.f283515b), 31, this.f283516c), 31, this.d), 31, this.e), 31, this.f), 31, this.f283517g), 31, this.f283518h), 31, this.i);
    }
}
