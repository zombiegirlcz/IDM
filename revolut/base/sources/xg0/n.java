package xg0;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f305472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f305473b;

    public n(long j2, long j3) {
        this.f305472a = j2;
        this.f305473b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f305472a == nVar.f305472a && this.f305473b == nVar.f305473b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f305473b) + (Long.hashCode(this.f305472a) * 31);
    }
}
