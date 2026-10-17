package qt0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f248894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f248895b;

    public d(float f, int i) {
        this.f248894a = f;
        this.f248895b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Float.compare(this.f248894a, dVar.f248894a) == 0 && this.f248895b == dVar.f248895b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f248895b) + (Float.hashCode(this.f248894a) * 31);
    }
}
