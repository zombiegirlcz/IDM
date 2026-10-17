package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227442b;

    public u1(boolean z, boolean z3) {
        this.f227441a = z;
        this.f227442b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return this.f227441a == u1Var.f227441a && this.f227442b == u1Var.f227442b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227442b) + (Boolean.hashCode(this.f227441a) * 31);
    }
}
