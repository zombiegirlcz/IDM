package le;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f194228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f194229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f194230c;
    public final int d;
    public final long e;
    public final long f;

    public c1(Double d, int i, boolean z, int i2, long j2, long j3) {
        this.f194228a = d;
        this.f194229b = i;
        this.f194230c = z;
        this.d = i2;
        this.e = j2;
        this.f = j3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof f2) {
            f2 f2Var = (f2) obj2;
            Double d = this.f194228a;
            if (d != null ? d.equals(((c1) f2Var).f194228a) : ((c1) f2Var).f194228a == null) {
                c1 c1Var = (c1) f2Var;
                if (this.f194229b == c1Var.f194229b && this.f194230c == c1Var.f194230c && this.d == c1Var.d && this.e == c1Var.e && this.f == c1Var.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f194228a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f194229b) * 1000003) ^ (this.f194230c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        long j3 = this.f;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Device{batteryLevel=");
        sb6.append(this.f194228a);
        sb6.append(", batteryVelocity=");
        sb6.append(this.f194229b);
        sb6.append(", proximityOn=");
        sb6.append(this.f194230c);
        sb6.append(", orientation=");
        sb6.append(this.d);
        sb6.append(", ramUsed=");
        sb6.append(this.e);
        sb6.append(", diskUsed=");
        return a0.d.j(this.f, "}", sb6);
    }
}
