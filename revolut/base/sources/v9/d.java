package v9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import d9.a1;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class d extends o0 implements t9.h, t9.l {
    public static final t9.c[] k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JavaType f286911c;
    public final t9.c[] d;
    public final t9.c[] e;
    public final prl.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f286912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p9.f f286913h;
    public final av0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d9.o f286914j;

    static {
        new k9.r("#object-ref", null);
        k = new t9.c[0];
    }

    public d(JavaType javaType, t9.e eVar, t9.c[] cVarArr, t9.c[] cVarArr2) {
        super(javaType);
        this.f286911c = javaType;
        this.d = cVarArr;
        this.e = cVarArr2;
        this.f286913h = eVar.f268926g;
        this.f = eVar.e;
        this.f286912g = eVar.f;
        this.i = eVar.f268927h;
        this.f286914j = eVar.f268923a.b().f112315b;
    }

    public static final t9.c[] u(t9.c[] cVarArr, x9.n nVar) {
        if (cVarArr == null || cVarArr.length == 0 || nVar == null || nVar == x9.n.f303516a) {
            return cVarArr;
        }
        int length = cVarArr.length;
        t9.c[] cVarArr2 = new t9.c[length];
        for (int i = 0; i < length; i++) {
            t9.c cVar = cVarArr[i];
            if (cVar != null) {
                cVarArr2[i] = cVar.i(nVar);
            }
        }
        return cVarArr2;
    }

    public abstract d A(av0.b bVar);

    public abstract d B(t9.c[] cVarArr, t9.c[] cVarArr2);

    @Override // t9.h
    public final k9.k a(k9.v vVar, k9.d dVar) {
        d9.o oVar;
        Object obj2;
        d9.o oVar2;
        int i;
        d9.o oVar3;
        av0.b bVarD;
        int i2;
        Object objH;
        Set set;
        Set set2;
        d dVarY;
        t9.c[] cVarArr;
        Class cls;
        JavaType javaTypeB;
        Object obj3;
        p9.b0 b0VarT;
        d9.o oVar4;
        k9.t tVar = vVar.f182201a;
        k9.p pVarE = tVar.e();
        p9.f fVarB = dVar != null ? dVar.b() : null;
        Class cls2 = this.f286928a;
        d9.p pVarM = o0.m(vVar, dVar, cls2);
        d9.o oVar5 = this.f286914j;
        if (pVarM == null || (oVar = pVarM.f112315b) == (oVar4 = d9.o.ANY)) {
            oVar = null;
        } else if (oVar != oVar4 && oVar != oVar5) {
            JavaType javaType = this.f286911c;
            Class cls3 = javaType.f26182a;
            Annotation[] annotationArr = x9.f.f303505a;
            if (Enum.class.isAssignableFrom(cls3)) {
                int i3 = c.f286910a[oVar.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    ((p9.s) tVar.f203599b.f203591b).getClass();
                    if (p9.s.n(tVar, javaType) == null) {
                        p9.r.d(tVar, javaType, p9.s.o(tVar, javaType, tVar));
                    }
                    Class cls4 = javaType.f26182a;
                    return vVar.u(new k(k9.c.e(tVar, cls4), k.r(cls4, pVarM, true, null)), dVar);
                }
            } else if (oVar == d9.o.NATURAL && ((!javaType.K0() || !Map.class.isAssignableFrom(cls2)) && Map.Entry.class.isAssignableFrom(cls2))) {
                JavaType javaTypeT0 = javaType.t0(Map.Entry.class);
                JavaType javaTypeR0 = javaTypeT0.r0(0);
                if (javaTypeR0 == null) {
                    javaTypeR0 = w9.f.l();
                }
                JavaType javaType2 = javaTypeR0;
                JavaType javaTypeR02 = javaTypeT0.r0(1);
                if (javaTypeR02 == null) {
                    javaTypeR02 = w9.f.l();
                }
                return vVar.u(new u9.h(this.f286911c, javaType2, javaTypeR02, false, null, dVar), dVar);
            }
        }
        t9.c[] cVarArr2 = this.d;
        av0.b bVar = this.i;
        if (fVarB != null) {
            d9.v vVarY = pVarE.y(fVarB);
            set = vVarY.f112321c ? Collections.EMPTY_SET : vVarY.f112319a;
            set2 = pVarE.C(fVarB).f112304a;
            p9.b0 b0VarS = pVarE.s(fVarB);
            if (b0VarS == null) {
                if (bVar == null || (b0VarT = pVarE.t(fVarB, null)) == null) {
                    obj2 = null;
                    bVarD = bVar;
                } else {
                    boolean z = b0VarT.e;
                    bVarD = z == bVar.f9866a ? bVar : new av0.b((JavaType) bVar.f9867b, (com.fasterxml.jackson.core.q) bVar.f9868c, (u9.i) bVar.d, (k9.k) bVar.e, z);
                    obj2 = null;
                }
                oVar2 = oVar5;
                i2 = 0;
                i = 0;
                oVar3 = oVar;
            } else {
                p9.b0 b0VarT2 = pVarE.t(fVarB, b0VarS);
                Class cls5 = b0VarT2.f234192b;
                i = 0;
                boolean z3 = b0VarT2.e;
                k9.r rVar = b0VarT2.f234191a;
                if (cls5 == null) {
                    cls = cls2;
                    oVar2 = oVar5;
                    oVar3 = oVar;
                    javaTypeB = null;
                } else {
                    cls = cls2;
                    oVar2 = oVar5;
                    oVar3 = oVar;
                    javaTypeB = vVar.s().b(null, cls5, w9.f.d);
                }
                vVar.s().getClass();
                JavaType javaType3 = w9.f.i(javaTypeB, a1.class)[0];
                if (cls5 == u9.i.class) {
                    String str = rVar.f182194a;
                    int length = cVarArr2.length;
                    i2 = 0;
                    while (i2 != length) {
                        t9.c cVar = cVarArr2[i2];
                        if (str.equals(cVar.f268913b.f132807a)) {
                            bVarD = av0.b.d(cVar.d, null, new u9.i(b0VarT2.d, cVar), z3);
                            obj2 = null;
                        } else {
                            i2++;
                        }
                    }
                    vVar.A("Invalid Object Id definition for " + x9.f.s(cls) + ": cannot find property with name " + (str == null ? "[null]" : x9.f.c(str)));
                    throw null;
                }
                obj2 = null;
                bVarD = av0.b.d(javaType3, rVar, vVar.y(b0VarT2), z3);
                i2 = 0;
            }
            objH = pVarE.h(fVarB);
            if (objH == null || ((obj3 = this.f286912g) != null && objH.equals(obj3))) {
                objH = obj2;
            }
        } else {
            obj2 = null;
            oVar2 = oVar5;
            i = 0;
            oVar3 = oVar;
            bVarD = bVar;
            i2 = 0;
            objH = null;
            set = null;
            set2 = null;
        }
        if (i2 > 0) {
            t9.c[] cVarArr3 = (t9.c[]) Arrays.copyOf(cVarArr2, cVarArr2.length);
            t9.c cVar2 = cVarArr3[i2];
            int i5 = i;
            System.arraycopy(cVarArr3, i5, cVarArr3, 1, i2);
            cVarArr3[i5] = cVar2;
            t9.c[] cVarArr4 = this.e;
            if (cVarArr4 == null) {
                cVarArr = obj2;
            } else {
                t9.c[] cVarArr5 = (t9.c[]) Arrays.copyOf(cVarArr4, cVarArr4.length);
                t9.c cVar3 = cVarArr5[i2];
                System.arraycopy(cVarArr5, i5, cVarArr5, 1, i2);
                cVarArr5[i5] = cVar3;
                cVarArr = cVarArr5;
            }
            dVarY = B(cVarArr3, cVarArr);
        } else {
            dVarY = this;
        }
        if (bVarD != null) {
            av0.b bVar2 = new av0.b((JavaType) bVarD.f9867b, (com.fasterxml.jackson.core.q) bVarD.f9868c, (u9.i) bVarD.d, vVar.p((JavaType) bVarD.f9867b, dVar), bVarD.f9866a);
            if (bVar2 != bVar) {
                dVarY = dVarY.A(bVar2);
            }
        }
        if ((set != null && !set.isEmpty()) || set2 != null) {
            dVarY = dVarY.x(set, set2);
        }
        if (objH != null) {
            dVarY = dVarY.y(objH);
        }
        return (oVar3 == null ? oVar2 : oVar3) == d9.o.ARRAY ? dVarY.t() : dVarY;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0067 A[PHI: r6
      0x0067: PHI (r6v5 com.fasterxml.jackson.databind.JavaType) = (r6v4 com.fasterxml.jackson.databind.JavaType), (r6v10 com.fasterxml.jackson.databind.JavaType) binds: [B:31:0x0048, B:33:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // t9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(k9.v r10) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r9 = this;
            r0 = 0
            t9.c[] r1 = r9.e
            if (r1 != 0) goto L7
            r2 = r0
            goto L8
        L7:
            int r2 = r1.length
        L8:
            t9.c[] r3 = r9.d
            int r4 = r3.length
        Lb:
            if (r0 >= r4) goto L96
            r5 = r3[r0]
            boolean r6 = r5.f268920n
            p9.f r7 = r5.f268915g
            if (r6 != 0) goto L2a
            k9.k r6 = r5.k
            if (r6 == 0) goto L1a
            goto L2a
        L1a:
            v9.q r6 = r10.f
            if (r6 == 0) goto L2a
            r5.f(r6)
            if (r0 >= r2) goto L2a
            r8 = r1[r0]
            if (r8 == 0) goto L2a
            r8.f(r6)
        L2a:
            k9.k r6 = r5.f268917j
            if (r6 == 0) goto L2f
            goto L92
        L2f:
            k9.t r6 = r10.f182201a
            k9.p r6 = r6.e()
            if (r7 == 0) goto L46
            java.lang.Object r6 = r6.J(r7)
            if (r6 != 0) goto L3e
            goto L46
        L3e:
            r10.f(r6)
            r10.s()
            r10 = 0
            throw r10
        L46:
            com.fasterxml.jackson.databind.JavaType r6 = r5.e
            if (r6 != 0) goto L67
            com.fasterxml.jackson.databind.JavaType r6 = r5.d
            java.lang.Class r7 = r6.f26182a
            int r7 = r7.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isFinal(r7)
            if (r7 != 0) goto L67
            boolean r7 = r6.H0()
            if (r7 != 0) goto L64
            int r7 = r6.s0()
            if (r7 <= 0) goto L92
        L64:
            r5.f = r6
            goto L92
        L67:
            k9.k r7 = r10.p(r6, r5)
            boolean r8 = r6.H0()
            if (r8 == 0) goto L85
            com.fasterxml.jackson.databind.JavaType r6 = r6.v0()
            java.lang.Object r6 = r6.d
            r9.c r6 = (r9.c) r6
            if (r6 == 0) goto L85
            boolean r8 = r7 instanceof t9.g
            if (r8 == 0) goto L85
            t9.g r7 = (t9.g) r7
            t9.g r7 = r7.q(r6)
        L85:
            if (r0 >= r2) goto L8f
            r6 = r1[r0]
            if (r6 == 0) goto L8f
            r6.h(r7)
            goto L92
        L8f:
            r5.h(r7)
        L92:
            int r0 = r0 + 1
            goto Lb
        L96:
            prl.e r0 = r9.f
            if (r0 == 0) goto Lb4
            java.lang.Object r1 = r0.d
            k9.k r1 = (k9.k) r1
            boolean r2 = r1 instanceof t9.h
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r0.f239325b
            k9.c r2 = (k9.c) r2
            k9.k r10 = r10.u(r1, r2)
            r0.d = r10
            boolean r1 = r10 instanceof v9.p
            if (r1 == 0) goto Lb4
            v9.p r10 = (v9.p) r10
            r0.e = r10
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.d.b(k9.v):void");
    }

    @Override // k9.k
    public void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        if (this.i != null) {
            q(obj2, hVar, vVar, cVar);
            return;
        }
        f9.d dVarS = s(cVar, obj2, com.fasterxml.jackson.core.n.START_OBJECT);
        cVar.e(hVar, dVarS);
        hVar.i(obj2);
        if (this.f286912g != null) {
            w(obj2, hVar, vVar);
            throw null;
        }
        v(obj2, hVar, vVar);
        cVar.f(hVar, dVarS);
    }

    @Override // k9.k
    public final boolean k() {
        return this.i != null;
    }

    public final void q(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        av0.b bVar = this.i;
        u9.i iVar = (u9.i) bVar.d;
        boolean z = bVar.f9866a;
        k9.k kVar = (k9.k) bVar.e;
        u9.v vVarM = vVar.m(obj2, iVar);
        if (vVarM.f278293b != null && (vVarM.f278294c || z)) {
            hVar.getClass();
            kVar.f(vVarM.f278293b, hVar, vVar);
            return;
        }
        Object objA = vVarM.a(obj2);
        if (z) {
            kVar.f(objA, hVar, vVar);
            return;
        }
        f9.d dVarS = s(cVar, obj2, com.fasterxml.jackson.core.n.START_OBJECT);
        cVar.e(hVar, dVarS);
        hVar.i(obj2);
        vVarM.f278294c = true;
        com.fasterxml.jackson.core.q qVar = (com.fasterxml.jackson.core.q) bVar.f9868c;
        if (qVar != null) {
            hVar.n(qVar);
            kVar.f(vVarM.f278293b, hVar, vVar);
        }
        if (this.f286912g != null) {
            w(obj2, hVar, vVar);
            throw null;
        }
        v(obj2, hVar, vVar);
        cVar.f(hVar, dVarS);
    }

    public final void r(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, boolean z) {
        av0.b bVar = this.i;
        u9.i iVar = (u9.i) bVar.d;
        boolean z3 = bVar.f9866a;
        k9.k kVar = (k9.k) bVar.e;
        u9.v vVarM = vVar.m(obj2, iVar);
        Object obj3 = vVarM.f278293b;
        if (obj3 != null && (vVarM.f278294c || z3)) {
            kVar.f(obj3, hVar, vVar);
            return;
        }
        Object objA = vVarM.a(obj2);
        if (z3) {
            kVar.f(objA, hVar, vVar);
            return;
        }
        if (z) {
            hVar.A(obj2);
        }
        vVarM.f278294c = true;
        com.fasterxml.jackson.core.q qVar = (com.fasterxml.jackson.core.q) bVar.f9868c;
        if (qVar != null) {
            hVar.n(qVar);
            kVar.f(vVarM.f278293b, hVar, vVar);
        }
        if (this.f286912g != null) {
            w(obj2, hVar, vVar);
            throw null;
        }
        v(obj2, hVar, vVar);
        if (z) {
            hVar.m();
        }
    }

    public final f9.d s(r9.c cVar, Object obj2, com.fasterxml.jackson.core.n nVar) {
        p9.f fVar = this.f286913h;
        if (fVar == null) {
            return cVar.d(obj2, nVar);
        }
        Object objQ = fVar.q(obj2);
        if (objQ == null) {
            objQ = "";
        }
        f9.d dVarD = cVar.d(obj2, nVar);
        dVarD.d = objQ;
        return dVarD;
    }

    public abstract d t();

    public final void v(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        if (this.e != null) {
            vVar.getClass();
        }
        t9.c[] cVarArr = this.d;
        int i = 0;
        try {
            int length = cVarArr.length;
            while (i < length) {
                t9.c cVar = cVarArr[i];
                if (cVar != null) {
                    cVar.l(obj2, hVar, vVar);
                }
                i++;
            }
            prl.e eVar = this.f;
            if (eVar != null) {
                eVar.m(obj2, hVar, vVar);
            }
        } catch (Exception e) {
            o0.p(vVar, e, obj2, i != cVarArr.length ? cVarArr[i].f268913b.f132807a : "[anySetter]");
            throw null;
        } catch (StackOverflowError e2) {
            JsonMappingException jsonMappingException = new JsonMappingException(hVar, "Infinite recursion (StackOverflowError)", e2);
            k9.g gVar = new k9.g(obj2, i != cVarArr.length ? cVarArr[i].f268913b.f132807a : "[anySetter]");
            if (jsonMappingException.f26185b == null) {
                jsonMappingException.f26185b = new LinkedList();
            }
            if (jsonMappingException.f26185b.size() >= 1000) {
                throw jsonMappingException;
            }
            jsonMappingException.f26185b.addFirst(gVar);
            throw jsonMappingException;
        }
    }

    public final void w(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        if (this.e != null) {
            vVar.getClass();
        }
        n(vVar, this.f286912g);
        throw null;
    }

    public abstract d x(Set set, Set set2);

    public abstract d y(Object obj2);

    public d(d dVar, t9.c[] cVarArr, t9.c[] cVarArr2) {
        super(dVar.f286928a);
        this.f286911c = dVar.f286911c;
        this.d = cVarArr;
        this.e = cVarArr2;
        this.f286913h = dVar.f286913h;
        this.f = dVar.f;
        this.i = dVar.i;
        this.f286912g = dVar.f286912g;
        this.f286914j = dVar.f286914j;
    }

    public d(d dVar, av0.b bVar, Object obj2) {
        super(dVar.f286928a);
        this.f286911c = dVar.f286911c;
        this.d = dVar.d;
        this.e = dVar.e;
        this.f286913h = dVar.f286913h;
        this.f = dVar.f;
        this.i = bVar;
        this.f286912g = obj2;
        this.f286914j = dVar.f286914j;
    }

    public d(d dVar, Set set, Set set2) {
        super(dVar.f286928a);
        this.f286911c = dVar.f286911c;
        t9.c[] cVarArr = dVar.d;
        t9.c[] cVarArr2 = dVar.e;
        int length = cVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = cVarArr2 == null ? null : new ArrayList(length);
        for (int i = 0; i < length; i++) {
            t9.c cVar = cVarArr[i];
            if (!x9.g.c(cVar.f268913b.f132807a, set, set2)) {
                arrayList.add(cVar);
                if (cVarArr2 != null) {
                    arrayList2.add(cVarArr2[i]);
                }
            }
        }
        this.d = (t9.c[]) arrayList.toArray(new t9.c[arrayList.size()]);
        this.e = arrayList2 != null ? (t9.c[]) arrayList2.toArray(new t9.c[arrayList2.size()]) : null;
        this.f286913h = dVar.f286913h;
        this.f = dVar.f;
        this.i = dVar.i;
        this.f286912g = dVar.f286912g;
        this.f286914j = dVar.f286914j;
    }
}
