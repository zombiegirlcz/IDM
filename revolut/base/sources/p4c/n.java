package p4c;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f232887a;

    public n(long j2) {
        this.f232887a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f232887a == ((n) obj2).f232887a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f232887a);
    }
}
