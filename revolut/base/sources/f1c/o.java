package f1c;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131248a;

    public o(int i) {
        this.f131248a = i;
    }

    @Override // f1c.q
    public final int a() {
        return this.f131248a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f131248a == ((o) obj2).f131248a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131248a);
    }
}
