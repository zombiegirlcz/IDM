package p9;

/* JADX INFO: loaded from: classes16.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f234209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f234210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.r f234211c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public e0(Object obj2, e0 e0Var, k9.r rVar, boolean z, boolean z3, boolean z4) {
        this.f234209a = obj2;
        this.f234210b = e0Var;
        k9.r rVar2 = (rVar == null || rVar.isEmpty()) ? null : rVar;
        this.f234211c = rVar2;
        if (z) {
            if (rVar2 == null) {
                throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
            }
            if (rVar.f182194a.isEmpty()) {
                z = false;
            }
        }
        this.d = z;
        this.e = z3;
        this.f = z4;
    }

    public final e0 a(e0 e0Var) {
        e0 e0Var2 = this.f234210b;
        return e0Var2 == null ? c(e0Var) : c(e0Var2.a(e0Var));
    }

    public final e0 b() {
        e0 e0Var = this.f234210b;
        if (e0Var == null) {
            return this;
        }
        e0 e0VarB = e0Var.b();
        if (this.f234211c != null) {
            return e0VarB.f234211c == null ? c(null) : c(e0VarB);
        }
        if (e0VarB.f234211c != null) {
            return e0VarB;
        }
        boolean z = e0VarB.e;
        boolean z3 = this.e;
        return z3 == z ? c(e0VarB) : z3 ? c(null) : e0VarB;
    }

    public final e0 c(e0 e0Var) {
        if (e0Var == this.f234210b) {
            return this;
        }
        return new e0(this.f234209a, e0Var, this.f234211c, this.d, this.e, this.f);
    }

    public final e0 d() {
        e0 e0VarD;
        boolean z = this.f;
        e0 e0Var = this.f234210b;
        if (!z) {
            return (e0Var == null || (e0VarD = e0Var.d()) == e0Var) ? this : c(e0VarD);
        }
        if (e0Var == null) {
            return null;
        }
        return e0Var.d();
    }

    public final e0 e() {
        if (this.f234210b == null) {
            return this;
        }
        return new e0(this.f234209a, null, this.f234211c, this.d, this.e, this.f);
    }

    public final e0 f() {
        e0 e0Var = this.f234210b;
        e0 e0VarF = e0Var == null ? null : e0Var.f();
        return this.e ? c(e0VarF) : e0VarF;
    }

    public final String toString() {
        String str = this.f234209a.toString() + "[visible=" + this.e + ",ignore=" + this.f + ",explicitName=" + this.d + "]";
        e0 e0Var = this.f234210b;
        if (e0Var == null) {
            return str;
        }
        StringBuilder sbL = v0.a.l(str, ", ");
        sbL.append(e0Var.toString());
        return sbL.toString();
    }
}
