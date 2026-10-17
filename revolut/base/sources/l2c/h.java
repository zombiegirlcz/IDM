package l2c;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191745a;

    public h(int i) {
        this.f191745a = i;
    }

    @Override // l2c.j
    public final int a() {
        return this.f191745a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f191745a == ((h) obj2).f191745a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f191745a);
    }
}
