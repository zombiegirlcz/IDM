package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163358c;
    public final boolean d;
    public final boolean e;

    public a0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f163356a = z;
        this.f163357b = z3;
        this.f163358c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f163356a == a0Var.f163356a && this.f163357b == a0Var.f163357b && this.f163358c == a0Var.f163358c && this.d == a0Var.d && this.e == a0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163356a) * 31, 31, this.f163357b), 31, this.f163358c), 31, this.d);
    }
}
