package df;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f113720c;

    public a(String str, long j2, long j3) {
        this.f113718a = str;
        this.f113719b = j2;
        this.f113720c = j3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof a) {
            a aVar = (a) obj2;
            if (this.f113718a.equals(aVar.f113718a) && this.f113719b == aVar.f113719b && this.f113720c == aVar.f113720c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f113718a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.f113719b;
        long j3 = this.f113720c;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("InstallationTokenResult{token=");
        sb6.append(this.f113718a);
        sb6.append(", tokenExpirationTimestamp=");
        sb6.append(this.f113719b);
        sb6.append(", tokenCreationTimestamp=");
        return a0.d.j(this.f113720c, "}", sb6);
    }
}
