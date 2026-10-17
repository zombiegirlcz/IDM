package le;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f194418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194420c;
    public final long d;
    public final int e;

    public y0(int i, long j2, long j3, String str, String str2) {
        this.f194418a = j2;
        this.f194419b = str;
        this.f194420c = str2;
        this.d = j3;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        String str;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a2) {
            y0 y0Var = (y0) ((a2) obj2);
            String str2 = y0Var.f194420c;
            if (this.f194418a == y0Var.f194418a && this.f194419b.equals(y0Var.f194419b) && ((str = this.f194420c) != null ? str.equals(str2) : str2 == null) && this.d == y0Var.d && this.e == y0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f194418a;
        int iHashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f194419b.hashCode()) * 1000003;
        String str = this.f194420c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.d;
        return ((iHashCode2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Frame{pc=");
        sb6.append(this.f194418a);
        sb6.append(", symbol=");
        sb6.append(this.f194419b);
        sb6.append(", file=");
        sb6.append(this.f194420c);
        sb6.append(", offset=");
        sb6.append(this.d);
        sb6.append(", importance=");
        return j6.a.v(sb6, "}", this.e);
    }
}
