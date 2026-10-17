package v9;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class p extends t9.g implements t9.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final SimpleType f286929r = w9.f.l();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d9.y f286930s = d9.y.NON_EMPTY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.d f286931c;
    public final boolean d;
    public final JavaType e;
    public final JavaType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k9.k f286932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k9.k f286933h;
    public final r9.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public oi0.d f286934j;
    public final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f286935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f286936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f286937n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k9.c f286938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f286939q;

    public p(Set set, Set set2, JavaType javaType, JavaType javaType2, boolean z, r9.c cVar, k9.k kVar, k9.k kVar2) {
        super(Map.class, 0);
        k9.c cVar2 = null;
        set = (set == null || set.isEmpty()) ? null : set;
        this.k = set;
        this.f286935l = set2;
        this.e = javaType;
        this.f = javaType2;
        this.d = z;
        this.i = cVar;
        this.f286932g = kVar;
        this.f286933h = kVar2;
        this.f286934j = u9.k.f278279a;
        this.f286931c = null;
        this.f286936m = null;
        this.f286939q = false;
        this.f286937n = null;
        this.o = false;
        if (set2 != null || (set != null && !set.isEmpty())) {
            cVar2 = new k9.c(set, set2);
        }
        this.f286938p = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v9.p s(java.util.Set r11, java.util.Set r12, com.fasterxml.jackson.databind.JavaType r13, boolean r14, s9.l r15, k9.k r16, k9.k r17, java.lang.Object r18) {
        /*
            r0 = r18
            if (r13 != 0) goto L9
            com.fasterxml.jackson.databind.type.SimpleType r13 = v9.p.f286929r
            r5 = r13
            r6 = r5
            goto L21
        L9:
            com.fasterxml.jackson.databind.JavaType r1 = r13.z0()
            java.lang.Class<java.util.Properties> r2 = java.util.Properties.class
            boolean r2 = r13.F0(r2)
            if (r2 == 0) goto L1c
            com.fasterxml.jackson.databind.type.SimpleType r13 = w9.f.l()
        L19:
            r6 = r13
            r5 = r1
            goto L21
        L1c:
            com.fasterxml.jackson.databind.JavaType r13 = r13.v0()
            goto L19
        L21:
            r13 = 0
            if (r14 != 0) goto L37
            if (r6 == 0) goto L34
            java.lang.Class r14 = r6.f26182a
            int r14 = r14.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isFinal(r14)
            if (r14 == 0) goto L34
            r14 = 1
            goto L35
        L34:
            r14 = r13
        L35:
            r7 = r14
            goto L3e
        L37:
            java.lang.Class r1 = r6.f26182a
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto L35
            r7 = r13
        L3e:
            v9.p r2 = new v9.p
            r3 = r11
            r4 = r12
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L5a
            java.lang.String r11 = "withFilterId"
            java.lang.Class<v9.p> r12 = v9.p.class
            x9.f.v(r12, r2, r11)
            v9.p r11 = new v9.p
            r11.<init>(r2, r0, r13)
            return r11
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.p.s(java.util.Set, java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, s9.l, k9.k, k9.k, java.lang.Object):v9.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012c  */
    @Override // t9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k a(k9.v r18, k9.d r19) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.p.a(k9.v, k9.d):k9.k");
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        Map map = (Map) obj2;
        if (!map.isEmpty()) {
            boolean z = this.o;
            Object obj3 = this.f286937n;
            if (obj3 != null || z) {
                boolean z3 = f286930s == obj3;
                k9.k kVar = this.f286933h;
                if (kVar != null) {
                    for (Object obj4 : map.values()) {
                        if (obj4 == null) {
                            if (z) {
                            }
                        } else if (z3) {
                            if (!kVar.d(vVar, obj4)) {
                            }
                        } else if (obj3 == null || !obj3.equals(map)) {
                        }
                    }
                } else {
                    for (Object obj5 : map.values()) {
                        if (obj5 != null) {
                            try {
                                k9.k kVarR = r(vVar, obj5);
                                if (z3) {
                                    if (!kVarR.d(vVar, obj5)) {
                                    }
                                } else if (obj3 == null || !obj3.equals(map)) {
                                }
                            } catch (DatabindException unused) {
                            }
                        } else if (z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Map map = (Map) obj2;
        hVar.A(map);
        u(map, hVar, vVar);
        hVar.m();
    }

    @Override // k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        Map map = (Map) obj2;
        hVar.i(map);
        f9.d dVarE = cVar.e(hVar, cVar.d(map, com.fasterxml.jackson.core.n.START_OBJECT));
        u(map, hVar, vVar);
        cVar.f(hVar, dVarE);
    }

    @Override // t9.g
    public final t9.g q(r9.c cVar) {
        if (this.i == cVar) {
            return this;
        }
        x9.f.v(p.class, this, "_withValueTypeSerializer");
        return new p(this, cVar, this.f286937n, this.o);
    }

    public final k9.k r(k9.v vVar, Object obj2) {
        Class<?> cls = obj2.getClass();
        k9.k kVarH = this.f286934j.H(cls);
        if (kVarH != null) {
            return kVarH;
        }
        JavaType javaType = this.f;
        boolean zD0 = javaType.D0();
        k9.d dVar = this.f286931c;
        if (zD0) {
            oi0.d dVar2 = this.f286934j;
            tb4.t tVarG = dVar2.g(vVar.e(javaType, cls), vVar, dVar);
            oi0.d dVar3 = (oi0.d) tVarG.f269457c;
            if (dVar2 != dVar3) {
                this.f286934j = dVar3;
            }
            return (k9.k) tVarG.f269456b;
        }
        oi0.d dVar4 = this.f286934j;
        dVar4.getClass();
        k9.k kVarK = vVar.k(cls, dVar);
        oi0.d dVarE = dVar4.E(cls, kVarK);
        if (dVar4 != dVarE) {
            this.f286934j = dVarE;
        }
        return kVarK;
    }

    public final void t(Map map, com.fasterxml.jackson.core.h hVar, k9.v vVar, Object obj2) throws IOException {
        k9.k kVar;
        k9.k kVarR;
        boolean z = f286930s == obj2;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                kVar = vVar.f182204g;
            } else {
                k9.c cVar = this.f286938p;
                if (cVar == null || !cVar.f(key)) {
                    kVar = this.f286932g;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                kVarR = this.f286933h;
                if (kVarR == null) {
                    kVarR = r(vVar, value);
                }
                if (z) {
                    if (kVarR.d(vVar, value)) {
                        continue;
                    } else {
                        kVar.f(key, hVar, vVar);
                        kVarR.h(value, hVar, vVar, this.i);
                    }
                } else if (obj2 == null || !obj2.equals(value)) {
                    kVar.f(key, hVar, vVar);
                    kVarR.h(value, hVar, vVar, this.i);
                }
            } else if (this.o) {
                continue;
            } else {
                kVarR = vVar.f;
                kVar.f(key, hVar, vVar);
                try {
                    kVarR.h(value, hVar, vVar, this.i);
                } catch (Exception e) {
                    o0.p(vVar, e, map, String.valueOf(key));
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019d A[EXC_TOP_SPLITTER, PHI: r15
      0x019d: PHI (r15v1 k9.k) = (r15v0 k9.k), (r15v3 k9.k), (r15v3 k9.k), (r15v3 k9.k) binds: [B:122:0x0180, B:128:0x0191, B:130:0x0194, B:132:0x019a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r17v0, types: [v9.o0, v9.p] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.util.Map r18, com.fasterxml.jackson.core.h r19, k9.v r20) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.p.u(java.util.Map, com.fasterxml.jackson.core.h, k9.v):void");
    }

    public final p v(Object obj2, boolean z) {
        if (obj2 == this.f286937n && z == this.o) {
            return this;
        }
        x9.f.v(p.class, this, "withContentInclusion");
        return new p(this, this.i, obj2, z);
    }

    public p(p pVar, k9.d dVar, k9.k kVar, k9.k kVar2, Set set, Set set2) {
        super(Map.class, 0);
        k9.c cVar = null;
        set = (set == null || set.isEmpty()) ? null : set;
        this.k = set;
        this.f286935l = set2;
        this.e = pVar.e;
        this.f = pVar.f;
        this.d = pVar.d;
        this.i = pVar.i;
        this.f286932g = kVar;
        this.f286933h = kVar2;
        this.f286934j = u9.k.f278279a;
        this.f286931c = dVar;
        this.f286936m = pVar.f286936m;
        this.f286939q = pVar.f286939q;
        this.f286937n = pVar.f286937n;
        this.o = pVar.o;
        if (set2 != null || (set != null && !set.isEmpty())) {
            cVar = new k9.c(set, set2);
        }
        this.f286938p = cVar;
    }

    public p(p pVar, r9.c cVar, Object obj2, boolean z) {
        super(Map.class, 0);
        this.k = pVar.k;
        this.f286935l = pVar.f286935l;
        this.e = pVar.e;
        this.f = pVar.f;
        this.d = pVar.d;
        this.i = cVar;
        this.f286932g = pVar.f286932g;
        this.f286933h = pVar.f286933h;
        this.f286934j = pVar.f286934j;
        this.f286931c = pVar.f286931c;
        this.f286936m = pVar.f286936m;
        this.f286939q = pVar.f286939q;
        this.f286937n = obj2;
        this.o = z;
        this.f286938p = pVar.f286938p;
    }

    public p(p pVar, Object obj2, boolean z) {
        super(Map.class, 0);
        this.k = pVar.k;
        this.f286935l = pVar.f286935l;
        this.e = pVar.e;
        this.f = pVar.f;
        this.d = pVar.d;
        this.i = pVar.i;
        this.f286932g = pVar.f286932g;
        this.f286933h = pVar.f286933h;
        this.f286934j = u9.k.f278279a;
        this.f286931c = pVar.f286931c;
        this.f286936m = obj2;
        this.f286939q = z;
        this.f286937n = pVar.f286937n;
        this.o = pVar.o;
        this.f286938p = pVar.f286938p;
    }
}
