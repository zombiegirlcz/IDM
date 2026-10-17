package sr6;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f265130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f265131b;

    public k(boolean z, j jVar, int i) {
        jVar = (i & 16) != 0 ? null : jVar;
        this.f265130a = z;
        this.f265131b = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f265130a == kVar.f265130a && this.f265131b == kVar.f265131b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f265130a) * 923521;
        j jVar = this.f265131b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
