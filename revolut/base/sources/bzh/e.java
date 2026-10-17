package bzh;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20032a;

    public e(long j2) {
        this.f20032a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f20032a == ((e) obj2).f20032a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20032a);
    }
}
