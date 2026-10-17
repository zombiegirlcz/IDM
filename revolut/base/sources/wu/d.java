package wu;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f300043a;

    public d(long j2) {
        this.f300043a = j2;
    }

    public final long a() {
        return this.f300043a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f300043a == ((d) obj2).f300043a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f300043a);
    }
}
