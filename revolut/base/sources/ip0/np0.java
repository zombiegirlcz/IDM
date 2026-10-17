package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class np0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165558b;

    public np0(boolean z, boolean z3) {
        this.f165557a = z;
        this.f165558b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f165558b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof np0)) {
            return false;
        }
        np0 np0Var = (np0) obj2;
        return this.f165557a == np0Var.f165557a && this.f165558b == np0Var.f165558b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165558b) + (Boolean.hashCode(this.f165557a) * 31);
    }
}
