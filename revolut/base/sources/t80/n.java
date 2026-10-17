package t80;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f268772a;

    public n(long j2) {
        this.f268772a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f268772a == ((n) obj2).f268772a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f268772a);
    }
}
