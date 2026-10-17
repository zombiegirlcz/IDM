package y4f;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f310909a;

    public l(boolean z) {
        this.f310909a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f310909a == ((l) obj2).f310909a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f310909a);
    }
}
