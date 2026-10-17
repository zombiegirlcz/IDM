package le;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f194328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f194329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f194330c;

    public l1(m1 m1Var, o1 o1Var, n1 n1Var) {
        this.f194328a = m1Var;
        this.f194329b = o1Var;
        this.f194330c = n1Var;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return this.f194328a.equals(l1Var.f194328a) && this.f194329b.equals(l1Var.f194329b) && this.f194330c.equals(l1Var.f194330c);
    }

    public final int hashCode() {
        return ((((this.f194328a.hashCode() ^ 1000003) * 1000003) ^ this.f194329b.hashCode()) * 1000003) ^ this.f194330c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f194328a + ", osData=" + this.f194329b + ", deviceData=" + this.f194330c + "}";
    }
}
