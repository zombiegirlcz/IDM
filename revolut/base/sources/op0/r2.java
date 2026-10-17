package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227400b;

    public r2(boolean z, boolean z3) {
        this.f227399a = z;
        this.f227400b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return this.f227399a == r2Var.f227399a && this.f227400b == r2Var.f227400b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227400b) + (Boolean.hashCode(this.f227399a) * 31);
    }
}
