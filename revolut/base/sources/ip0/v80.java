package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class v80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166789c;
    public final boolean d;
    public final boolean e;

    public v80(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f166787a = z;
        this.f166788b = z3;
        this.f166789c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v80)) {
            return false;
        }
        v80 v80Var = (v80) obj2;
        return this.f166787a == v80Var.f166787a && this.f166788b == v80Var.f166788b && this.f166789c == v80Var.f166789c && this.d == v80Var.d && this.e == v80Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166787a) * 31, 31, this.f166788b), 31, this.f166789c), 31, this.d);
    }
}
