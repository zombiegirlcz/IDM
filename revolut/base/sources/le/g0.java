package le;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194272b;

    public g0(String str, String str2) {
        this.f194271a = str;
        this.f194272b = str2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof r1) {
            g0 g0Var = (g0) ((r1) obj2);
            if (this.f194271a.equals(g0Var.f194271a) && this.f194272b.equals(g0Var.f194272b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f194271a.hashCode() ^ 1000003) * 1000003) ^ this.f194272b.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("CustomAttribute{key=");
        sb6.append(this.f194271a);
        sb6.append(", value=");
        return v0.a.i(sb6, this.f194272b, "}");
    }
}
