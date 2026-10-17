package lf8;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194677b;

    public k(int i, int i2) {
        this.f194676a = i;
        this.f194677b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f194676a == kVar.f194676a && this.f194677b == kVar.f194677b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f194677b) + (Integer.hashCode(this.f194676a) * 31);
    }
}
