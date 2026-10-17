package b7a;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12978a;

    public f(long j2) {
        this.f12978a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f12978a == ((f) obj2).f12978a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12978a);
    }
}
