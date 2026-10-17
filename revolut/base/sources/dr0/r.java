package dr0;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends c8g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f117061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117062b;

    public r(float f, float f4) {
        this.f117061a = f;
        this.f117062b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Float.compare(this.f117061a, rVar.f117061a) == 0 && Float.compare(this.f117062b, rVar.f117062b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f117062b) + (Float.hashCode(this.f117061a) * 31);
    }

    @Override // c8g.a
    public final float s() {
        return this.f117062b;
    }
}
