package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class et {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164150c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164151g;

    public et(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f164148a = z;
        this.f164149b = z3;
        this.f164150c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164151g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof et)) {
            return false;
        }
        et etVar = (et) obj2;
        return this.f164148a == etVar.f164148a && this.f164149b == etVar.f164149b && this.f164150c == etVar.f164150c && this.d == etVar.d && this.e == etVar.e && this.f == etVar.f && this.f164151g == etVar.f164151g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164151g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164148a) * 31, 31, this.f164149b), 31, this.f164150c), 31, this.d), 31, this.e), 31, this.f);
    }
}
