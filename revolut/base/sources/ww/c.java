package ww;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f300566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f300567b;

    public c(double d, double d5) {
        this.f300566a = d;
        this.f300567b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.f300566a, cVar.f300566a) == 0 && Double.compare(this.f300567b, cVar.f300567b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f300567b) + (Double.hashCode(this.f300566a) * 31);
    }
}
