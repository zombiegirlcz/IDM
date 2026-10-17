package q0i;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f241280a;

    public b(long j2) {
        this.f241280a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f241280a == ((b) obj2).f241280a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f241280a);
    }
}
