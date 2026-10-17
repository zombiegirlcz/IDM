package mxl;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f210268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f210269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f210270c;
    public final float d;

    public h(float f, float f4, float f5, float f6) {
        this.f210268a = f;
        this.f210269b = f4;
        this.f210270c = f5;
        this.d = f6;
    }

    public final float a() {
        return this.f210269b - this.d;
    }

    public final float b() {
        return this.f210268a - this.f210270c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Float.compare(this.f210268a, hVar.f210268a) == 0 && Float.compare(this.f210269b, hVar.f210269b) == 0 && Float.compare(this.f210270c, hVar.f210270c) == 0 && Float.compare(this.d, hVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f210270c, m72.b.b(this.f210269b, Float.hashCode(this.f210268a) * 31, 31), 31);
    }
}
