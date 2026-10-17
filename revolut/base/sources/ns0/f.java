package ns0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f218686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f218687b;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f218686a == fVar.f218686a && this.f218687b == fVar.f218687b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218687b) + (Integer.hashCode(this.f218686a) * 31);
    }
}
