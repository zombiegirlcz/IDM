package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class gh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164423c;
    public final boolean d;
    public final boolean e;

    public gh0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f164421a = z;
        this.f164422b = z3;
        this.f164423c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gh0)) {
            return false;
        }
        gh0 gh0Var = (gh0) obj2;
        return this.f164421a == gh0Var.f164421a && this.f164422b == gh0Var.f164422b && this.f164423c == gh0Var.f164423c && this.d == gh0Var.d && this.e == gh0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164421a) * 31, 31, this.f164422b), 31, this.f164423c), 31, this.d);
    }
}
