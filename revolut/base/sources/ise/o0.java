package ise;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168224c;
    public final boolean d;
    public final boolean e;

    public o0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f168222a = z;
        this.f168223b = z3;
        this.f168224c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return this.f168222a == o0Var.f168222a && this.f168223b == o0Var.f168223b && this.f168224c == o0Var.f168224c && this.d == o0Var.d && this.e == o0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f168222a) * 31, 31, this.f168223b), 31, this.f168224c), 31, this.d);
    }
}
