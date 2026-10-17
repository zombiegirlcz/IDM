package u9;

import com.fasterxml.jackson.databind.JavaType;
import d9.y;
import d9.z;
import p9.j0;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends t9.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f278259s;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, x9.p pVar, x9.a aVar, JavaType javaType) {
        y yVar;
        Object obj2;
        z zVar = pVar.e;
        j0 j0Var = pVar.f303518b;
        boolean z = false;
        if (zVar != null && (yVar = zVar.f112322a) != y.ALWAYS && yVar != y.USE_DEFAULTS) {
            z = true;
        }
        boolean z3 = z;
        if (zVar == null) {
            obj2 = Boolean.FALSE;
        } else {
            y yVar2 = zVar.f112322a;
            obj2 = (yVar2 == y.ALWAYS || yVar2 == y.NON_NULL || yVar2 == y.USE_DEFAULTS) ? null : t9.c.f268912r;
        }
        super(pVar, j0Var, aVar, javaType, null, null, null, z3, obj2, null);
        this.f278259s = str;
    }

    @Override // t9.c
    public final void k(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Object objR = vVar.r(this.f278259s);
        if (objR == null) {
            k9.k kVar = this.k;
            if (kVar != null) {
                kVar.f(null, hVar, vVar);
                return;
            } else {
                hVar.p();
                return;
            }
        }
        k9.k kVarA = this.f268917j;
        if (kVarA == null) {
            Class<?> cls = objR.getClass();
            oi0.d dVar = this.f268919m;
            k9.k kVarH = dVar.H(cls);
            kVarA = kVarH == null ? a(dVar, cls, vVar) : kVarH;
        }
        Object obj3 = this.o;
        if (obj3 != null) {
            if (t9.c.f268912r == obj3) {
                if (kVarA.d(vVar, objR)) {
                    m(hVar, vVar);
                    return;
                }
            } else if (obj3.equals(objR)) {
                m(hVar, vVar);
                return;
            }
        }
        if (objR == obj2 && e(hVar, vVar, kVarA)) {
            return;
        }
        r9.c cVar = this.f268918l;
        if (cVar == null) {
            kVarA.f(objR, hVar, vVar);
        } else {
            kVarA.h(objR, hVar, vVar, cVar);
        }
    }

    @Override // t9.c
    public final void l(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Object objR = vVar.r(this.f278259s);
        f9.i iVar = this.f268913b;
        if (objR == null) {
            if (this.k != null) {
                hVar.n(iVar);
                this.k.f(null, hVar, vVar);
                return;
            }
            return;
        }
        k9.k kVarA = this.f268917j;
        if (kVarA == null) {
            Class<?> cls = objR.getClass();
            oi0.d dVar = this.f268919m;
            k9.k kVarH = dVar.H(cls);
            kVarA = kVarH == null ? a(dVar, cls, vVar) : kVarH;
        }
        Object obj3 = this.o;
        if (obj3 != null) {
            if (t9.c.f268912r == obj3) {
                if (kVarA.d(vVar, objR)) {
                    return;
                }
            } else if (obj3.equals(objR)) {
                return;
            }
        }
        if (objR == obj2 && e(hVar, vVar, kVarA)) {
            return;
        }
        hVar.n(iVar);
        r9.c cVar = this.f268918l;
        if (cVar == null) {
            kVarA.f(objR, hVar, vVar);
        } else {
            kVarA.h(objR, hVar, vVar, cVar);
        }
    }
}
