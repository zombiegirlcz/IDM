package wk2;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298204c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f298205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f298206h;
    public final boolean i;

    public l(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f298202a = z;
        this.f298203b = z3;
        this.f298204c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f298205g = z29;
        this.f298206h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f298202a == lVar.f298202a && this.f298203b == lVar.f298203b && this.f298204c == lVar.f298204c && this.d == lVar.d && this.e == lVar.e && this.f == lVar.f && this.f298205g == lVar.f298205g && this.f298206h == lVar.f298206h && this.i == lVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f298202a) * 31, 31, this.f298203b), 31, this.f298204c), 31, this.d), 31, this.e), 31, this.f), 31, this.f298205g), 31, this.f298206h);
    }
}
