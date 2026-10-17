package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class wr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167058a;

    public wr(boolean z) {
        this.f167058a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wr) && this.f167058a == ((wr) obj2).f167058a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167058a);
    }
}
