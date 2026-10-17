package ya1;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f311903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f311904b;

    public l(double d, double d5) {
        this.f311903a = d;
        this.f311904b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Double.compare(this.f311903a, lVar.f311903a) == 0 && Double.compare(this.f311904b, lVar.f311904b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f311904b) + (Double.hashCode(this.f311903a) * 31);
    }
}
