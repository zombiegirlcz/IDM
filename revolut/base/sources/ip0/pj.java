package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class pj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165832c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165834h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f165835j;
    public final boolean k;

    public pj(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f165830a = z;
        this.f165831b = z3;
        this.f165832c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165833g = z29;
        this.f165834h = z31;
        this.i = z41;
        this.f165835j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pj)) {
            return false;
        }
        pj pjVar = (pj) obj2;
        return this.f165830a == pjVar.f165830a && this.f165831b == pjVar.f165831b && this.f165832c == pjVar.f165832c && this.d == pjVar.d && this.e == pjVar.e && this.f == pjVar.f && this.f165833g == pjVar.f165833g && this.f165834h == pjVar.f165834h && this.i == pjVar.i && this.f165835j == pjVar.f165835j && this.k == pjVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165830a) * 31, 31, this.f165831b), 31, this.f165832c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165833g), 31, this.f165834h), 31, this.i), 31, this.f165835j);
    }
}
