package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class sv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166389a;

    public sv(boolean z) {
        this.f166389a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof sv) && this.f166389a == ((sv) obj2).f166389a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166389a);
    }
}
