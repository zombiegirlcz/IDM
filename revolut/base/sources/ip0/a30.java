package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class a30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163380c;
    public final boolean d;
    public final boolean e;

    public a30(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f163378a = z;
        this.f163379b = z3;
        this.f163380c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a30)) {
            return false;
        }
        a30 a30Var = (a30) obj2;
        return this.f163378a == a30Var.f163378a && this.f163379b == a30Var.f163379b && this.f163380c == a30Var.f163380c && this.d == a30Var.d && this.e == a30Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163378a) * 31, 31, this.f163379b), 31, this.f163380c), 31, this.d);
    }
}
