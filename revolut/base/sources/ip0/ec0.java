package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ec0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164060c;
    public final boolean d;
    public final boolean e;

    public ec0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f164058a = z;
        this.f164059b = z3;
        this.f164060c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj2;
        return this.f164058a == ec0Var.f164058a && this.f164059b == ec0Var.f164059b && this.f164060c == ec0Var.f164060c && this.d == ec0Var.d && this.e == ec0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164058a) * 31, 31, this.f164059b), 31, this.f164060c), 31, this.d);
    }
}
