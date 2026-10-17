package v9;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class o0 extends k9.k implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f286927b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f286928a;

    public o0(JavaType javaType) {
        this.f286928a = javaType.f26182a;
    }

    public static k9.k l(k9.v vVar, k9.d dVar, k9.k kVar) {
        p9.f fVarB;
        Object objH;
        Object obj2 = f286927b;
        Map identityHashMap = (Map) vVar.r(obj2);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            m9.g gVar = (m9.g) vVar.d;
            m9.g gVar2 = m9.g.f203595c;
            gVar.getClass();
            Map map = Collections.EMPTY_MAP;
            HashMap map2 = gVar.f203597b;
            if (map2 == null) {
                HashMap map3 = new HashMap();
                map3.put(obj2, identityHashMap);
                gVar = new m9.g(map3);
            } else {
                map2.put(obj2, identityHashMap);
            }
            vVar.d = gVar;
        } else if (identityHashMap.get(dVar) != null) {
            return kVar;
        }
        identityHashMap.put(dVar, Boolean.TRUE);
        try {
            k9.p pVarE = vVar.f182201a.e();
            if ((dVar != null) && (fVarB = dVar.b()) != null && (objH = pVarE.H(fVarB)) != null) {
                dVar.b();
                vVar.f(objH);
                vVar.s();
                throw null;
            }
            return kVar != null ? vVar.v(kVar, dVar) : kVar;
        } finally {
            identityHashMap.remove(dVar);
        }
    }

    public static d9.p m(k9.v vVar, k9.d dVar, Class cls) {
        return dVar != null ? dVar.d(vVar.f182201a, cls) : vVar.f182201a.h(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(k9.v r1, java.lang.Exception r2, java.lang.Object r3, int r4) throws java.io.IOException {
        /*
        L0:
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            java.lang.annotation.Annotation[] r0 = x9.f.f303505a
            boolean r0 = r2 instanceof java.lang.Error
            if (r0 != 0) goto L47
            if (r1 == 0) goto L24
            k9.u r0 = k9.u.WRAP_EXCEPTIONS
            k9.t r1 = r1.f182201a
            boolean r1 = r1.n(r0)
            if (r1 == 0) goto L22
            goto L24
        L22:
            r1 = 0
            goto L25
        L24:
            r1 = 1
        L25:
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 == 0) goto L32
            if (r1 == 0) goto L2f
            boolean r1 = r2 instanceof com.fasterxml.jackson.core.JacksonException
            if (r1 != 0) goto L37
        L2f:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
        L32:
            if (r1 != 0) goto L37
            x9.f.u(r2)
        L37:
            int r1 = com.fasterxml.jackson.databind.JsonMappingException.d
            k9.g r1 = new k9.g
            r1.<init>()
            r1.f182182a = r3
            r1.f182184c = r4
            com.fasterxml.jackson.databind.JsonMappingException r1 = com.fasterxml.jackson.databind.JsonMappingException.d(r2, r1)
            throw r1
        L47:
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.o0.o(k9.v, java.lang.Exception, java.lang.Object, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(k9.v r1, java.lang.Exception r2, java.lang.Object r3, java.lang.String r4) throws java.io.IOException {
        /*
        L0:
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            java.lang.annotation.Annotation[] r0 = x9.f.f303505a
            boolean r0 = r2 instanceof java.lang.Error
            if (r0 != 0) goto L43
            if (r1 == 0) goto L24
            k9.u r0 = k9.u.WRAP_EXCEPTIONS
            k9.t r1 = r1.f182201a
            boolean r1 = r1.n(r0)
            if (r1 == 0) goto L22
            goto L24
        L22:
            r1 = 0
            goto L25
        L24:
            r1 = 1
        L25:
            boolean r0 = r2 instanceof java.io.IOException
            if (r0 == 0) goto L32
            if (r1 == 0) goto L2f
            boolean r1 = r2 instanceof com.fasterxml.jackson.core.JacksonException
            if (r1 != 0) goto L37
        L2f:
            java.io.IOException r2 = (java.io.IOException) r2
            throw r2
        L32:
            if (r1 != 0) goto L37
            x9.f.u(r2)
        L37:
            int r1 = com.fasterxml.jackson.databind.JsonMappingException.d
            k9.g r1 = new k9.g
            r1.<init>(r3, r4)
            com.fasterxml.jackson.databind.JsonMappingException r1 = com.fasterxml.jackson.databind.JsonMappingException.d(r2, r1)
            throw r1
        L43:
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.o0.p(k9.v, java.lang.Exception, java.lang.Object, java.lang.String):void");
    }

    @Override // k9.k
    public final Class c() {
        return this.f286928a;
    }

    public final void n(k9.v vVar, Object obj2) {
        vVar.f182201a.getClass();
        String strH = v0.a.h(obj2, "Cannot resolve PropertyFilter with id '", "'; no FilterProvider configured");
        Class cls = this.f286928a;
        if (cls != null) {
            vVar.s().b(null, cls, w9.f.d);
        }
        vVar.A(strH);
        throw null;
    }

    public o0(Class cls) {
        this.f286928a = cls;
    }

    public o0(Class cls, int i) {
        this.f286928a = cls;
    }

    public o0(o0 o0Var) {
        this.f286928a = o0Var.f286928a;
    }
}
