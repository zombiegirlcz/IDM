package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class hn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164575b;

    public hn0(boolean z, boolean z3) {
        this.f164574a = z;
        this.f164575b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hn0)) {
            return false;
        }
        hn0 hn0Var = (hn0) obj2;
        return this.f164574a == hn0Var.f164574a && this.f164575b == hn0Var.f164575b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164575b) + (Boolean.hashCode(this.f164574a) * 31);
    }
}
