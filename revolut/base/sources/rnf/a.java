package rnf;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f255656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f255657b;

    public a(double d, double d5) {
        this.f255656a = d;
        this.f255657b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f255656a, aVar.f255656a) == 0 && Double.compare(this.f255657b, aVar.f255657b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f255657b) + (Double.hashCode(this.f255656a) * 31);
    }
}
