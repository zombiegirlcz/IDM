package ffb;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f134787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f134788b;

    public a(double d, double d5) {
        this.f134787a = d;
        this.f134788b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f134787a, aVar.f134787a) == 0 && Double.compare(this.f134788b, aVar.f134788b) == 0 && Float.compare(10.0f, 10.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(10.0f) + m72.b.c(Double.hashCode(this.f134787a) * 31, this.f134788b, 31);
    }
}
