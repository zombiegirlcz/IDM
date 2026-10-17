package rr6;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f256727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f256728b;

    public p(int i, double d) {
        this.f256727a = i;
        this.f256728b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f256727a == pVar.f256727a && Double.compare(this.f256728b, pVar.f256728b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f256728b) + (Integer.hashCode(this.f256727a) * 31);
    }
}
