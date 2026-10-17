package pni;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f237813a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof i) {
            return this.f237813a == ((i) obj2).f237813a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f237813a);
    }

    public final String toString() {
        return p.a.n(this.f237813a, "Delayed(delay=", ")");
    }
}
