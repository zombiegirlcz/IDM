package f1c;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131249a;

    public p(int i) {
        this.f131249a = i;
    }

    @Override // f1c.q
    public final int a() {
        return this.f131249a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f131249a == ((p) obj2).f131249a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131249a);
    }
}
