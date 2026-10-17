package lt0;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f199758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f199759b;

    public r(float f, float f4) {
        this.f199758a = f;
        this.f199759b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Float.compare(this.f199758a, rVar.f199758a) == 0 && Float.compare(this.f199759b, rVar.f199759b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f199759b) + (Float.hashCode(this.f199758a) * 31);
    }
}
