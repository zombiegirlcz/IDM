package zt0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f325001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f325002b;

    public a(float f, int i) {
        this.f325001a = f;
        this.f325002b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Float.compare(this.f325001a, aVar.f325001a) == 0 && this.f325002b == aVar.f325002b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f325002b) + (Float.hashCode(this.f325001a) * 31);
    }
}
