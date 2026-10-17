package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class fj implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164270b;

    public fj(boolean z, boolean z3) {
        this.f164269a = z;
        this.f164270b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164270b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fj)) {
            return false;
        }
        fj fjVar = (fj) obj2;
        return this.f164269a == fjVar.f164269a && this.f164270b == fjVar.f164270b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164270b) + (Boolean.hashCode(this.f164269a) * 31);
    }
}
