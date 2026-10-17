package ar0;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8492b;

    public g(int i, int i2) {
        this.f8491a = i;
        this.f8492b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f8491a == gVar.f8491a && this.f8492b == gVar.f8492b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8492b) + (Integer.hashCode(this.f8491a) * 31);
    }
}
