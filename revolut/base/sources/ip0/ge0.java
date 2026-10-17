package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ge0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164402a;

    public ge0(boolean z) {
        this.f164402a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ge0) && this.f164402a == ((ge0) obj2).f164402a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164402a);
    }
}
