package vw;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f292592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f292593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f292594c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f292595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f292596h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f292597j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f292598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f292599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f292600n;

    public i(long j2, float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57, float f69, float f75) {
        this.f292592a = j2;
        this.f292593b = f;
        this.f292594c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f32;
        this.f292595g = f35;
        this.f292596h = f36;
        this.i = f37;
        this.f292597j = f41;
        this.k = f42;
        this.f292598l = f57;
        this.f292599m = f69;
        this.f292600n = f75;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f292592a == iVar.f292592a && Float.compare(this.f292593b, iVar.f292593b) == 0 && Float.compare(this.f292594c, iVar.f292594c) == 0 && Float.compare(this.d, iVar.d) == 0 && Float.compare(this.e, iVar.e) == 0 && Float.compare(this.f, iVar.f) == 0 && Float.compare(this.f292595g, iVar.f292595g) == 0 && Float.compare(this.f292596h, iVar.f292596h) == 0 && Float.compare(this.i, iVar.i) == 0 && Float.compare(this.f292597j, iVar.f292597j) == 0 && Float.compare(this.k, iVar.k) == 0 && Float.compare(this.f292598l, iVar.f292598l) == 0 && Float.compare(this.f292599m, iVar.f292599m) == 0 && Float.compare(this.f292600n, iVar.f292600n) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f292600n) + m72.b.b(this.f292599m, m72.b.b(this.f292598l, m72.b.b(this.k, m72.b.b(this.f292597j, m72.b.b(this.i, m72.b.b(this.f292596h, m72.b.b(this.f292595g, m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f292594c, m72.b.b(this.f292593b, Long.hashCode(this.f292592a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
