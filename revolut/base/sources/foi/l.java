package foi;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f137001a;

    public l(boolean z) {
        this.f137001a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f137001a == ((l) obj2).f137001a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137001a);
    }
}
