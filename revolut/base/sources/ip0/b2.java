package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163518b;

    public b2(boolean z, boolean z3) {
        this.f163517a = z;
        this.f163518b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return this.f163517a == b2Var.f163517a && this.f163518b == b2Var.f163518b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163518b) + (Boolean.hashCode(this.f163517a) * 31);
    }
}
