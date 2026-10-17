package ft0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f137753a;

    public d(boolean z) {
        this.f137753a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f137753a == ((d) obj2).f137753a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137753a);
    }
}
