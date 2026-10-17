package e10;

/* JADX INFO: loaded from: classes16.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f121821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f121822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f121823c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f121824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f121825h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f121826j;
    public final float k;

    public m(float f, float f4, float f5, float f6, float f32, float f35, float f36, float f37, float f41, float f42, float f57) {
        this.f121821a = f;
        this.f121822b = f4;
        this.f121823c = f5;
        this.d = f6;
        this.e = f32;
        this.f = f35;
        this.f121824g = f36;
        this.f121825h = f37;
        this.i = f41;
        this.f121826j = f42;
        this.k = f57;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Float.compare(this.f121821a, mVar.f121821a) == 0 && Float.compare(this.f121822b, mVar.f121822b) == 0 && Float.compare(this.f121823c, mVar.f121823c) == 0 && Float.compare(this.d, mVar.d) == 0 && Float.compare(this.e, mVar.e) == 0 && Float.compare(this.f, mVar.f) == 0 && Float.compare(this.f121824g, mVar.f121824g) == 0 && Float.compare(this.f121825h, mVar.f121825h) == 0 && Float.compare(this.i, mVar.i) == 0 && Float.compare(this.f121826j, mVar.f121826j) == 0 && Float.compare(this.k, mVar.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + m72.b.b(this.f121826j, m72.b.b(this.i, m72.b.b(this.f121825h, m72.b.b(this.f121824g, m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f121823c, m72.b.b(this.f121822b, Float.hashCode(this.f121821a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
