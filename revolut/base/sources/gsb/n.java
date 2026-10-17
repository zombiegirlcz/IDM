package gsb;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f146363a;

    public n(long j2) {
        this.f146363a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f146363a == ((n) obj2).f146363a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f146363a);
    }
}
