package xid;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f306328a;

    public e(double d) {
        this.f306328a = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Double.compare(this.f306328a, ((e) obj2).f306328a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f306328a);
    }
}
