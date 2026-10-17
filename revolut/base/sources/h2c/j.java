package h2c;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148776a;

    public j(int i) {
        this.f148776a = i;
    }

    @Override // h2c.l
    public final int a() {
        return this.f148776a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f148776a == ((j) obj2).f148776a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f148776a);
    }
}
