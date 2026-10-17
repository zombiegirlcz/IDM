package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class sl0 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166366b;

    public sl0(boolean z, boolean z3) {
        this.f166365a = z;
        this.f166366b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f166365a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sl0)) {
            return false;
        }
        sl0 sl0Var = (sl0) obj2;
        return this.f166365a == sl0Var.f166365a && this.f166366b == sl0Var.f166366b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166366b) + (Boolean.hashCode(this.f166365a) * 31);
    }
}
