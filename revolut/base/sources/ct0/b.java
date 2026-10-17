package ct0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f108559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f108560b;

    public b(float f, float f4) {
        this.f108559a = f;
        this.f108560b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Float.compare(this.f108559a, bVar.f108559a) == 0 && Float.compare(this.f108560b, bVar.f108560b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f108560b) + (Float.hashCode(this.f108559a) * 31);
    }
}
