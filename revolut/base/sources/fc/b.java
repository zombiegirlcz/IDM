package fc;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f133567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f133568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f133569c;

    public b(long j2, long j3, Set set) {
        this.f133567a = j2;
        this.f133568b = j3;
        this.f133569c = set;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof b) {
            b bVar = (b) obj2;
            if (this.f133567a == bVar.f133567a && this.f133568b == bVar.f133568b && this.f133569c.equals(bVar.f133569c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f133567a;
        int i = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f133568b;
        return ((i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f133569c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f133567a + ", maxAllowedDelay=" + this.f133568b + ", flags=" + this.f133569c + "}";
    }
}
