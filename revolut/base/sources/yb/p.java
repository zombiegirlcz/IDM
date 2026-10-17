package yb;

/* JADX INFO: loaded from: classes16.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f312125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f312126b;

    public p(s sVar, a0 a0Var) {
        this.f312125a = sVar;
        this.f312126b = a0Var;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof b0) {
            b0 b0Var = (b0) obj2;
            e0 e0Var = this.f312125a;
            if (e0Var != null ? e0Var.equals(((p) b0Var).f312125a) : ((p) b0Var).f312125a == null) {
                a0 a0Var = this.f312126b;
                if (a0Var != null ? a0Var.equals(((p) b0Var).f312126b) : ((p) b0Var).f312126b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        e0 e0Var = this.f312125a;
        int iHashCode = ((e0Var == null ? 0 : e0Var.hashCode()) ^ 1000003) * 1000003;
        a0 a0Var = this.f312126b;
        return (a0Var != null ? a0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f312125a + ", productIdOrigin=" + this.f312126b + "}";
    }
}
