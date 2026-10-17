package ie9;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f160674a;

    public b(long j2) {
        this.f160674a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f160674a == ((b) obj2).f160674a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f160674a);
    }
}
