package u9;

/* JADX INFO: loaded from: classes16.dex */
public final class q extends k9.k implements t9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9.c f278287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9.k f278288b;

    public q(r9.c cVar, k9.k kVar) {
        this.f278287a = cVar;
        this.f278288b = kVar;
    }

    @Override // t9.h
    public final k9.k a(k9.v vVar, k9.d dVar) {
        k9.k kVar = this.f278288b;
        k9.k kVarV = kVar instanceof t9.h ? vVar.v(kVar, dVar) : kVar;
        return kVarV == kVar ? this : new q(this.f278287a, kVarV);
    }

    @Override // k9.k
    public final Class c() {
        return Object.class;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        this.f278288b.h(obj2, hVar, vVar, this.f278287a);
    }

    @Override // k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        this.f278288b.h(obj2, hVar, vVar, cVar);
    }
}
