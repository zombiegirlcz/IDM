package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class o70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165633b;

    public o70(boolean z, boolean z3) {
        this.f165632a = z;
        this.f165633b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o70)) {
            return false;
        }
        o70 o70Var = (o70) obj2;
        return this.f165632a == o70Var.f165632a && this.f165633b == o70Var.f165633b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165633b) + (Boolean.hashCode(this.f165632a) * 31);
    }
}
