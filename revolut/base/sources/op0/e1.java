package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227234b;

    public e1(boolean z, boolean z3) {
        this.f227233a = z;
        this.f227234b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return this.f227233a == e1Var.f227233a && this.f227234b == e1Var.f227234b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227234b) + (Boolean.hashCode(this.f227233a) * 31);
    }
}
