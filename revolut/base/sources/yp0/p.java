package yp0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f315751a;

    public p() {
        this(0);
    }

    @Override // yp0.q
    public final n a() {
        return n.FACTOR_60;
    }

    @Override // yp0.q
    public final int b() {
        return this.f315751a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f315751a == ((p) obj2).f315751a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f315751a);
    }

    public p(int i) {
        this.f315751a = i;
    }
}
