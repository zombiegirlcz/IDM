package zbj;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f320894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f320895b;

    public a0(u0 u0Var, wk5.a aVar) {
        this.f320894a = u0Var;
        this.f320895b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f320894a == a0Var.f320894a && this.f320895b == a0Var.f320895b;
    }

    public final int hashCode() {
        u0 u0Var = this.f320894a;
        int iHashCode = (u0Var == null ? 0 : u0Var.hashCode()) * 31;
        wk5.a aVar = this.f320895b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
