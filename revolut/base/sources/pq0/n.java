package pq0;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f238658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238659b;

    public n(int i, int i2) {
        this.f238658a = i;
        this.f238659b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f238658a == nVar.f238658a && this.f238659b == nVar.f238659b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f238659b) + (Integer.hashCode(this.f238658a) * 31);
    }
}
