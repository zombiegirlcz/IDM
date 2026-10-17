package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class v20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166759b;

    public v20(boolean z, boolean z3) {
        this.f166758a = z;
        this.f166759b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj2;
        return this.f166758a == v20Var.f166758a && this.f166759b == v20Var.f166759b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166759b) + (Boolean.hashCode(this.f166758a) * 31);
    }
}
