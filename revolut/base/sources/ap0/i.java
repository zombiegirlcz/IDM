package ap0;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8034b;

    public i(boolean z, boolean z3) {
        this.f8033a = z;
        this.f8034b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f8033a == iVar.f8033a && this.f8034b == iVar.f8034b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8034b) + (Boolean.hashCode(this.f8033a) * 31);
    }
}
