package e10;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f121809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f121810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f121811c;
    public final float d;

    public h(float f, float f4, float f5, float f6) {
        this.f121809a = f;
        this.f121810b = f4;
        this.f121811c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Float.compare(this.f121809a, hVar.f121809a) == 0 && Float.compare(this.f121810b, hVar.f121810b) == 0 && Float.compare(this.f121811c, hVar.f121811c) == 0 && Float.compare(this.d, hVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f121811c, m72.b.b(this.f121810b, Float.hashCode(this.f121809a) * 31, 31), 31);
    }
}
