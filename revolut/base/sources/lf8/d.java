package lf8;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f194667a;

    public d(long j2) {
        this.f194667a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f194667a == ((d) obj2).f194667a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f194667a);
    }
}
