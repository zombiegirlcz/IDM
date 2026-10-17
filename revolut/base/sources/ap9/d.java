package ap9;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8124a;

    public d(long j2) {
        this.f8124a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f8124a == ((d) obj2).f8124a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8124a);
    }
}
