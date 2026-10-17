package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class xe0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167150b;

    public xe0(boolean z, boolean z3) {
        this.f167149a = z;
        this.f167150b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f167150b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xe0)) {
            return false;
        }
        xe0 xe0Var = (xe0) obj2;
        return this.f167149a == xe0Var.f167149a && this.f167150b == xe0Var.f167150b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167150b) + (Boolean.hashCode(this.f167149a) * 31);
    }
}
