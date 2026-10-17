package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166230c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166232h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166233j;

    public rs(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f166228a = z;
        this.f166229b = z3;
        this.f166230c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166231g = z29;
        this.f166232h = z31;
        this.i = z41;
        this.f166233j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rs)) {
            return false;
        }
        rs rsVar = (rs) obj2;
        return this.f166228a == rsVar.f166228a && this.f166229b == rsVar.f166229b && this.f166230c == rsVar.f166230c && this.d == rsVar.d && this.e == rsVar.e && this.f == rsVar.f && this.f166231g == rsVar.f166231g && this.f166232h == rsVar.f166232h && this.i == rsVar.i && this.f166233j == rsVar.f166233j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166233j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166228a) * 31, 31, this.f166229b), 31, this.f166230c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166231g), 31, this.f166232h), 31, this.i);
    }
}
