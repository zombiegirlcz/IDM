package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class yu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167354c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167356h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f167357j;
    public final boolean k;

    public yu(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f167352a = z;
        this.f167353b = z3;
        this.f167354c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167355g = z29;
        this.f167356h = z31;
        this.i = z41;
        this.f167357j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yu)) {
            return false;
        }
        yu yuVar = (yu) obj2;
        return this.f167352a == yuVar.f167352a && this.f167353b == yuVar.f167353b && this.f167354c == yuVar.f167354c && this.d == yuVar.d && this.e == yuVar.e && this.f == yuVar.f && this.f167355g == yuVar.f167355g && this.f167356h == yuVar.f167356h && this.i == yuVar.i && this.f167357j == yuVar.f167357j && this.k == yuVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167352a) * 31, 31, this.f167353b), 31, this.f167354c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167355g), 31, this.f167356h), 31, this.i), 31, this.f167357j);
    }
}
