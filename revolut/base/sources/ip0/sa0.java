package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166332a;

    public sa0(boolean z) {
        this.f166332a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof sa0) && this.f166332a == ((sa0) obj2).f166332a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166332a);
    }
}
