package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f166775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f166776b;

    public v6(int i, int i2) {
        this.f166775a = i;
        this.f166776b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj2;
        return this.f166775a == v6Var.f166775a && this.f166776b == v6Var.f166776b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f166776b) + (Integer.hashCode(this.f166775a) * 31);
    }
}
