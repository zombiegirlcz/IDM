package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165677a;

    public ol0(boolean z) {
        this.f165677a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ol0) && this.f165677a == ((ol0) obj2).f165677a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165677a);
    }
}
