package gc;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a f = new a(200, 10000, SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f142276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f142278c;
    public final long d;
    public final int e;

    public a(int i, int i2, long j2, long j3, int i3) {
        this.f142276a = j2;
        this.f142277b = i;
        this.f142278c = i2;
        this.d = j3;
        this.e = i3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            if (this.f142276a == aVar.f142276a && this.f142277b == aVar.f142277b && this.f142278c == aVar.f142278c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f142276a;
        int i = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f142277b) * 1000003) ^ this.f142278c) * 1000003;
        long j3 = this.d;
        return ((i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb6.append(this.f142276a);
        sb6.append(", loadBatchSize=");
        sb6.append(this.f142277b);
        sb6.append(", criticalSectionEnterTimeoutMs=");
        sb6.append(this.f142278c);
        sb6.append(", eventCleanUpAge=");
        sb6.append(this.d);
        sb6.append(", maxBlobByteSizePerRow=");
        return j6.a.v(sb6, "}", this.e);
    }
}
