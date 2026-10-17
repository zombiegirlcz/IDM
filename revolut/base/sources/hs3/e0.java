package hs3;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f154881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154882b;

    public e0(boolean z, boolean z3) {
        this.f154881a = z;
        this.f154882b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f154881a == e0Var.f154881a && this.f154882b == e0Var.f154882b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154882b) + (Boolean.hashCode(this.f154881a) * 31);
    }
}
