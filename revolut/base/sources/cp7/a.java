package cp7;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f107884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107885c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f107886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f107887h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f107888j;

    public a(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f107883a = z;
        this.f107884b = z3;
        this.f107885c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f107886g = z29;
        this.f107887h = z31;
        this.i = z41;
        this.f107888j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f107883a == aVar.f107883a && this.f107884b == aVar.f107884b && this.f107885c == aVar.f107885c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.f107886g == aVar.f107886g && this.f107887h == aVar.f107887h && this.i == aVar.i && this.f107888j == aVar.f107888j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107888j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f107883a) * 31, 31, this.f107884b), 31, this.f107885c), 31, this.d), 31, this.e), 31, this.f), 31, this.f107886g), 31, this.f107887h), 31, this.i);
    }
}
