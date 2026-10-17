package nya;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f220755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f220756b;

    public q(boolean z, boolean z3) {
        this.f220755a = z;
        this.f220756b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f220755a == qVar.f220755a && this.f220756b == qVar.f220756b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220756b) + (Boolean.hashCode(this.f220755a) * 31);
    }
}
