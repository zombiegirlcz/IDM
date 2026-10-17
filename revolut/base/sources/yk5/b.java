package yk5;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f314570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f314571b;

    public b(int i, int i2) {
        this.f314570a = i;
        this.f314571b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f314570a == bVar.f314570a && this.f314571b == bVar.f314571b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f314571b) + (Integer.hashCode(this.f314570a) * 31);
    }
}
