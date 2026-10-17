package kg2;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f183906a;

    public d(long j2) {
        this.f183906a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f183906a == ((d) obj2).f183906a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f183906a);
    }
}
