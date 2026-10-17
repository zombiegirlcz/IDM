package k59;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f181465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f181466b;

    public a(double d, double d5) {
        this.f181465a = d;
        this.f181466b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f181465a, aVar.f181465a) == 0 && Double.compare(this.f181466b, aVar.f181466b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f181466b) + (Double.hashCode(this.f181465a) * 31);
    }
}
