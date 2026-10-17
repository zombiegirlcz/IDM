package xo0;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f307546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f307547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f307548c;
    public final float d;

    public k(float f, float f4, float f5, float f6) {
        this.f307546a = f;
        this.f307547b = f4;
        this.f307548c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Float.compare(this.f307546a, kVar.f307546a) == 0 && Float.compare(this.f307547b, kVar.f307547b) == 0 && Float.compare(this.f307548c, kVar.f307548c) == 0 && Float.compare(this.d, kVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f307548c, m72.b.b(this.f307547b, Float.hashCode(this.f307546a) * 31, 31), 31);
    }
}
