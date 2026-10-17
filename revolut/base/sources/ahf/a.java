package ahf;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5066c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5068h;

    public a(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f5064a = z;
        this.f5065b = z3;
        this.f5066c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f5067g = z29;
        this.f5068h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f5064a == aVar.f5064a && this.f5065b == aVar.f5065b && this.f5066c == aVar.f5066c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.f5067g == aVar.f5067g && this.f5068h == aVar.f5068h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5068h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f5064a) * 31, 31, this.f5065b), 31, this.f5066c), 31, this.d), 31, this.e), 31, this.f), 31, this.f5067g);
    }
}
