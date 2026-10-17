package ts0;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f273867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f273868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f273869c;
    public final float d;

    public h(float f, float f4, float f5, float f6) {
        this.f273867a = f;
        this.f273868b = f4;
        this.f273869c = f5;
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
        return Float.compare(this.f273867a, hVar.f273867a) == 0 && Float.compare(this.f273868b, hVar.f273868b) == 0 && Float.compare(this.f273869c, hVar.f273869c) == 0 && Float.compare(this.d, hVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f273869c, m72.b.b(this.f273868b, Float.hashCode(this.f273867a) * 31, 31), 31);
    }
}
