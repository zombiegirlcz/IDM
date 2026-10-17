package u9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes16.dex */
public final class t extends t9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x9.n f278290s;

    public t(t tVar, x9.l lVar, f9.i iVar) {
        super(tVar, iVar);
        this.f278290s = lVar;
    }

    @Override // t9.c
    public final k9.k a(oi0.d dVar, Class cls, k9.v vVar) {
        JavaType javaType = this.f;
        k9.k kVarP = javaType != null ? vVar.p(vVar.e(javaType, cls), this) : vVar.q(cls, this);
        boolean zE = kVarP.e();
        x9.n lVar = this.f278290s;
        if (zE && (kVarP instanceof u)) {
            lVar = new x9.l(lVar, ((u) kVarP).f278291l);
        }
        k9.k kVarI = kVarP.i(lVar);
        this.f268919m = this.f268919m.E(cls, kVarI);
        return kVarI;
    }

    @Override // t9.c
    public final void h(k9.k kVar) {
        if (kVar != null) {
            boolean zE = kVar.e();
            x9.n lVar = this.f278290s;
            if (zE && (kVar instanceof u)) {
                lVar = new x9.l(lVar, ((u) kVar).f278291l);
            }
            kVar = kVar.i(lVar);
        }
        super.h(kVar);
    }

    @Override // t9.c
    public final t9.c i(x9.n nVar) {
        return new t(this, new x9.l(nVar, this.f278290s), new f9.i(nVar.a(this.f268913b.f132807a)));
    }

    @Override // t9.c
    public final void l(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Method method = this.f268916h;
        Object objInvoke = method == null ? this.i.get(obj2) : method.invoke(obj2, null);
        if (objInvoke == null) {
            return;
        }
        k9.k kVarA = this.f268917j;
        if (kVarA == null) {
            Class<?> cls = objInvoke.getClass();
            oi0.d dVar = this.f268919m;
            k9.k kVarH = dVar.H(cls);
            kVarA = kVarH == null ? a(dVar, cls, vVar) : kVarH;
        }
        Object obj3 = this.o;
        if (obj3 != null) {
            if (t9.c.f268912r == obj3) {
                if (kVarA.d(vVar, objInvoke)) {
                    return;
                }
            } else if (obj3.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj2 && e(hVar, vVar, kVarA)) {
            return;
        }
        if (!kVarA.e()) {
            hVar.n(this.f268913b);
        }
        r9.c cVar = this.f268918l;
        if (cVar == null) {
            kVarA.f(objInvoke, hVar, vVar);
        } else {
            kVarA.h(objInvoke, hVar, vVar, cVar);
        }
    }

    public t(t9.c cVar, x9.n nVar) {
        super(cVar, cVar.f268913b);
        this.f278290s = nVar;
    }
}
