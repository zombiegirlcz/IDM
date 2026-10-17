package e54;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f122757a;

    public o(long j2) {
        this.f122757a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f122757a == ((o) obj2).f122757a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f122757a);
    }
}
