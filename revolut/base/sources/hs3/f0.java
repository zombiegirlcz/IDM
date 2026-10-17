package hs3;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f154886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154887b;

    public f0(boolean z, boolean z3) {
        this.f154886a = z;
        this.f154887b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f154886a == f0Var.f154886a && this.f154887b == f0Var.f154887b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154887b) + (Boolean.hashCode(this.f154886a) * 31);
    }
}
