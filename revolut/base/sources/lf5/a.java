package lf5;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f194634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f194635b;

    public a(double d, double d5) {
        this.f194634a = d;
        this.f194635b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f194634a, aVar.f194634a) == 0 && Double.compare(this.f194635b, aVar.f194635b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f194635b) + (Double.hashCode(this.f194634a) * 31);
    }
}
