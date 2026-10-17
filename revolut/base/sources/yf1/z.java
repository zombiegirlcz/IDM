package yf1;

/* JADX INFO: loaded from: classes20.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f313148a;

    public z(int i) {
        this.f313148a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f313148a == ((z) obj2).f313148a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f313148a);
    }
}
