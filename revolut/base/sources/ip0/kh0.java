package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class kh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165021b;

    public kh0(boolean z, boolean z3) {
        this.f165020a = z;
        this.f165021b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kh0)) {
            return false;
        }
        kh0 kh0Var = (kh0) obj2;
        return this.f165020a == kh0Var.f165020a && this.f165021b == kh0Var.f165021b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165021b) + (Boolean.hashCode(this.f165020a) * 31);
    }
}
