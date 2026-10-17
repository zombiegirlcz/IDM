package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166380c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166382h;
    public final boolean i;

    public sp(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f166378a = z;
        this.f166379b = z3;
        this.f166380c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166381g = z29;
        this.f166382h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sp)) {
            return false;
        }
        sp spVar = (sp) obj2;
        return this.f166378a == spVar.f166378a && this.f166379b == spVar.f166379b && this.f166380c == spVar.f166380c && this.d == spVar.d && this.e == spVar.e && this.f == spVar.f && this.f166381g == spVar.f166381g && this.f166382h == spVar.f166382h && this.i == spVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166378a) * 31, 31, this.f166379b), 31, this.f166380c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166381g), 31, this.f166382h);
    }
}
