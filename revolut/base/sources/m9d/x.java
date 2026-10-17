package m9d;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f203750a;

    public x() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f203750a == ((x) obj2).f203750a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f203750a);
    }

    public x(int i) {
        this.f203750a = i;
    }
}
