package oid;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f225631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f225632b;

    public f0(double d, double d5) {
        this.f225631a = d;
        this.f225632b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Double.compare(this.f225631a, f0Var.f225631a) == 0 && Double.compare(this.f225632b, f0Var.f225632b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f225632b) + (Double.hashCode(this.f225631a) * 31);
    }
}
