package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class fj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164272b;

    public fj0(boolean z, boolean z3) {
        this.f164271a = z;
        this.f164272b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fj0)) {
            return false;
        }
        fj0 fj0Var = (fj0) obj2;
        return this.f164271a == fj0Var.f164271a && this.f164272b == fj0Var.f164272b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164272b) + (Boolean.hashCode(this.f164271a) * 31);
    }
}
