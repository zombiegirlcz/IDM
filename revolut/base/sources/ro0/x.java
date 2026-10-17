package ro0;

/* JADX INFO: loaded from: classes19.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f255787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f255788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f255789c;
    public final float d;

    public x(float f, float f4, float f5, float f6) {
        this.f255787a = f;
        this.f255788b = f4;
        this.f255789c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Float.compare(this.f255787a, xVar.f255787a) == 0 && Float.compare(this.f255788b, xVar.f255788b) == 0 && Float.compare(this.f255789c, xVar.f255789c) == 0 && Float.compare(this.d, xVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f255789c, m72.b.b(this.f255788b, Float.hashCode(this.f255787a) * 31, 31), 31);
    }
}
