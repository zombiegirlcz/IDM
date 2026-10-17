package kp0;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187988c;
    public final boolean d;

    public d1(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f187986a = z;
        this.f187987b = z3;
        this.f187988c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return this.f187986a == d1Var.f187986a && this.f187987b == d1Var.f187987b && this.f187988c == d1Var.f187988c && this.d == d1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f187986a) * 31, 31, this.f187987b), 31, this.f187988c);
    }
}
