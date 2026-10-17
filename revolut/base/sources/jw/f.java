package jw;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f178908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f178909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f178910c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f178911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f178912h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f178913j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f178914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f178915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f178916n;

    public f(long j2, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57, float f69, float f75) {
        this.f178908a = j2;
        this.f178909b = f;
        this.f178910c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f32;
        this.f178911g = f35;
        this.f178912h = f36;
        this.i = f37;
        this.f178913j = f41;
        this.k = f42;
        this.f178914l = f57;
        this.f178915m = f69;
        this.f178916n = f75;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f178908a == fVar.f178908a && Float.compare(this.f178909b, fVar.f178909b) == 0 && Float.compare(this.f178910c, fVar.f178910c) == 0 && Float.compare(this.d, fVar.d) == 0 && Float.compare(this.e, fVar.e) == 0 && Float.compare(this.f, fVar.f) == 0 && Float.compare(this.f178911g, fVar.f178911g) == 0 && Float.compare(this.f178912h, fVar.f178912h) == 0 && Float.compare(this.i, fVar.i) == 0 && Float.compare(this.f178913j, fVar.f178913j) == 0 && Float.compare(this.k, fVar.k) == 0 && Float.compare(this.f178914l, fVar.f178914l) == 0 && Float.compare(this.f178915m, fVar.f178915m) == 0 && Float.compare(this.f178916n, fVar.f178916n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f178916n) + m72.b.b(this.f178915m, m72.b.b(this.f178914l, m72.b.b(this.k, m72.b.b(this.f178913j, m72.b.b(this.i, m72.b.b(this.f178912h, m72.b.b(this.f178911g, m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f178910c, m72.b.b(this.f178909b, Long.hashCode(this.f178908a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
