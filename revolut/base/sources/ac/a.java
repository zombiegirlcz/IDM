package ac;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3001b;

    public a(c cVar, long j2) {
        if (cVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f3000a = cVar;
        this.f3001b = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            if (this.f3000a.equals(aVar.f3000a) && this.f3001b == aVar.f3001b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f3000a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f3001b;
        return iHashCode ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("BackendResponse{status=");
        sb6.append(this.f3000a);
        sb6.append(", nextRequestWaitMillis=");
        return a0.d.j(this.f3001b, "}", sb6);
    }
}
