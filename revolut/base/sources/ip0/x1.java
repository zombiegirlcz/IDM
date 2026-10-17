package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167080a;

    public x1(boolean z) {
        this.f167080a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x1) && this.f167080a == ((x1) obj2).f167080a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167080a);
    }
}
