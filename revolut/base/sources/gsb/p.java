package gsb;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f146365a;

    public p(long j2) {
        this.f146365a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f146365a == ((p) obj2).f146365a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f146365a);
    }
}
