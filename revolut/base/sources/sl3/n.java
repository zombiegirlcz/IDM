package sl3;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f264123a;

    public n(long j2) {
        this.f264123a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f264123a == ((n) obj2).f264123a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f264123a);
    }
}
