package hx0;

/* JADX INFO: loaded from: classes19.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f156346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f156347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f156348c;

    public x(float f, float f4, long j2) {
        this.f156346a = f;
        this.f156347b = f4;
        this.f156348c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Float.compare(this.f156346a, xVar.f156346a) == 0 && Float.compare(this.f156347b, xVar.f156347b) == 0 && this.f156348c == xVar.f156348c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f156348c) + m72.b.b(this.f156347b, Float.hashCode(this.f156346a) * 31, 31);
    }
}
