package yi3;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f314227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f314228b;

    public b(double d, double d5) {
        this.f314227a = d;
        this.f314228b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Double.compare(this.f314227a, bVar.f314227a) == 0 && Double.compare(this.f314228b, bVar.f314228b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f314228b) + (Double.hashCode(this.f314227a) * 31);
    }
}
