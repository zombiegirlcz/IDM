package mx0;

/* JADX INFO: loaded from: classes20.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f209966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f209968c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f209969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f209970h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f209971j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f209972l;

    public r(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74) {
        this.f209966a = z;
        this.f209967b = z3;
        this.f209968c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f209969g = z29;
        this.f209970h = z31;
        this.i = z41;
        this.f209971j = z49;
        this.k = z54;
        this.f209972l = z74;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f209966a == rVar.f209966a && this.f209967b == rVar.f209967b && this.f209968c == rVar.f209968c && this.d == rVar.d && this.e == rVar.e && this.f == rVar.f && this.f209969g == rVar.f209969g && this.f209970h == rVar.f209970h && this.i == rVar.i && this.f209971j == rVar.f209971j && this.k == rVar.k && this.f209972l == rVar.f209972l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209972l) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f209966a) * 31, 31, this.f209967b), 31, this.f209968c), 31, this.d), 31, this.e), 31, this.f), 31, this.f209969g), 31, this.f209970h), 31, this.i), 31, this.f209971j), 31, this.k);
    }
}
