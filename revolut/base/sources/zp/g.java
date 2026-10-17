package zp;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f324095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f324096b;

    public g(long j2, long j3) {
        this.f324095a = j2;
        this.f324096b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f324095a == gVar.f324095a && this.f324096b == gVar.f324096b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f324096b) + (Long.hashCode(this.f324095a) * 31);
    }
}
