package c00;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20092b;

    public h(int i, int i2) {
        this.f20091a = i;
        this.f20092b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f20091a == hVar.f20091a && this.f20092b == hVar.f20092b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20092b) + (Integer.hashCode(this.f20091a) * 31);
    }
}
