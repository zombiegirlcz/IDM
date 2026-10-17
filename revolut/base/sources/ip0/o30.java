package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class o30 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165619b;

    public o30(boolean z, boolean z3) {
        this.f165618a = z;
        this.f165619b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f165619b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o30)) {
            return false;
        }
        o30 o30Var = (o30) obj2;
        return this.f165618a == o30Var.f165618a && this.f165619b == o30Var.f165619b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165619b) + (Boolean.hashCode(this.f165618a) * 31);
    }
}
