package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class tk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166537b;

    public tk0(boolean z, boolean z3) {
        this.f166536a = z;
        this.f166537b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tk0)) {
            return false;
        }
        tk0 tk0Var = (tk0) obj2;
        return this.f166536a == tk0Var.f166536a && this.f166537b == tk0Var.f166537b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166537b) + (Boolean.hashCode(this.f166536a) * 31);
    }
}
