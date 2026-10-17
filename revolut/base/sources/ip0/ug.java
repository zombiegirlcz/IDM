package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166656c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f166658h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f166659j;
    public final boolean k;

    public ug(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f166654a = z;
        this.f166655b = z3;
        this.f166656c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166657g = z29;
        this.f166658h = z31;
        this.i = z41;
        this.f166659j = z49;
        this.k = z54;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj2;
        return this.f166654a == ugVar.f166654a && this.f166655b == ugVar.f166655b && this.f166656c == ugVar.f166656c && this.d == ugVar.d && this.e == ugVar.e && this.f == ugVar.f && this.f166657g == ugVar.f166657g && this.f166658h == ugVar.f166658h && this.i == ugVar.i && this.f166659j == ugVar.f166659j && this.k == ugVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166654a) * 31, 31, this.f166655b), 31, this.f166656c), 31, this.d), 31, this.e), 31, this.f), 31, this.f166657g), 31, this.f166658h), 31, this.i), 31, this.f166659j);
    }
}
