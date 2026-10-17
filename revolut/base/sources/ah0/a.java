package ah0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f4847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f4848b;

    public a(double d, double d5) {
        this.f4847a = d;
        this.f4848b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f4847a, aVar.f4847a) == 0 && Double.compare(this.f4848b, aVar.f4848b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f4848b) + (Double.hashCode(this.f4847a) * 31);
    }
}
