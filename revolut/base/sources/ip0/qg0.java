package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class qg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165977b;

    public qg0(boolean z, boolean z3) {
        this.f165976a = z;
        this.f165977b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qg0)) {
            return false;
        }
        qg0 qg0Var = (qg0) obj2;
        return this.f165976a == qg0Var.f165976a && this.f165977b == qg0Var.f165977b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165977b) + (Boolean.hashCode(this.f165976a) * 31);
    }
}
