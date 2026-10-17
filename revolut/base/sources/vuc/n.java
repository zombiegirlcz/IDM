package vuc;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f292329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f292330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f292331c;
    public final boolean d;

    public n(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f292329a = z;
        this.f292330b = z3;
        this.f292331c = z4;
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
        return this.f292329a == nVar.f292329a && this.f292330b == nVar.f292330b && this.f292331c == nVar.f292331c && this.d == nVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f292329a) * 31, 31, this.f292330b), 31, this.f292331c);
    }
}
