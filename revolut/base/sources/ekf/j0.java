package ekf;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f127094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127096c;
    public final boolean d;

    public j0(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f127094a = z;
        this.f127095b = z3;
        this.f127096c = z4;
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
        return this.f127094a == j0Var.f127094a && this.f127095b == j0Var.f127095b && this.f127096c == j0Var.f127096c && this.d == j0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f127094a) * 31, 31, this.f127095b), 31, this.f127096c);
    }
}
