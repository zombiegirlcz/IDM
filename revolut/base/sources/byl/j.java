package byl;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19875b;

    public j(float f, float f4) {
        this.f19874a = f;
        this.f19875b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Float.compare(this.f19874a, jVar.f19874a) == 0 && Float.compare(this.f19875b, jVar.f19875b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19875b) + (Float.hashCode(this.f19874a) * 31);
    }
}
