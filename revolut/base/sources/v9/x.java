package v9;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class x extends a {
    public final boolean e;
    public final JavaType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r9.c f286945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k9.k f286946h;
    public oi0.d i;

    public x(JavaType javaType, boolean z, r9.c cVar, k9.k kVar) {
        super(Object[].class);
        this.f = javaType;
        this.e = z;
        this.f286945g = cVar;
        this.i = u9.k.f278279a;
        this.f286946h = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // v9.a, t9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k a(k9.v r9, k9.d r10) {
        /*
            r8 = this;
            r9.c r0 = r8.f286945g
            if (r0 == 0) goto La
            r9.c r1 = r0.g(r10)
            r5 = r1
            goto Lb
        La:
            r5 = r0
        Lb:
            r1 = 0
            if (r10 == 0) goto L25
            p9.f r2 = r10.b()
            k9.t r3 = r9.f182201a
            k9.p r3 = r3.e()
            if (r2 == 0) goto L25
            java.lang.Object r3 = r3.c(r2)
            if (r3 == 0) goto L25
            k9.k r2 = r9.D(r2, r3)
            goto L26
        L25:
            r2 = r1
        L26:
            java.lang.Class r3 = r8.f286928a
            d9.p r3 = v9.o0.m(r9, r10, r3)
            if (r3 == 0) goto L34
            d9.m r1 = d9.m.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.b(r1)
        L34:
            r7 = r1
            k9.k r1 = r8.f286946h
            if (r2 != 0) goto L3a
            r2 = r1
        L3a:
            k9.k r2 = v9.o0.l(r9, r10, r2)
            if (r2 != 0) goto L52
            com.fasterxml.jackson.databind.JavaType r3 = r8.f
            if (r3 == 0) goto L52
            boolean r4 = r8.e
            if (r4 == 0) goto L52
            boolean r4 = r3.I0()
            if (r4 != 0) goto L52
            k9.k r2 = r9.i(r3, r10)
        L52:
            r6 = r2
            k9.d r9 = r8.f286905c
            if (r9 != r10) goto L64
            if (r6 != r1) goto L64
            if (r0 != r5) goto L64
            java.lang.Boolean r9 = r8.d
            boolean r9 = java.util.Objects.equals(r9, r7)
            if (r9 == 0) goto L64
            return r8
        L64:
            v9.x r2 = new v9.x
            r3 = r8
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.x.a(k9.v, k9.d):k9.k");
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        return ((Object[]) obj2).length == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // k9.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r4, com.fasterxml.jackson.core.h r5, k9.v r6) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r0 = r3.d
            if (r0 != 0) goto L14
            k9.u r1 = k9.u.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            k9.t r2 = r6.f182201a
            boolean r1 = r2.n(r1)
            if (r1 != 0) goto L18
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L1c
        L18:
            r3.t(r4, r5, r6)
            return
        L1c:
            r5.y(r4)
            r3.t(r4, r5, r6)
            r5.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.x.f(java.lang.Object, com.fasterxml.jackson.core.h, k9.v):void");
    }

    @Override // t9.g
    public final t9.g q(r9.c cVar) {
        return new x(this.f, this.e, cVar, this.f286946h);
    }

    @Override // v9.a
    public final k9.k s(k9.d dVar, Boolean bool) {
        return new x(this, dVar, this.f286945g, this.f286946h, bool);
    }

    @Override // v9.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void t(Object[] objArr, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        Object obj2;
        Object obj3;
        oi0.d dVarE;
        JavaType javaType = this.f;
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        r9.c cVar = this.f286945g;
        int i = 0;
        k9.k kVar = this.f286946h;
        if (kVar != null) {
            int length2 = objArr.length;
            Object obj4 = null;
            while (i < length2) {
                try {
                    obj4 = objArr[i];
                    if (obj4 == null) {
                        vVar.h(hVar);
                    } else if (cVar == null) {
                        kVar.f(obj4, hVar, vVar);
                    } else {
                        kVar.h(obj4, hVar, vVar, cVar);
                    }
                    i++;
                } catch (Exception e) {
                    o0.o(vVar, e, obj4, i);
                    throw null;
                }
            }
            return;
        }
        k9.d dVar = this.f286905c;
        if (cVar != null) {
            int length3 = objArr.length;
            try {
                oi0.d dVar2 = this.i;
                obj3 = null;
                while (i < length3) {
                    try {
                        obj3 = objArr[i];
                        if (obj3 == null) {
                            vVar.h(hVar);
                        } else {
                            Class<?> cls = obj3.getClass();
                            k9.k kVarH = dVar2.H(cls);
                            if (kVarH == null && dVar2 != (dVarE = dVar2.E(cls, (kVarH = vVar.k(cls, dVar))))) {
                                this.i = dVarE;
                            }
                            kVarH.h(obj3, hVar, vVar, cVar);
                        }
                        i++;
                    } catch (Exception e2) {
                        e = e2;
                        o0.o(vVar, e, obj3, i);
                        throw null;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                obj3 = null;
            }
        } else {
            try {
                oi0.d dVar3 = this.i;
                obj2 = null;
                while (i < length) {
                    try {
                        obj2 = objArr[i];
                        if (obj2 == null) {
                            vVar.h(hVar);
                        } else {
                            Class<?> cls2 = obj2.getClass();
                            k9.k kVarH2 = dVar3.H(cls2);
                            if (kVarH2 == null) {
                                if (javaType.D0()) {
                                    tb4.t tVarG = dVar3.g(vVar.e(javaType, cls2), vVar, dVar);
                                    oi0.d dVar4 = (oi0.d) tVarG.f269457c;
                                    if (dVar3 != dVar4) {
                                        this.i = dVar4;
                                    }
                                    kVarH2 = (k9.k) tVarG.f269456b;
                                } else {
                                    kVarH2 = vVar.k(cls2, dVar);
                                    oi0.d dVarE2 = dVar3.E(cls2, kVarH2);
                                    if (dVar3 != dVarE2) {
                                        this.i = dVarE2;
                                    }
                                }
                            }
                            kVarH2.f(obj2, hVar, vVar);
                        }
                        i++;
                    } catch (Exception e5) {
                        e = e5;
                        o0.o(vVar, e, obj2, i);
                        throw null;
                    }
                }
            } catch (Exception e6) {
                e = e6;
                obj2 = null;
            }
        }
    }

    public x(x xVar, k9.d dVar, r9.c cVar, k9.k kVar, Boolean bool) {
        super(xVar, dVar, bool);
        this.f = xVar.f;
        this.f286945g = cVar;
        this.e = xVar.e;
        this.i = u9.k.f278279a;
        this.f286946h = kVar;
    }
}
