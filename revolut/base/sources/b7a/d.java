package b7a;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12976a;

    public d(long j2) {
        this.f12976a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f12976a == ((d) obj2).f12976a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12976a);
    }
}
