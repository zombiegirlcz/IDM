package ke7;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f183020a;

    public l(long j2) {
        this.f183020a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f183020a == ((l) obj2).f183020a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f183020a);
    }
}
