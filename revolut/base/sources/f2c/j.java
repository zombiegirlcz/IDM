package f2c;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131501a;

    public j(int i) {
        this.f131501a = i;
    }

    @Override // f2c.k
    public final int a() {
        return this.f131501a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f131501a == ((j) obj2).f131501a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131501a);
    }
}
