package sxl;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f266524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f266525b;

    public a(float f, float f4) {
        this.f266524a = f;
        this.f266525b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Float.compare(this.f266524a, aVar.f266524a) == 0 && Float.compare(this.f266525b, aVar.f266525b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f266525b) + (Float.hashCode(this.f266524a) * 31);
    }
}
