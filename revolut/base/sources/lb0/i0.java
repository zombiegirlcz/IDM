package lb0;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f193539a;

    public i0(boolean z) {
        this.f193539a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && this.f193539a == ((i0) obj2).f193539a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193539a);
    }
}
