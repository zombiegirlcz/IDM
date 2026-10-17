package d26;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f110720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f110721b;

    public a(long j2, double d) {
        this.f110720a = j2;
        this.f110721b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f110720a == aVar.f110720a && Double.compare(this.f110721b, aVar.f110721b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f110721b) + (Long.hashCode(this.f110720a) * 31);
    }
}
