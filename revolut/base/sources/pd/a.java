package pd;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f235011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f235012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f235013c;

    public a(long j2, long j3, long j5) {
        this.f235011a = j2;
        this.f235012b = j3;
        this.f235013c = j5;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            if (this.f235011a == aVar.f235011a && this.f235012b == aVar.f235012b && this.f235013c == aVar.f235013c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f235011a;
        long j3 = this.f235012b;
        int i = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j5 = this.f235013c;
        return i ^ ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("StartupTime{epochMillis=");
        sb6.append(this.f235011a);
        sb6.append(", elapsedRealtime=");
        sb6.append(this.f235012b);
        sb6.append(", uptimeMillis=");
        return a0.d.j(this.f235013c, "}", sb6);
    }
}
