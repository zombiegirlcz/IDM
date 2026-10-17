package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class wl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167049a;

    public wl0(boolean z) {
        this.f167049a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wl0) && this.f167049a == ((wl0) obj2).f167049a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167049a);
    }
}
