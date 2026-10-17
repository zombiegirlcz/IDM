package dcb;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112853a;

    public c(long j2) {
        this.f112853a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f112853a == ((c) obj2).f112853a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f112853a);
    }
}
