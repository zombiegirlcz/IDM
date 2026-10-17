package xod;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f307810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f307811b;

    public k(int i, int i2) {
        this.f307810a = i;
        this.f307811b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f307810a == kVar.f307810a && this.f307811b == kVar.f307811b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f307811b) + (Integer.hashCode(this.f307810a) * 31);
    }
}
