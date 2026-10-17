package aie;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5239b;

    public f(int i, boolean z) {
        this.f5238a = i;
        this.f5239b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f5238a == fVar.f5238a && this.f5239b == fVar.f5239b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5239b) + (Integer.hashCode(this.f5238a) * 31);
    }
}
