package aa0;

/* JADX INFO: loaded from: classes19.dex */
public final class n0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2736a;

    public n0(boolean z) {
        this.f2736a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && this.f2736a == ((n0) obj2).f2736a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2736a);
    }
}
