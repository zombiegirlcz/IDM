package pdg;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f235221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f235222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f235223c;

    public y(boolean z, boolean z3, boolean z4) {
        this.f235221a = z;
        this.f235222b = z3;
        this.f235223c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f235221a == yVar.f235221a && this.f235222b == yVar.f235222b && this.f235223c == yVar.f235223c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f235223c) + j6.a.c(Boolean.hashCode(this.f235221a) * 31, 31, this.f235222b);
    }
}
