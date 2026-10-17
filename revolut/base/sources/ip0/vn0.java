package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class vn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166855a;

    public vn0(boolean z) {
        this.f166855a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vn0) && this.f166855a == ((vn0) obj2).f166855a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166855a);
    }
}
