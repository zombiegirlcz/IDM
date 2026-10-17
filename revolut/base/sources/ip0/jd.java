package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164817c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164819h;
    public final boolean i;

    public jd(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f164815a = z;
        this.f164816b = z3;
        this.f164817c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164818g = z29;
        this.f164819h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj2;
        return this.f164815a == jdVar.f164815a && this.f164816b == jdVar.f164816b && this.f164817c == jdVar.f164817c && this.d == jdVar.d && this.e == jdVar.e && this.f == jdVar.f && this.f164818g == jdVar.f164818g && this.f164819h == jdVar.f164819h && this.i == jdVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164815a) * 31, 31, this.f164816b), 31, this.f164817c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164818g), 31, this.f164819h);
    }
}
