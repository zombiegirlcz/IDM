package j53;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f171479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f171480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f171481c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f171482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f171483h;
    public final boolean i;

    public n(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f171479a = z;
        this.f171480b = z3;
        this.f171481c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f171482g = z29;
        this.f171483h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f171479a == nVar.f171479a && this.f171480b == nVar.f171480b && this.f171481c == nVar.f171481c && this.d == nVar.d && this.e == nVar.e && this.f == nVar.f && this.f171482g == nVar.f171482g && this.f171483h == nVar.f171483h && this.i == nVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f171479a) * 31, 31, this.f171480b), 31, this.f171481c), 31, this.d), 31, this.e), 31, this.f), 31, this.f171482g), 31, this.f171483h);
    }
}
