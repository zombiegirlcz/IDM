package pzc;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f240939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f240940b;

    public b(long j2, long j3) {
        this.f240939a = j2;
        this.f240940b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f240939a == bVar.f240939a && this.f240940b == bVar.f240940b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f240940b) + (Long.hashCode(this.f240939a) * 31);
    }
}
