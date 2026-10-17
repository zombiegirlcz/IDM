package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164799c;
    public final boolean d;

    public j7(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f164797a = z;
        this.f164798b = z3;
        this.f164799c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj2;
        return this.f164797a == j7Var.f164797a && this.f164798b == j7Var.f164798b && this.f164799c == j7Var.f164799c && this.d == j7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f164797a) * 31, 31, this.f164798b), 31, this.f164799c);
    }
}
