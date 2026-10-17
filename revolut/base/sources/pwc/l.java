package pwc;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f240410a;

    public l(boolean z) {
        this.f240410a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f240410a == ((l) obj2).f240410a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f240410a);
    }
}
