package sp0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f264865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f264866b;

    public f(float f, int i) {
        this.f264865a = f;
        this.f264866b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Float.compare(this.f264865a, fVar.f264865a) == 0 && this.f264866b == fVar.f264866b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f264866b) + (Float.hashCode(this.f264865a) * 31);
    }
}
