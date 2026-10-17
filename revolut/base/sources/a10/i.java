package a10;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f457c;
    public final float d;

    public i(float f, float f4, float f5, float f6) {
        this.f455a = f;
        this.f456b = f4;
        this.f457c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Float.compare(this.f455a, iVar.f455a) == 0 && Float.compare(this.f456b, iVar.f456b) == 0 && Float.compare(this.f457c, iVar.f457c) == 0 && Float.compare(this.d, iVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f457c, m72.b.b(this.f456b, Float.hashCode(this.f455a) * 31, 31), 31);
    }
}
