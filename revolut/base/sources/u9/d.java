package u9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends t9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f278261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t9.c f278262t;
    public final Serializable u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t9.c cVar, Serializable serializable, int i) {
        super(cVar, cVar.f268913b);
        this.f278261s = i;
        this.f278262t = cVar;
        this.u = serializable;
    }

    @Override // t9.c
    public final void f(k9.k kVar) {
        switch (this.f278261s) {
            case 0:
                this.f278262t.f(kVar);
                break;
            default:
                this.f278262t.f(kVar);
                break;
        }
    }

    @Override // t9.c
    public final void h(k9.k kVar) {
        switch (this.f278261s) {
            case 0:
                this.f278262t.h(kVar);
                break;
            default:
                this.f278262t.h(kVar);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable, java.lang.Class[]] */
    @Override // t9.c
    public final t9.c i(x9.n nVar) {
        switch (this.f278261s) {
            case 0:
                return new d(this.f278262t.i(nVar), (Class[]) this.u, 0);
            default:
                return new d(this.f278262t.i(nVar), (Class) this.u, 1);
        }
    }

    @Override // t9.c
    public final void k(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        switch (this.f278261s) {
            case 0:
                vVar.getClass();
                this.f278262t.k(obj2, hVar, vVar);
                break;
            default:
                vVar.getClass();
                this.f278262t.k(obj2, hVar, vVar);
                break;
        }
    }

    @Override // t9.c
    public final void l(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        switch (this.f278261s) {
            case 0:
                vVar.getClass();
                this.f278262t.l(obj2, hVar, vVar);
                break;
            default:
                vVar.getClass();
                this.f278262t.l(obj2, hVar, vVar);
                break;
        }
    }
}
