package ujh;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f280626b;

    public c(int i, int i2) {
        this.f280625a = i;
        this.f280626b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f280625a == cVar.f280625a && this.f280626b == cVar.f280626b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280626b) + (Integer.hashCode(this.f280625a) * 31);
    }
}
