package l2i;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191802a;

    public g(int i) {
        this.f191802a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f191802a == ((g) obj2).f191802a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f191802a);
    }
}
