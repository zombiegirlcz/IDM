package kg2;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f183908a;

    public f(long j2) {
        this.f183908a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f183908a == ((f) obj2).f183908a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f183908a);
    }
}
