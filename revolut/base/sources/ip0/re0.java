package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class re0 implements te0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f166168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166169b;

    public re0(int i, int i2) {
        this.f166168a = i;
        this.f166169b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof re0)) {
            return false;
        }
        re0 re0Var = (re0) obj2;
        return this.f166168a == re0Var.f166168a && this.f166169b == re0Var.f166169b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166169b) + (Integer.hashCode(this.f166168a) * 31);
    }
}
