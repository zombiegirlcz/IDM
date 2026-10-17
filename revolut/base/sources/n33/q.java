package n33;

/* JADX INFO: loaded from: classes21.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f211785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f211786b;

    public q(boolean z, boolean z3) {
        this.f211785a = z;
        this.f211786b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f211785a == qVar.f211785a && this.f211786b == qVar.f211786b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211786b) + (Boolean.hashCode(this.f211785a) * 31);
    }
}
