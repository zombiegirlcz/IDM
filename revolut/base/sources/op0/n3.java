package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227360b;

    public n3(boolean z, boolean z3) {
        this.f227359a = z;
        this.f227360b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return this.f227359a == n3Var.f227359a && this.f227360b == n3Var.f227360b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227360b) + (Boolean.hashCode(this.f227359a) * 31);
    }
}
