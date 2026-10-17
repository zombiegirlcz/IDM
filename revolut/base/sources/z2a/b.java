package z2a;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f319036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f319037b;

    public b(int i, float f) {
        this.f319036a = i;
        this.f319037b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f319036a == bVar.f319036a && Float.compare(this.f319037b, bVar.f319037b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f319037b) + (Integer.hashCode(this.f319036a) * 31);
    }
}
