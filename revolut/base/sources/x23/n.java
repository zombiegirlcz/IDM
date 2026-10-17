package x23;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f302490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f302491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f302492c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public n(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f302490a = z;
        this.f302491b = z3;
        this.f302492c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f302490a == nVar.f302490a && this.f302491b == nVar.f302491b && this.f302492c == nVar.f302492c && this.d == nVar.d && this.e == nVar.e && this.f == nVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f302490a) * 31, 31, this.f302491b), 31, this.f302492c), 31, this.d), 31, this.e);
    }
}
