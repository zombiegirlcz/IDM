package d0j;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110395b;

    public f0(int i, int i2) {
        this.f110394a = i;
        this.f110395b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f110394a == f0Var.f110394a && this.f110395b == f0Var.f110395b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110395b) + (Integer.hashCode(this.f110394a) * 31);
    }
}
