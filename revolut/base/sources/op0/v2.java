package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227457b;

    public v2(boolean z, boolean z3) {
        this.f227456a = z;
        this.f227457b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return this.f227456a == v2Var.f227456a && this.f227457b == v2Var.f227457b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227457b) + (Boolean.hashCode(this.f227456a) * 31);
    }
}
