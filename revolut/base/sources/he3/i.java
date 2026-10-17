package he3;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f151561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151562b;

    public i(long j2, int i) {
        this.f151561a = j2;
        this.f151562b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f151561a == iVar.f151561a && this.f151562b == iVar.f151562b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151562b) + (Long.hashCode(this.f151561a) * 31);
    }
}
