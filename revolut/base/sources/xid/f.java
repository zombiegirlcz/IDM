package xid;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f306329a;

    public f(double d) {
        this.f306329a = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Double.compare(this.f306329a, ((f) obj2).f306329a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f306329a);
    }
}
