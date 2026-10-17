package f2c;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131500a;

    public i(int i) {
        this.f131500a = i;
    }

    @Override // f2c.k
    public final int a() {
        return this.f131500a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f131500a == ((i) obj2).f131500a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131500a);
    }
}
