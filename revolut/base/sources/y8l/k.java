package y8l;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f311697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f311698b;

    public k(boolean z, boolean z3) {
        this.f311697a = z;
        this.f311698b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f311697a == kVar.f311697a && this.f311698b == kVar.f311698b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f311698b) + (Boolean.hashCode(this.f311697a) * 31);
    }
}
