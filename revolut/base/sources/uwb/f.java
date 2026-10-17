package uwb;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f283606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f283607b;

    public f(int i, int i2) {
        this.f283606a = i;
        this.f283607b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f283606a == fVar.f283606a && this.f283607b == fVar.f283607b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f283607b) + (Integer.hashCode(this.f283606a) * 31);
    }
}
