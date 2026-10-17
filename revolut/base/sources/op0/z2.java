package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227511c;

    public z2(boolean z, boolean z3, boolean z4) {
        this.f227509a = z;
        this.f227510b = z3;
        this.f227511c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return this.f227509a == z2Var.f227509a && this.f227510b == z2Var.f227510b && this.f227511c == z2Var.f227511c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227511c) + j6.a.c(Boolean.hashCode(this.f227509a) * 31, 31, this.f227510b);
    }
}
