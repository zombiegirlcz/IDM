package jfb;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f173813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f173814b;

    public i(double d, double d5) {
        this.f173813a = d;
        this.f173814b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Double.compare(this.f173813a, iVar.f173813a) == 0 && Double.compare(this.f173814b, iVar.f173814b) == 0 && Float.compare(10.0f, 10.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(10.0f) + m72.b.c(Double.hashCode(this.f173813a) * 31, this.f173814b, 31);
    }
}
