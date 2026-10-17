package qoc;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f248124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f248125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f248126c;
    public final boolean d;

    public j0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f248124a = z;
        this.f248125b = z3;
        this.f248126c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f248124a == j0Var.f248124a && this.f248125b == j0Var.f248125b && this.f248126c == j0Var.f248126c && this.d == j0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f248124a) * 31, 31, this.f248125b), 31, this.f248126c);
    }
}
