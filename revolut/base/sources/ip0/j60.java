package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class j60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164795c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164796g;

    public j60(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f164793a = z;
        this.f164794b = z3;
        this.f164795c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164796g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j60)) {
            return false;
        }
        j60 j60Var = (j60) obj2;
        return this.f164793a == j60Var.f164793a && this.f164794b == j60Var.f164794b && this.f164795c == j60Var.f164795c && this.d == j60Var.d && this.e == j60Var.e && this.f == j60Var.f && this.f164796g == j60Var.f164796g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164796g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164793a) * 31, 31, this.f164794b), 31, this.f164795c), 31, this.d), 31, this.e), 31, this.f);
    }
}
