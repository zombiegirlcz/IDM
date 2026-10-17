package ul5;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f280893b;

    public f(int i, int i2) {
        this.f280892a = i;
        this.f280893b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f280892a == fVar.f280892a && this.f280893b == fVar.f280893b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280893b) + (Integer.hashCode(this.f280892a) * 31);
    }
}
