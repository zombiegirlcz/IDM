package u9j;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f278499a;

    public l(long j2) {
        this.f278499a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f278499a == ((l) obj2).f278499a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f278499a);
    }
}
