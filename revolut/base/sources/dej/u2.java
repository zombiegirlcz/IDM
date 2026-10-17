package dej;

/* JADX INFO: loaded from: classes11.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2 f113669a;

    public u2(v2 v2Var) {
        this.f113669a = v2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u2) && this.f113669a == ((u2) obj2).f113669a;
    }

    public final int hashCode() {
        v2 v2Var = this.f113669a;
        if (v2Var == null) {
            return 0;
        }
        return v2Var.hashCode();
    }
}
