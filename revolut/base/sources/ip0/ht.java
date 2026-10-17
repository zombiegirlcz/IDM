package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164596c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164598h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f164599j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f164600l;

    public ht(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74) {
        this.f164594a = z;
        this.f164595b = z3;
        this.f164596c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164597g = z29;
        this.f164598h = z31;
        this.i = z41;
        this.f164599j = z49;
        this.k = z54;
        this.f164600l = z74;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj2;
        return this.f164594a == htVar.f164594a && this.f164595b == htVar.f164595b && this.f164596c == htVar.f164596c && this.d == htVar.d && this.e == htVar.e && this.f == htVar.f && this.f164597g == htVar.f164597g && this.f164598h == htVar.f164598h && this.i == htVar.i && this.f164599j == htVar.f164599j && this.k == htVar.k && this.f164600l == htVar.f164600l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164600l) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164594a) * 31, 31, this.f164595b), 31, this.f164596c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164597g), 31, this.f164598h), 31, this.i), 31, this.f164599j), 31, this.k);
    }
}
