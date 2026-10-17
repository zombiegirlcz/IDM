package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163811c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f163813h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f163814j;
    public final boolean k;

    public d(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f163809a = z;
        this.f163810b = z3;
        this.f163811c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163812g = z29;
        this.f163813h = z31;
        this.i = z41;
        this.f163814j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f163809a == dVar.f163809a && this.f163810b == dVar.f163810b && this.f163811c == dVar.f163811c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.f163812g == dVar.f163812g && this.f163813h == dVar.f163813h && this.i == dVar.i && this.f163814j == dVar.f163814j && this.k == dVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163809a) * 31, 31, this.f163810b), 31, this.f163811c), 31, this.d), 31, this.e), 31, this.f), 31, this.f163812g), 31, this.f163813h), 31, this.i), 31, this.f163814j);
    }
}
