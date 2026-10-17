package h2c;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148777a;

    public k(int i) {
        this.f148777a = i;
    }

    @Override // h2c.l
    public final int a() {
        return this.f148777a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f148777a == ((k) obj2).f148777a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f148777a);
    }
}
