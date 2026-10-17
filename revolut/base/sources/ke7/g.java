package ke7;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f183016a;

    public g(long j2) {
        this.f183016a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f183016a == ((g) obj2).f183016a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f183016a);
    }
}
