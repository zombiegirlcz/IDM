package d3e;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f111096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f111097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f111098c;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f111096a, aVar.f111096a) == 0 && Double.compare(this.f111097b, aVar.f111097b) == 0 && Double.compare(this.f111098c, aVar.f111098c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f111098c) + m72.b.c(Double.hashCode(this.f111096a) * 31, this.f111097b, 31);
    }

    public a(int i) {
        this.f111096a = 0.25d;
        this.f111097b = 0.05d;
        this.f111098c = 0.05d;
    }
}
