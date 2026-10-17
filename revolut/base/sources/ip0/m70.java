package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class m70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165332b;

    public m70(boolean z, boolean z3) {
        this.f165331a = z;
        this.f165332b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m70)) {
            return false;
        }
        m70 m70Var = (m70) obj2;
        return this.f165331a == m70Var.f165331a && this.f165332b == m70Var.f165332b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165332b) + (Boolean.hashCode(this.f165331a) * 31);
    }
}
