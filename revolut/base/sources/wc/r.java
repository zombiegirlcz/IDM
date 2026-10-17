package wc;

/* JADX INFO: loaded from: classes16.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f296305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f296306b;

    public r(int i, long j2) {
        this.f296305a = i;
        this.f296306b = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f296305a == rVar.f296305a && this.f296306b == rVar.f296306b;
    }

    public final int hashCode() {
        int i = this.f296305a ^ 1000003;
        long j2 = this.f296306b;
        return (i * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f296305a + ", eventTimestamp=" + this.f296306b + "}";
    }
}
