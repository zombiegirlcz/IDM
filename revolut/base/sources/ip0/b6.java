package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163537c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public b6(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f163535a = z;
        this.f163536b = z3;
        this.f163537c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj2;
        return this.f163535a == b6Var.f163535a && this.f163536b == b6Var.f163536b && this.f163537c == b6Var.f163537c && this.d == b6Var.d && this.e == b6Var.e && this.f == b6Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163535a) * 31, 31, this.f163536b), 31, this.f163537c), 31, this.d), 31, this.e);
    }
}
