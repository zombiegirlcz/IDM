package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227181c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public b0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f227179a = z;
        this.f227180b = z3;
        this.f227181c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f227179a == b0Var.f227179a && this.f227180b == b0Var.f227180b && this.f227181c == b0Var.f227181c && this.d == b0Var.d && this.e == b0Var.e && this.f == b0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227179a) * 31, 31, this.f227180b), 31, this.f227181c), 31, this.d), 31, this.e);
    }
}
