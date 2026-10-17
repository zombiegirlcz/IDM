package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227214c;
    public final boolean d;
    public final boolean e;

    public c5(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f227212a = z;
        this.f227213b = z3;
        this.f227214c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj2;
        return this.f227212a == c5Var.f227212a && this.f227213b == c5Var.f227213b && this.f227214c == c5Var.f227214c && this.d == c5Var.d && this.e == c5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227212a) * 31, 31, this.f227213b), 31, this.f227214c), 31, this.d);
    }
}
