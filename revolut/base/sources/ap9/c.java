package ap9;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8123a;

    public c(long j2) {
        this.f8123a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f8123a == ((c) obj2).f8123a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8123a);
    }
}
