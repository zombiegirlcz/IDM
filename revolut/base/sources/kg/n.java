package kg;

/* JADX INFO: loaded from: classes.dex */
public class n extends mg.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f183863a = null;

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        l0 l0Var = this.f183863a;
        if (l0Var != null) {
            return l0Var.c(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) {
        l0 l0Var = this.f183863a;
        if (l0Var == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        l0Var.d(cVar, obj2);
    }

    @Override // mg.g0
    public final l0 e() {
        l0 l0Var = this.f183863a;
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
