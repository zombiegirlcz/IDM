package kp0;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188040b;

    public m0(boolean z, boolean z3) {
        this.f188039a = z;
        this.f188040b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.f188039a == m0Var.f188039a && this.f188040b == m0Var.f188040b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188040b) + (Boolean.hashCode(this.f188039a) * 31);
    }
}
