package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166491a;

    public ta(boolean z) {
        this.f166491a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ta) && this.f166491a == ((ta) obj2).f166491a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166491a);
    }
}
