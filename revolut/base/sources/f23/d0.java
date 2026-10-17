package f23;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f131358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f131359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131360c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public d0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f131358a = z;
        this.f131359b = z3;
        this.f131360c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f131358a == d0Var.f131358a && this.f131359b == d0Var.f131359b && this.f131360c == d0Var.f131360c && this.d == d0Var.d && this.e == d0Var.e && this.f == d0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f131358a) * 31, 31, this.f131359b), 31, this.f131360c), 31, this.d), 31, this.e);
    }
}
