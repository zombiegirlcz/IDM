package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166600c;
    public final boolean d;
    public final boolean e;

    public u6(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f166598a = z;
        this.f166599b = z3;
        this.f166600c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj2;
        return this.f166598a == u6Var.f166598a && this.f166599b == u6Var.f166599b && this.f166600c == u6Var.f166600c && this.d == u6Var.d && this.e == u6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166598a) * 31, 31, this.f166599b), 31, this.f166600c), 31, this.d);
    }
}
