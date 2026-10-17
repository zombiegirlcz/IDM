package zc;

/* JADX INFO: loaded from: classes16.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f320994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f320995b;

    public q(int i, long j2) {
        this.f320994a = i;
        this.f320995b = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f320994a == qVar.f320994a && this.f320995b == qVar.f320995b;
    }

    public final int hashCode() {
        long j2 = this.f320995b;
        return ((int) ((j2 >>> 32) ^ j2)) ^ ((this.f320994a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("EventRecord{eventType=");
        sb6.append(this.f320994a);
        sb6.append(", eventTimestamp=");
        return a0.d.j(this.f320995b, "}", sb6);
    }
}
