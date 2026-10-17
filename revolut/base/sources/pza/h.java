package pza;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f240926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240927b;

    public h(long j2, boolean z) {
        this.f240926a = j2;
        this.f240927b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f240926a == hVar.f240926a && this.f240927b == hVar.f240927b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f240927b) + (Long.hashCode(this.f240926a) * 31);
    }
}
