package cy0;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f110018b;

    public b(int i, float f) {
        this.f110017a = i;
        this.f110018b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f110017a == bVar.f110017a && Float.compare(this.f110018b, bVar.f110018b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110018b) + (Integer.hashCode(this.f110017a) * 31);
    }
}
