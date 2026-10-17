package in1;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f162582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162583b;

    public f(boolean z, boolean z3) {
        this.f162582a = z;
        this.f162583b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f162582a == fVar.f162582a && this.f162583b == fVar.f162583b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162583b) + (Boolean.hashCode(this.f162582a) * 31);
    }
}
