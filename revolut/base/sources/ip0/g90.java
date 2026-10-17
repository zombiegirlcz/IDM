package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164374c;
    public final boolean d;
    public final boolean e;

    public g90(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f164372a = z;
        this.f164373b = z3;
        this.f164374c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g90)) {
            return false;
        }
        g90 g90Var = (g90) obj2;
        return this.f164372a == g90Var.f164372a && this.f164373b == g90Var.f164373b && this.f164374c == g90Var.f164374c && this.d == g90Var.d && this.e == g90Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164372a) * 31, 31, this.f164373b), 31, this.f164374c), 31, this.d);
    }
}
