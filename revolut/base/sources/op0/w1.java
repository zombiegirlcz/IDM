package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227465c;

    public w1(boolean z, boolean z3, boolean z4) {
        this.f227463a = z;
        this.f227464b = z3;
        this.f227465c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return this.f227463a == w1Var.f227463a && this.f227464b == w1Var.f227464b && this.f227465c == w1Var.f227465c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227465c) + j6.a.c(Boolean.hashCode(this.f227463a) * 31, 31, this.f227464b);
    }
}
