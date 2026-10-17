package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166198b;

    public rj0(boolean z, boolean z3) {
        this.f166197a = z;
        this.f166198b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rj0)) {
            return false;
        }
        rj0 rj0Var = (rj0) obj2;
        return this.f166197a == rj0Var.f166197a && this.f166198b == rj0Var.f166198b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166198b) + (Boolean.hashCode(this.f166197a) * 31);
    }
}
