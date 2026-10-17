package u9;

/* JADX INFO: loaded from: classes16.dex */
public final class r extends v9.q {
    @Override // v9.q, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        if (vVar.f182201a.n(k9.u.FAIL_ON_EMPTY_BEANS)) {
            q(vVar, obj2);
            throw null;
        }
        super.f(obj2, hVar, vVar);
    }

    @Override // v9.q, k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        if (vVar.f182201a.n(k9.u.FAIL_ON_EMPTY_BEANS)) {
            q(vVar, obj2);
            throw null;
        }
        super.h(obj2, hVar, vVar, cVar);
    }

    public final void q(k9.v vVar, Object obj2) {
        String strP = p.a.p("No serializer found for class ", obj2.getClass().getName(), " and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)");
        Class cls = this.f286928a;
        if (cls != null) {
            vVar.s().b(null, cls, w9.f.d);
        }
        vVar.A(strP);
        throw null;
    }
}
