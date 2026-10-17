package dr0;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends c8g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f117060a;

    public q(float f) {
        this.f117060a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Float.compare(this.f117060a, ((q) obj2).f117060a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f117060a);
    }

    @Override // c8g.a
    public final float s() {
        return this.f117060a;
    }
}
