package xwb;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f309341a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof d) {
            return this.f309341a == ((d) obj2).f309341a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309341a);
    }

    public final String toString() {
        return "BalanceCheck(hasEnoughBalance=" + this.f309341a + ")";
    }
}
