package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227335c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f227336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227337h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f227338j;
    public final boolean k;

    public l(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f227333a = z;
        this.f227334b = z3;
        this.f227335c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f227336g = z29;
        this.f227337h = z31;
        this.i = z41;
        this.f227338j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f227333a == lVar.f227333a && this.f227334b == lVar.f227334b && this.f227335c == lVar.f227335c && this.d == lVar.d && this.e == lVar.e && this.f == lVar.f && this.f227336g == lVar.f227336g && this.f227337h == lVar.f227337h && this.i == lVar.i && this.f227338j == lVar.f227338j && this.k == lVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227333a) * 31, 31, this.f227334b), 31, this.f227335c), 31, this.d), 31, this.e), 31, this.f), 31, this.f227336g), 31, this.f227337h), 31, this.i), 31, this.f227338j);
    }
}
