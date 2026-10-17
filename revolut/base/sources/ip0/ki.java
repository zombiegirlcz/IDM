package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165022a;

    public ki(boolean z) {
        this.f165022a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ki) && this.f165022a == ((ki) obj2).f165022a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165022a);
    }
}
