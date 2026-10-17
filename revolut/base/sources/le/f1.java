package le;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f194263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194265c;
    public final long d;

    public f1(g1 g1Var, String str, String str2, long j2) {
        this.f194263a = g1Var;
        this.f194264b = str;
        this.f194265c = str2;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof i2) {
            f1 f1Var = (f1) ((i2) obj2);
            if (this.f194263a.equals(f1Var.f194263a) && this.f194264b.equals(f1Var.f194264b) && this.f194265c.equals(f1Var.f194265c) && this.d == f1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f194263a.hashCode() ^ 1000003) * 1000003) ^ this.f194264b.hashCode()) * 1000003) ^ this.f194265c.hashCode()) * 1000003;
        long j2 = this.d;
        return iHashCode ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb6.append(this.f194263a);
        sb6.append(", parameterKey=");
        sb6.append(this.f194264b);
        sb6.append(", parameterValue=");
        sb6.append(this.f194265c);
        sb6.append(", templateVersion=");
        return a0.d.j(this.d, "}", sb6);
    }
}
