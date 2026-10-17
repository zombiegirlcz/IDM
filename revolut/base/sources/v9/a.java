package v9;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public abstract class a extends t9.g implements t9.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.d f286905c;
    public final Boolean d;

    public a(Class cls) {
        super(cls);
        this.f286905c = null;
        this.d = null;
    }

    public k9.k a(k9.v vVar, k9.d dVar) {
        d9.p pVarM;
        if (dVar != null && (pVarM = o0.m(vVar, dVar, this.f286928a)) != null) {
            Boolean boolB = pVarM.b(d9.m.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            if (!Objects.equals(boolB, this.d)) {
                return s(dVar, boolB);
            }
        }
        return this;
    }

    @Override // k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        f9.d dVarE = cVar.e(hVar, cVar.d(obj2, com.fasterxml.jackson.core.n.START_ARRAY));
        hVar.i(obj2);
        t(obj2, hVar, vVar);
        cVar.f(hVar, dVarE);
    }

    public final boolean r(k9.v vVar) {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return vVar.f182201a.n(k9.u.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    }

    public abstract k9.k s(k9.d dVar, Boolean bool);

    public abstract void t(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar);

    public a(a aVar, k9.d dVar, Boolean bool) {
        super(aVar.f286928a, 0);
        this.f286905c = dVar;
        this.d = bool;
    }
}
