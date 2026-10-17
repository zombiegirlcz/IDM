package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166858c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166860h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166861j;

    public vo(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f166856a = z;
        this.f166857b = z3;
        this.f166858c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166859g = z29;
        this.f166860h = z31;
        this.i = z41;
        this.f166861j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj2;
        return this.f166856a == voVar.f166856a && this.f166857b == voVar.f166857b && this.f166858c == voVar.f166858c && this.d == voVar.d && this.e == voVar.e && this.f == voVar.f && this.f166859g == voVar.f166859g && this.f166860h == voVar.f166860h && this.i == voVar.i && this.f166861j == voVar.f166861j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166861j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166856a) * 31, 31, this.f166857b), 31, this.f166858c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166859g), 31, this.f166860h), 31, this.i);
    }
}
