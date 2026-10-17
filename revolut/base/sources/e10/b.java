package e10;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f121794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f121795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f121796c;

    public b(float f, float f4, float f5) {
        this.f121794a = f;
        this.f121795b = f4;
        this.f121796c = f5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Float.compare(this.f121794a, bVar.f121794a) == 0 && Float.compare(this.f121795b, bVar.f121795b) == 0 && Float.compare(this.f121796c, bVar.f121796c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f121796c) + m72.b.b(this.f121795b, Float.hashCode(this.f121794a) * 31, 31);
    }
}
