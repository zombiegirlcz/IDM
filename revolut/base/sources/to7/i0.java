package to7;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements y7a.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f272535a;

    public i0(int i) {
        this.f272535a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && this.f272535a == ((i0) obj2).f272535a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272535a);
    }
}
