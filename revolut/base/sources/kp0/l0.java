package kp0;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188035b;

    public l0(boolean z, boolean z3) {
        this.f188034a = z;
        this.f188035b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f188034a == l0Var.f188034a && this.f188035b == l0Var.f188035b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188035b) + (Boolean.hashCode(this.f188034a) * 31);
    }
}
