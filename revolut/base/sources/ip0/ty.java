package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166567a;

    public ty(boolean z) {
        this.f166567a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ty) && this.f166567a == ((ty) obj2).f166567a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166567a);
    }
}
