package p4c;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f232888a;

    public o(long j2) {
        this.f232888a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f232888a == ((o) obj2).f232888a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f232888a);
    }
}
