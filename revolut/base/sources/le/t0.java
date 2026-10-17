package le;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f194390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f194391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194392c;
    public final String d;

    public t0(String str, String str2, long j2, long j3) {
        this.f194390a = j2;
        this.f194391b = j3;
        this.f194392c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        String str;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof x1) {
            t0 t0Var = (t0) ((x1) obj2);
            String str2 = t0Var.d;
            if (this.f194390a == t0Var.f194390a && this.f194391b == t0Var.f194391b && this.f194392c.equals(t0Var.f194392c) && ((str = this.d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f194390a;
        long j3 = this.f194391b;
        int iHashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f194392c.hashCode()) * 1000003;
        String str = this.d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("BinaryImage{baseAddress=");
        sb6.append(this.f194390a);
        sb6.append(", size=");
        sb6.append(this.f194391b);
        sb6.append(", name=");
        sb6.append(this.f194392c);
        sb6.append(", uuid=");
        return v0.a.i(sb6, this.d, "}");
    }
}
