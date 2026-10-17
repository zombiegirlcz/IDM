package kp0;

/* JADX INFO: loaded from: classes19.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187966c;
    public final boolean d;
    public final boolean e;

    public a1(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f187964a = z;
        this.f187965b = z3;
        this.f187966c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f187964a == a1Var.f187964a && this.f187965b == a1Var.f187965b && this.f187966c == a1Var.f187966c && this.d == a1Var.d && this.e == a1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f187964a) * 31, 31, this.f187965b), 31, this.f187966c), 31, this.d);
    }
}
