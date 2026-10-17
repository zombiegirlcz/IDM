package yfe;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f313306a;

    public t0(int i) {
        this.f313306a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("number must be positive");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && this.f313306a == ((t0) obj2).f313306a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f313306a);
    }
}
