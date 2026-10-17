package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164444a;

    public gm(boolean z) {
        this.f164444a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof gm) && this.f164444a == ((gm) obj2).f164444a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164444a);
    }
}
