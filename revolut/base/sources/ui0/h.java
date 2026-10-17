package ui0;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f280288b;

    public h(int i, int i2) {
        this.f280287a = i;
        this.f280288b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f280287a == hVar.f280287a && this.f280288b == hVar.f280288b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280288b) + (Integer.hashCode(this.f280287a) * 31);
    }
}
