package rc;

/* JADX INFO: loaded from: classes16.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f253178a;

    public v(long j2) {
        this.f253178a = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return (obj2 instanceof v) && this.f253178a == ((v) obj2).f253178a;
    }

    public final int hashCode() {
        long j2 = this.f253178a;
        return (((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return a0.d.j(this.f253178a, ", webViewRequestMode=0}", new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
