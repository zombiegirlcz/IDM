package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class be0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163587b;

    public be0(boolean z, boolean z3) {
        this.f163586a = z;
        this.f163587b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163587b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof be0)) {
            return false;
        }
        be0 be0Var = (be0) obj2;
        return this.f163586a == be0Var.f163586a && this.f163587b == be0Var.f163587b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163587b) + (Boolean.hashCode(this.f163586a) * 31);
    }
}
