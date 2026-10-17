package vlk;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f290481a;

    public b(int i) {
        this.f290481a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f290481a == ((b) obj2).f290481a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f290481a);
    }
}
