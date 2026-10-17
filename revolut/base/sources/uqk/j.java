package uqk;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f282217a;

    public j(long j2) {
        this.f282217a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f282217a == ((j) obj2).f282217a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f282217a);
    }
}
