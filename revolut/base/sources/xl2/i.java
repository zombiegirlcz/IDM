package xl2;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f306917a;

    public i(float f) {
        this.f306917a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Float.compare(this.f306917a, ((i) obj2).f306917a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f306917a);
    }
}
