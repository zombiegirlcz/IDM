package k9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import d9.a1;
import java.text.DateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p9.b0;
import sgm.e3;

/* JADX INFO: loaded from: classes16.dex */
public abstract class v {
    public static final u9.c k = new u9.c(Object.class);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u9.r f182200l = new u9.r(Object.class, 0, 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f182201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v13.d f182202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f182203c;
    public transient i2b.a d;
    public final u9.r e;
    public final v9.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u9.c f182204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u9.o f182205h;
    public DateFormat i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f182206j;

    public v() {
        this.e = f182200l;
        this.f = v9.q.d;
        this.f182204g = k;
        this.f182201a = null;
        this.f182202b = null;
        this.f182203c = new e3(2);
        this.f182205h = null;
        this.d = null;
        this.f182206j = true;
    }

    public final Object A(String str) {
        throw new InvalidDefinitionException(((t9.i) this).o, str);
    }

    public final void B(p9.r rVar, p9.t tVar, String str, Object... objArr) throws InvalidDefinitionException {
        String strP;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        String strJ = tVar.j();
        if (strJ != null) {
            if (strJ.length() > 500) {
                strJ = strJ.substring(0, 500) + "]...[" + strJ.substring(strJ.length() - 500);
            }
            strP = p.a.p("\"", strJ, "\"");
        } else {
            strP = "[N/A]";
        }
        StringBuilder sbM = v0.a.m("Invalid definition for property ", strP, " (of type ", x9.f.s(rVar.f234239a.f26182a), "): ");
        sbM.append(str);
        throw new InvalidDefinitionException(((t9.i) this).o, sbM.toString());
    }

    public final void C(p9.r rVar, String str, Object... objArr) throws InvalidDefinitionException {
        String strS = x9.f.s(rVar.f234239a.f26182a);
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new InvalidDefinitionException(((t9.i) this).o, a0.d.s("Invalid type definition for type ", strS, ": ", str));
    }

    public abstract k D(p9.p pVar, Object obj2);

    /* JADX WARN: Multi-variable type inference failed */
    public final k a(JavaType javaType) throws JsonMappingException {
        try {
            k kVarC = c(javaType);
            if (kVarC == 0) {
                return kVarC;
            }
            e3 e3Var = this.f182203c;
            synchronized (e3Var) {
                try {
                    if (((HashMap) e3Var.f262806b).put(new x9.s(javaType), kVarC) == null) {
                        ((AtomicReference) e3Var.f262807c).set(null);
                    }
                    if (kVarC instanceof t9.l) {
                        ((t9.l) kVarC).b(this);
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return kVarC;
        } catch (IllegalArgumentException e) {
            throw new JsonMappingException(((t9.i) this).o, x9.f.g(e), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k b(Class cls) throws InvalidDefinitionException {
        JavaType javaTypeD = this.f182201a.d(cls);
        try {
            k kVarC = c(javaTypeD);
            if (kVarC == 0) {
                return kVarC;
            }
            e3 e3Var = this.f182203c;
            synchronized (e3Var) {
                try {
                    Object objPut = ((HashMap) e3Var.f262806b).put(new x9.s(cls, false), kVarC);
                    Object objPut2 = ((HashMap) e3Var.f262806b).put(new x9.s(javaTypeD), kVarC);
                    if (objPut == null || objPut2 == null) {
                        ((AtomicReference) e3Var.f262807c).set(null);
                    }
                    if (kVarC instanceof t9.l) {
                        ((t9.l) kVarC).b(this);
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return kVarC;
        } catch (IllegalArgumentException e) {
            A(x9.f.g(e));
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0334 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0474 A[EDGE_INSN: B:708:0x0474->B:263:0x0474 BREAK  A[LOOP:0: B:258:0x0459->B:710:?], EDGE_INSN: B:262:0x0471->B:263:0x0474 BREAK  A[LOOP:0: B:258:0x0459->B:710:?]] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0486 A[PHI: r5 r30
      0x0486: PHI (r5v14 ??) = (r5v12 ??), (r5v12 ??), (r5v12 ??), (r5v50 ??) binds: [B:318:0x0564, B:320:0x0568, B:347:0x05be, B:264:0x0477] A[DONT_GENERATE, DONT_INLINE]
      0x0486: PHI (r30v6 boolean) = (r30v5 boolean), (r30v5 boolean), (r30v5 boolean), (r30v3 boolean) binds: [B:318:0x0564, B:320:0x0568, B:347:0x05be, B:264:0x0477] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0b45  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0182  */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v191 */
    /* JADX WARN: Type inference failed for: r0v194 */
    /* JADX WARN: Type inference failed for: r0v212, types: [k9.k] */
    /* JADX WARN: Type inference failed for: r0v243 */
    /* JADX WARN: Type inference failed for: r0v244 */
    /* JADX WARN: Type inference failed for: r0v245 */
    /* JADX WARN: Type inference failed for: r0v246 */
    /* JADX WARN: Type inference failed for: r0v247 */
    /* JADX WARN: Type inference failed for: r0v248 */
    /* JADX WARN: Type inference failed for: r0v28, types: [k9.k] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v64, types: [v9.q] */
    /* JADX WARN: Type inference failed for: r0v69, types: [v9.t] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71, types: [v9.f] */
    /* JADX WARN: Type inference failed for: r0v72, types: [v9.f] */
    /* JADX WARN: Type inference failed for: r0v73, types: [v9.e] */
    /* JADX WARN: Type inference failed for: r0v74, types: [v9.f] */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v87, types: [v9.i] */
    /* JADX WARN: Type inference failed for: r0v88, types: [v9.g] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93, types: [k9.k] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.io.Serializable, java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v12, types: [u9.h] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v50, types: [v9.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k c(com.fasterxml.jackson.databind.JavaType r40) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instruction units count: 3290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.v.c(com.fasterxml.jackson.databind.JavaType):k9.k");
    }

    public final DateFormat d() {
        DateFormat dateFormat = this.i;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.f182201a.f203599b.e.clone();
        this.i = dateFormat2;
        return dateFormat2;
    }

    public final JavaType e(JavaType javaType, Class cls) {
        return javaType.F0(cls) ? javaType : this.f182201a.f203599b.f203590a.h(javaType, cls, true);
    }

    public final void f(Object obj2) {
        if (!(obj2 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj2.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj2;
        if (cls == x9.g.class || x9.f.o(cls)) {
            return;
        }
        if (!x9.h.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(j6.a.o(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        t tVar = this.f182201a;
        tVar.i();
        if (x9.f.f(cls, tVar.b()) != null) {
            throw new ClassCastException();
        }
    }

    public final void h(com.fasterxml.jackson.core.h hVar) {
        if (this.f182206j) {
            hVar.p();
        } else {
            this.f.f(null, hVar, this);
        }
    }

    public final k i(JavaType javaType, d dVar) {
        k kVarA = this.f182205h.a(javaType);
        return (kVarA == null && (kVarA = this.f182203c.o(javaType)) == null && (kVarA = a(javaType)) == null) ? t(javaType.f26182a) : v(kVarA, dVar);
    }

    public final k k(Class cls, d dVar) {
        k kVarB = this.f182205h.b(cls);
        if (kVarB == null) {
            e3 e3Var = this.f182203c;
            k kVarP = e3Var.p(cls);
            if (kVarP == null) {
                kVarB = e3Var.o(this.f182201a.d(cls));
                if (kVarB == null && (kVarB = b(cls)) == null) {
                    return t(cls);
                }
            } else {
                kVarB = kVarP;
            }
        }
        return v(kVarB, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k l(JavaType javaType, d dVar) {
        k kVarC = this.f182202b.c(this, javaType);
        if (kVarC instanceof t9.l) {
            ((t9.l) kVarC).b(this);
        }
        return v(kVarC, dVar);
    }

    public abstract u9.v m(Object obj2, u9.i iVar);

    public final k n(JavaType javaType, d dVar) {
        k kVarA = this.f182205h.a(javaType);
        return (kVarA == null && (kVarA = this.f182203c.o(javaType)) == null && (kVarA = a(javaType)) == null) ? t(javaType.f26182a) : u(kVarA, dVar);
    }

    public final k o(Class cls, d dVar) {
        k kVarB = this.f182205h.b(cls);
        if (kVarB == null) {
            e3 e3Var = this.f182203c;
            k kVarP = e3Var.p(cls);
            if (kVarP == null) {
                kVarB = e3Var.o(this.f182201a.d(cls));
                if (kVarB == null && (kVarB = b(cls)) == null) {
                    return t(cls);
                }
            } else {
                kVarB = kVarP;
            }
        }
        return u(kVarB, dVar);
    }

    public final k p(JavaType javaType, d dVar) throws JsonMappingException {
        if (javaType == null) {
            throw new JsonMappingException(((t9.i) this).o, "Null passed for `valueType` of `findValueSerializer()`", null);
        }
        k kVarA = this.f182205h.a(javaType);
        return (kVarA == null && (kVarA = this.f182203c.o(javaType)) == null && (kVarA = a(javaType)) == null) ? t(javaType.f26182a) : v(kVarA, dVar);
    }

    public final k q(Class cls, d dVar) {
        k kVarB = this.f182205h.b(cls);
        if (kVarB == null) {
            e3 e3Var = this.f182203c;
            k kVarP = e3Var.p(cls);
            if (kVarP == null) {
                kVarB = e3Var.o(this.f182201a.d(cls));
                if (kVarB == null && (kVarB = b(cls)) == null) {
                    return t(cls);
                }
            } else {
                kVarB = kVarP;
            }
        }
        return v(kVarB, dVar);
    }

    public final Object r(Object obj2) {
        Object obj3;
        HashMap map = ((m9.g) this.d).f203597b;
        if (map == null || (obj3 = map.get(obj2)) == null) {
            return Collections.EMPTY_MAP.get(obj2);
        }
        if (obj3 == m9.g.d) {
            return null;
        }
        return obj3;
    }

    public final w9.f s() {
        return this.f182201a.f203599b.f203590a;
    }

    public final k t(Class cls) {
        return cls == Object.class ? this.e : new u9.r(cls, 0, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k u(k kVar, d dVar) {
        return (kVar == 0 || !(kVar instanceof t9.h)) ? kVar : ((t9.h) kVar).a(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k v(k kVar, d dVar) {
        return (kVar == 0 || !(kVar instanceof t9.h)) ? kVar : ((t9.h) kVar).a(this, dVar);
    }

    public abstract Object w(Class cls);

    public abstract boolean x(Object obj2);

    public final u9.i y(b0 b0Var) {
        Class cls = b0Var.f234192b;
        t tVar = this.f182201a;
        tVar.i();
        a1 a1Var = (a1) x9.f.f(cls, tVar.b());
        Class cls2 = b0Var.d;
        u9.i iVar = (u9.i) a1Var;
        return cls2 == iVar.f278274a ? iVar : new u9.i(cls2, iVar.f278275b);
    }

    public v(v vVar, t tVar, v13.d dVar) {
        this.e = f182200l;
        this.f = v9.q.d;
        u9.c cVar = k;
        this.f182204g = cVar;
        this.f182202b = dVar;
        this.f182201a = tVar;
        e3 e3Var = vVar.f182203c;
        this.f182203c = e3Var;
        this.e = vVar.e;
        v9.q qVar = vVar.f;
        this.f = qVar;
        this.f182204g = vVar.f182204g;
        this.f182206j = qVar == cVar;
        tVar.getClass();
        this.d = tVar.e;
        u9.o oVar = (u9.o) ((AtomicReference) e3Var.f262807c).get();
        if (oVar == null) {
            synchronized (e3Var) {
                oVar = (u9.o) ((AtomicReference) e3Var.f262807c).get();
                if (oVar == null) {
                    u9.o oVar2 = new u9.o((HashMap) e3Var.f262806b);
                    ((AtomicReference) e3Var.f262807c).set(oVar2);
                    oVar = oVar2;
                }
            }
        }
        this.f182205h = oVar;
    }
}
