package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class wv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167064a;

    public wv(boolean z) {
        this.f167064a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wv) && this.f167064a == ((wv) obj2).f167064a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167064a);
    }
}
