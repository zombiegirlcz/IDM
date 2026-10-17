package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class u30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166586b;

    public u30(boolean z, boolean z3) {
        this.f166585a = z;
        this.f166586b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u30)) {
            return false;
        }
        u30 u30Var = (u30) obj2;
        return this.f166585a == u30Var.f166585a && this.f166586b == u30Var.f166586b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166586b) + (Boolean.hashCode(this.f166585a) * 31);
    }
}
