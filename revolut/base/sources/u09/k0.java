package u09;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f276129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f276130b;

    public k0(int i, int i2) {
        this.f276129a = i;
        this.f276130b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f276129a == k0Var.f276129a && this.f276130b == k0Var.f276130b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f276130b) + (Integer.hashCode(this.f276129a) * 31);
    }
}
