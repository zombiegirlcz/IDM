package e10;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f121791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f121792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f121793c;
    public final float d;

    public a(float f, float f4, float f5, float f6) {
        this.f121791a = f;
        this.f121792b = f4;
        this.f121793c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Float.compare(this.f121791a, aVar.f121791a) == 0 && Float.compare(this.f121792b, aVar.f121792b) == 0 && Float.compare(this.f121793c, aVar.f121793c) == 0 && Float.compare(this.d, aVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f121793c, m72.b.b(this.f121792b, Float.hashCode(this.f121791a) * 31, 31), 31);
    }
}
