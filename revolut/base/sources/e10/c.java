package e10;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f121797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f121798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f121799c;
    public final float d;

    public c(float f, float f4, float f5, float f6) {
        this.f121797a = f;
        this.f121798b = f4;
        this.f121799c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Float.compare(this.f121797a, cVar.f121797a) == 0 && Float.compare(this.f121798b, cVar.f121798b) == 0 && Float.compare(this.f121799c, cVar.f121799c) == 0 && Float.compare(this.d, cVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f121799c, m72.b.b(this.f121798b, Float.hashCode(this.f121797a) * 31, 31), 31);
    }
}
