package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class vo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166863b;

    public vo0(boolean z, boolean z3) {
        this.f166862a = z;
        this.f166863b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof vo0)) {
            return false;
        }
        vo0 vo0Var = (vo0) obj2;
        return this.f166862a == vo0Var.f166862a && this.f166863b == vo0Var.f166863b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166863b) + (Boolean.hashCode(this.f166862a) * 31);
    }
}
