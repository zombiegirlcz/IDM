package on6;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f226913a;

    public a(long j2) {
        this.f226913a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f226913a == ((a) obj2).f226913a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f226913a) + (Long.hashCode(5000L) * 31);
    }
}
