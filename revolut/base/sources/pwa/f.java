package pwa;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f240356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f240357b;

    public f(int i, int i2) {
        this.f240356a = i;
        this.f240357b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f240356a == fVar.f240356a && this.f240357b == fVar.f240357b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f240357b) + (Integer.hashCode(this.f240356a) * 31);
    }
}
