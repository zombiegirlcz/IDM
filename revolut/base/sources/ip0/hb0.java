package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class hb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164530a;

    public hb0(boolean z) {
        this.f164530a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof hb0) && this.f164530a == ((hb0) obj2).f164530a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164530a);
    }
}
