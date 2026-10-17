package dv0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118018b;

    public d(int i, int i2) {
        this.f118017a = i;
        this.f118018b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f118017a == dVar.f118017a && this.f118018b == dVar.f118018b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f118018b) + (Integer.hashCode(this.f118017a) * 31);
    }
}
