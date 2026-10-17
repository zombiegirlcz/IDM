package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164930b;

    public k(boolean z, boolean z3) {
        this.f164929a = z;
        this.f164930b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f164929a == kVar.f164929a && this.f164930b == kVar.f164930b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164930b) + (Boolean.hashCode(this.f164929a) * 31);
    }
}
