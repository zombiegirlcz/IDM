package l2c;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191746a;

    public i(int i) {
        this.f191746a = i;
    }

    @Override // l2c.j
    public final int a() {
        return this.f191746a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f191746a == ((i) obj2).f191746a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f191746a);
    }
}
