package yb;

/* JADX INFO: loaded from: classes.dex */
public final class w extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f312141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f312142b;

    public w(i0 i0Var, h0 h0Var) {
        this.f312141a = i0Var;
        this.f312142b = h0Var;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof j0) {
            j0 j0Var = (j0) obj2;
            i0 i0Var = this.f312141a;
            if (i0Var != null ? i0Var.equals(((w) j0Var).f312141a) : ((w) j0Var).f312141a == null) {
                h0 h0Var = this.f312142b;
                if (h0Var != null ? h0Var.equals(((w) j0Var).f312142b) : ((w) j0Var).f312142b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        i0 i0Var = this.f312141a;
        int iHashCode = ((i0Var == null ? 0 : i0Var.hashCode()) ^ 1000003) * 1000003;
        h0 h0Var = this.f312142b;
        return (h0Var != null ? h0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f312141a + ", mobileSubtype=" + this.f312142b + "}";
    }
}
