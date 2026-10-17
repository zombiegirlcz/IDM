package u9j;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f278497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f278498b;

    public k(long j2, long j3) {
        this.f278497a = j2;
        this.f278498b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f278497a == kVar.f278497a && this.f278498b == kVar.f278498b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f278498b) + (Long.hashCode(this.f278497a) * 31);
    }
}
