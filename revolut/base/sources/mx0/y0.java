package mx0;

/* JADX INFO: loaded from: classes20.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f210118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210119b;

    public y0(boolean z, boolean z3) {
        this.f210118a = z;
        this.f210119b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return this.f210118a == y0Var.f210118a && this.f210119b == y0Var.f210119b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210119b) + (Boolean.hashCode(this.f210118a) * 31);
    }
}
