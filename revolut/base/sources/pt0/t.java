package pt0;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f239586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239587b;

    public t(int i, int i2) {
        this.f239586a = i;
        this.f239587b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f239586a == tVar.f239586a && this.f239587b == tVar.f239587b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f239587b) + (Integer.hashCode(this.f239586a) * 31);
    }
}
