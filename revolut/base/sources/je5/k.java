package je5;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f173221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f173222b;

    public k(int i, int i2) {
        this.f173221a = i;
        this.f173222b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f173221a == kVar.f173221a && this.f173222b == kVar.f173222b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173222b) + (Integer.hashCode(this.f173221a) * 31);
    }
}
