package t0l;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f267042a;

    public c(boolean z) {
        this.f267042a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f267042a == ((c) obj2).f267042a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267042a);
    }
}
