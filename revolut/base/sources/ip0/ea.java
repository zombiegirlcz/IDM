package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ea implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164043b;

    public ea(boolean z, boolean z3) {
        this.f164042a = z;
        this.f164043b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164043b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj2;
        return this.f164042a == eaVar.f164042a && this.f164043b == eaVar.f164043b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164043b) + (Boolean.hashCode(this.f164042a) * 31);
    }
}
