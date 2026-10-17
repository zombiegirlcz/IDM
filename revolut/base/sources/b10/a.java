package b10;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11698c;

    public a(float f, float f4, float f5) {
        this.f11696a = f;
        this.f11697b = f4;
        this.f11698c = f5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Float.compare(this.f11696a, aVar.f11696a) == 0 && Float.compare(this.f11697b, aVar.f11697b) == 0 && Float.compare(this.f11698c, aVar.f11698c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11698c) + m72.b.b(this.f11697b, Float.hashCode(this.f11696a) * 31, 31);
    }
}
