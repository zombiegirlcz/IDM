package sp0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f264856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f264857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f264858c;
    public final float d;
    public final float e;

    public c(float f, float f4, float f5, float f6, float f32) {
        this.f264856a = f;
        this.f264857b = f4;
        this.f264858c = f5;
        this.d = f6;
        this.e = f32;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Float.compare(this.f264856a, cVar.f264856a) == 0 && Float.compare(this.f264857b, cVar.f264857b) == 0 && Float.compare(this.f264858c, cVar.f264858c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + m72.b.b(this.d, m72.b.b(this.f264858c, m72.b.b(this.f264857b, Float.hashCode(this.f264856a) * 31, 31), 31), 31);
    }
}
