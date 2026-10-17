package jw;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f178898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f178899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f178900c;
    public final float d;

    public b(float f, float f4, float f5, float f6) {
        this.f178898a = f;
        this.f178899b = f4;
        this.f178900c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Float.compare(this.f178898a, bVar.f178898a) == 0 && Float.compare(this.f178899b, bVar.f178899b) == 0 && Float.compare(this.f178900c, bVar.f178900c) == 0 && Float.compare(this.d, bVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f178900c, m72.b.b(this.f178899b, Float.hashCode(this.f178898a) * 31, 31), 31);
    }
}
