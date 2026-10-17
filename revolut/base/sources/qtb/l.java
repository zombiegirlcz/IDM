package qtb;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f249072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f249073b;

    public l(boolean z, boolean z3) {
        this.f249072a = z;
        this.f249073b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f249072a == lVar.f249072a && this.f249073b == lVar.f249073b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249073b) + (Boolean.hashCode(this.f249072a) * 31);
    }
}
