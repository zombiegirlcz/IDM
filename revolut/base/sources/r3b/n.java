package r3b;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f251254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f251255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f251256c;
    public final boolean d;

    public n(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f251254a = z;
        this.f251255b = z3;
        this.f251256c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f251254a == nVar.f251254a && this.f251255b == nVar.f251255b && this.f251256c == nVar.f251256c && this.d == nVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f251254a) * 31, 31, this.f251255b), 31, this.f251256c);
    }
}
