package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227343b;

    public l2(boolean z, boolean z3) {
        this.f227342a = z;
        this.f227343b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return this.f227342a == l2Var.f227342a && this.f227343b == l2Var.f227343b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227343b) + (Boolean.hashCode(this.f227342a) * 31);
    }
}
