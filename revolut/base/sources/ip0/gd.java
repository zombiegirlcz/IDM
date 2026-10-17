package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class gd extends hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f164399a;

    public gd(long j2) {
        this.f164399a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof gd) && this.f164399a == ((gd) obj2).f164399a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f164399a);
    }
}
