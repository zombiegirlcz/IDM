package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163738b;

    public ch0(boolean z, boolean z3) {
        this.f163737a = z;
        this.f163738b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ch0)) {
            return false;
        }
        ch0 ch0Var = (ch0) obj2;
        return this.f163737a == ch0Var.f163737a && this.f163738b == ch0Var.f163738b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163738b) + (Boolean.hashCode(this.f163737a) * 31);
    }
}
