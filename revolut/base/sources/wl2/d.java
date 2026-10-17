package wl2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f298368a;

    public d(float f) {
        this.f298368a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Float.compare(this.f298368a, ((d) obj2).f298368a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f298368a);
    }
}
