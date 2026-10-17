package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class b3 implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113918a;

    public b3(long j2) {
        this.f113918a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b3) && this.f113918a == ((b3) obj2).f113918a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f113918a);
    }
}
