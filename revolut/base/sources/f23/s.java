package f23;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f131408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f131409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131410c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f131411g;

    public s(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f131408a = z;
        this.f131409b = z3;
        this.f131410c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f131411g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f131408a == sVar.f131408a && this.f131409b == sVar.f131409b && this.f131410c == sVar.f131410c && this.d == sVar.d && this.e == sVar.e && this.f == sVar.f && this.f131411g == sVar.f131411g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131411g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f131408a) * 31, 31, this.f131409b), 31, this.f131410c), 31, this.d), 31, this.e), 31, this.f);
    }
}
