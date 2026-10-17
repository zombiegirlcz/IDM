package oid;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f225635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f225636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f225637c;
    public final double d;

    public g0(double d, double d5, double d6, double d10) {
        this.f225635a = d;
        this.f225636b = d5;
        this.f225637c = d6;
        this.d = d10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Double.compare(this.f225635a, g0Var.f225635a) == 0 && Double.compare(this.f225636b, g0Var.f225636b) == 0 && Double.compare(this.f225637c, g0Var.f225637c) == 0 && Double.compare(this.d, g0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + m72.b.c(m72.b.c(Double.hashCode(this.f225635a) * 31, this.f225636b, 31), this.f225637c, 31);
    }
}
