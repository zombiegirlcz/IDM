package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166340c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166342h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166343j;

    public se(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f166338a = z;
        this.f166339b = z3;
        this.f166340c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166341g = z29;
        this.f166342h = z31;
        this.i = z41;
        this.f166343j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof se)) {
            return false;
        }
        se seVar = (se) obj2;
        return this.f166338a == seVar.f166338a && this.f166339b == seVar.f166339b && this.f166340c == seVar.f166340c && this.d == seVar.d && this.e == seVar.e && this.f == seVar.f && this.f166341g == seVar.f166341g && this.f166342h == seVar.f166342h && this.i == seVar.i && this.f166343j == seVar.f166343j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166343j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166338a) * 31, 31, this.f166339b), 31, this.f166340c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166341g), 31, this.f166342h), 31, this.i);
    }
}
