package ui0;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f280286b;

    public g(int i, int i2) {
        this.f280285a = i;
        this.f280286b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f280285a == gVar.f280285a && this.f280286b == gVar.f280286b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280286b) + (Integer.hashCode(this.f280285a) * 31);
    }
}
