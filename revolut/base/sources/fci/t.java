package fci;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f133811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133812b;

    public t(int i, int i2) {
        this.f133811a = i;
        this.f133812b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f133811a == tVar.f133811a && this.f133812b == tVar.f133812b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f133812b) + (Integer.hashCode(this.f133811a) * 31);
    }
}
