package h8f;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f150030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f150031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f150032c;
    public final float d;

    public d(float f, float f4, float f5, float f6) {
        this.f150030a = f;
        this.f150031b = f4;
        this.f150032c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Float.compare(216.0f, 216.0f) == 0 && Float.compare(this.f150030a, dVar.f150030a) == 0 && Float.compare(this.f150031b, dVar.f150031b) == 0 && Float.compare(this.f150032c, dVar.f150032c) == 0 && Float.compare(this.d, dVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f150032c, m72.b.b(this.f150031b, m72.b.b(this.f150030a, Float.hashCode(216.0f) * 31, 31), 31), 31);
    }
}
