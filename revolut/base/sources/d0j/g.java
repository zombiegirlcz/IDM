package d0j;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110397b;

    public g(int i, int i2) {
        this.f110396a = i;
        this.f110397b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f110396a == gVar.f110396a && this.f110397b == gVar.f110397b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110397b) + (Integer.hashCode(this.f110396a) * 31);
    }
}
