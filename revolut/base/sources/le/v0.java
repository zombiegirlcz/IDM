package le;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f194403c;

    public v0(String str, String str2, long j2) {
        this.f194401a = str;
        this.f194402b = str2;
        this.f194403c = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof z1) {
            v0 v0Var = (v0) ((z1) obj2);
            if (this.f194401a.equals(v0Var.f194401a) && this.f194402b.equals(v0Var.f194402b) && this.f194403c == v0Var.f194403c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f194401a.hashCode() ^ 1000003) * 1000003) ^ this.f194402b.hashCode()) * 1000003;
        long j2 = this.f194403c;
        return iHashCode ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Signal{name=");
        sb6.append(this.f194401a);
        sb6.append(", code=");
        sb6.append(this.f194402b);
        sb6.append(", address=");
        return a0.d.j(this.f194403c, "}", sb6);
    }
}
