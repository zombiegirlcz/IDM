package mwg;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f209437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f209439c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f209440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f209441h;
    public final boolean i;

    public b(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f209437a = z;
        this.f209438b = z3;
        this.f209439c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f209440g = z29;
        this.f209441h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f209437a == bVar.f209437a && this.f209438b == bVar.f209438b && this.f209439c == bVar.f209439c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.f209440g == bVar.f209440g && this.f209441h == bVar.f209441h && this.i == bVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f209437a) * 31, 31, this.f209438b), 31, this.f209439c), 31, this.d), 31, this.e), 31, this.f), 31, this.f209440g), 31, this.f209441h);
    }
}
