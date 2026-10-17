package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166792c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f166793g;

    public v9(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f166790a = z;
        this.f166791b = z3;
        this.f166792c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f166793g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj2;
        return this.f166790a == v9Var.f166790a && this.f166791b == v9Var.f166791b && this.f166792c == v9Var.f166792c && this.d == v9Var.d && this.e == v9Var.e && this.f == v9Var.f && this.f166793g == v9Var.f166793g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166793g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166790a) * 31, 31, this.f166791b), 31, this.f166792c), 31, this.d), 31, this.e), 31, this.f);
    }
}
