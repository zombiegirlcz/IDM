package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227280c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f227281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f227282h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f227283j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f227284l;

    public h(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74) {
        this.f227278a = z;
        this.f227279b = z3;
        this.f227280c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f227281g = z29;
        this.f227282h = z31;
        this.i = z41;
        this.f227283j = z49;
        this.k = z54;
        this.f227284l = z74;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f227278a == hVar.f227278a && this.f227279b == hVar.f227279b && this.f227280c == hVar.f227280c && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.f227281g == hVar.f227281g && this.f227282h == hVar.f227282h && this.i == hVar.i && this.f227283j == hVar.f227283j && this.k == hVar.k && this.f227284l == hVar.f227284l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227284l) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227278a) * 31, 31, this.f227279b), 31, this.f227280c), 31, this.d), 31, this.e), 31, this.f), 31, this.f227281g), 31, this.f227282h), 31, this.i), 31, this.f227283j), 31, this.k);
    }
}
