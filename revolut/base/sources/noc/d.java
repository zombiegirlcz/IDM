package noc;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217977b;

    public d(int i, int i2) {
        this.f217976a = i;
        this.f217977b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f217976a == dVar.f217976a && this.f217977b == dVar.f217977b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f217977b) + (Integer.hashCode(this.f217976a) * 31);
    }
}
