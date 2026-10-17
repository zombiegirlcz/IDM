package u9;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import v9.o0;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends t9.g implements t9.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JavaType f278263c;
    public final k9.d d;
    public final boolean e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r9.c f278264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k9.k f278265h;
    public oi0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f278266j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Class cls, JavaType javaType, boolean z, r9.c cVar, k9.k kVar, int i) {
        this(cls, javaType, z, cVar, kVar);
        this.f278266j = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // t9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k a(k9.v r10, k9.d r11) {
        /*
            r9 = this;
            r9.c r0 = r9.f278264g
            if (r0 == 0) goto La
            r9.c r1 = r0.g(r11)
            r5 = r1
            goto Lb
        La:
            r5 = r0
        Lb:
            r1 = 0
            if (r11 == 0) goto L25
            k9.t r2 = r10.f182201a
            k9.p r2 = r2.e()
            p9.f r3 = r11.b()
            if (r3 == 0) goto L25
            java.lang.Object r2 = r2.c(r3)
            if (r2 == 0) goto L25
            k9.k r2 = r10.D(r3, r2)
            goto L26
        L25:
            r2 = r1
        L26:
            java.lang.Class r3 = r9.f286928a
            d9.p r3 = v9.o0.m(r10, r11, r3)
            if (r3 == 0) goto L34
            d9.m r1 = d9.m.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.b(r1)
        L34:
            r7 = r1
            k9.k r1 = r9.f278265h
            if (r2 != 0) goto L3a
            r2 = r1
        L3a:
            k9.k r2 = v9.o0.l(r10, r11, r2)
            if (r2 != 0) goto L52
            com.fasterxml.jackson.databind.JavaType r3 = r9.f278263c
            if (r3 == 0) goto L52
            boolean r4 = r9.e
            if (r4 == 0) goto L52
            boolean r4 = r3.I0()
            if (r4 != 0) goto L52
            k9.k r2 = r10.i(r3, r11)
        L52:
            r6 = r2
            if (r6 != r1) goto L65
            k9.d r10 = r9.d
            if (r11 != r10) goto L65
            if (r0 != r5) goto L65
            java.lang.Boolean r10 = r9.f
            boolean r10 = java.util.Objects.equals(r10, r7)
            if (r10 != 0) goto L64
            goto L65
        L64:
            return r9
        L65:
            int r10 = r9.f278266j
            switch(r10) {
                case 0: goto L8e;
                case 1: goto L85;
                case 2: goto L7c;
                case 3: goto L73;
                default: goto L6a;
            }
        L6a:
            u9.e r2 = new u9.e
            r8 = 4
            r3 = r9
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L96
        L73:
            r4 = r11
            u9.e r2 = new u9.e
            r8 = 3
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L96
        L7c:
            r4 = r11
            u9.e r2 = new u9.e
            r8 = 2
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L96
        L85:
            r4 = r11
            u9.e r2 = new u9.e
            r8 = 1
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L96
        L8e:
            r4 = r11
            u9.e r2 = new u9.e
            r8 = 0
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.e.a(k9.v, k9.d):k9.k");
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        switch (this.f278266j) {
            case 0:
                return ((List) obj2).isEmpty();
            case 1:
                return !((Iterator) obj2).hasNext();
            case 2:
                return ((Collection) obj2).isEmpty();
            case 3:
                return ((EnumSet) obj2).isEmpty();
            default:
                return !((Iterable) obj2).iterator().hasNext();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // k9.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r4, com.fasterxml.jackson.core.h r5, k9.v r6) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.e.f(java.lang.Object, com.fasterxml.jackson.core.h, k9.v):void");
    }

    @Override // k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) throws IOException {
        f9.d dVarE = cVar.e(hVar, cVar.d(obj2, com.fasterxml.jackson.core.n.START_ARRAY));
        hVar.i(obj2);
        switch (this.f278266j) {
            case 0:
                w((List) obj2, hVar, vVar);
                break;
            case 1:
                v((Iterator) obj2, hVar, vVar);
                break;
            case 2:
                t((Collection) obj2, hVar, vVar);
                break;
            case 3:
                u((EnumSet) obj2, hVar, vVar);
                break;
            default:
                s((Iterable) obj2, hVar, vVar);
                break;
        }
        cVar.f(hVar, dVarE);
    }

    @Override // t9.g
    public final t9.g q(r9.c cVar) {
        switch (this.f278266j) {
            case 0:
                return new e(this, this.d, cVar, this.f278265h, this.f, 0);
            case 1:
                return new e(this, this.d, cVar, this.f278265h, this.f, 1);
            case 2:
                return new e(this, this.d, cVar, this.f278265h, this.f, 2);
            case 3:
                return this;
            default:
                return new e(this, this.d, cVar, this.f278265h, this.f, 4);
        }
    }

    public final k9.k r(oi0.d dVar, JavaType javaType, k9.v vVar) {
        tb4.t tVarG = dVar.g(javaType, vVar, this.d);
        oi0.d dVar2 = (oi0.d) tVarG.f269457c;
        if (dVar != dVar2) {
            this.i = dVar2;
        }
        return (k9.k) tVarG.f269456b;
    }

    public void s(Iterable iterable, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        k9.k kVar;
        Iterator it8 = iterable.iterator();
        if (it8.hasNext()) {
            Class<?> cls = null;
            k9.k kVarQ = null;
            do {
                Object next = it8.next();
                if (next == null) {
                    vVar.h(hVar);
                } else {
                    k9.k kVar2 = this.f278265h;
                    if (kVar2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            kVarQ = vVar.q(cls2, this.d);
                            cls = cls2;
                        }
                        kVar = kVarQ;
                    } else {
                        kVar = kVarQ;
                        kVarQ = kVar2;
                    }
                    r9.c cVar = this.f278264g;
                    if (cVar == null) {
                        kVarQ.f(next, hVar, vVar);
                    } else {
                        kVarQ.h(next, hVar, vVar, cVar);
                    }
                    kVarQ = kVar;
                }
            } while (it8.hasNext());
        }
    }

    public void t(Collection collection, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        JavaType javaType = this.f278263c;
        hVar.i(collection);
        int i = 0;
        r9.c cVar = this.f278264g;
        k9.k kVar = this.f278265h;
        if (kVar != null) {
            Iterator it8 = collection.iterator();
            if (it8.hasNext()) {
                do {
                    Object next = it8.next();
                    if (next == null) {
                        try {
                            vVar.h(hVar);
                        } catch (Exception e) {
                            o0.o(vVar, e, collection, i);
                            throw null;
                        }
                    } else if (cVar == null) {
                        kVar.f(next, hVar, vVar);
                    } else {
                        kVar.h(next, hVar, vVar, cVar);
                    }
                    i++;
                } while (it8.hasNext());
                return;
            }
            return;
        }
        Iterator it9 = collection.iterator();
        if (it9.hasNext()) {
            oi0.d dVar = this.i;
            do {
                try {
                    Object next2 = it9.next();
                    if (next2 == null) {
                        vVar.h(hVar);
                    } else {
                        Class<?> cls = next2.getClass();
                        k9.k kVarH = dVar.H(cls);
                        if (kVarH == null) {
                            if (javaType.D0()) {
                                kVarH = r(dVar, vVar.e(javaType, cls), vVar);
                            } else {
                                kVarH = vVar.k(cls, this.d);
                                oi0.d dVarE = dVar.E(cls, kVarH);
                                if (dVar != dVarE) {
                                    this.i = dVarE;
                                }
                            }
                            dVar = this.i;
                        }
                        if (cVar == null) {
                            kVarH.f(next2, hVar, vVar);
                        } else {
                            kVarH.h(next2, hVar, vVar, cVar);
                        }
                    }
                    i++;
                } catch (Exception e2) {
                    o0.o(vVar, e2, collection, i);
                    throw null;
                }
            } while (it9.hasNext());
        }
    }

    public void u(EnumSet enumSet, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Iterator it8 = enumSet.iterator();
        k9.k kVarK = this.f278265h;
        while (it8.hasNext()) {
            Enum r110 = (Enum) it8.next();
            if (kVarK == null) {
                kVarK = vVar.k(r110.getDeclaringClass(), this.d);
            }
            kVarK.f(r110, hVar, vVar);
        }
    }

    public void v(Iterator it8, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        if (it8.hasNext()) {
            r9.c cVar = this.f278264g;
            k9.k kVar = this.f278265h;
            if (kVar != null) {
                do {
                    Object next = it8.next();
                    if (next == null) {
                        vVar.h(hVar);
                    } else if (cVar == null) {
                        kVar.f(next, hVar, vVar);
                    } else {
                        kVar.h(next, hVar, vVar, cVar);
                    }
                } while (it8.hasNext());
                return;
            }
            oi0.d dVar = this.i;
            do {
                Object next2 = it8.next();
                if (next2 == null) {
                    vVar.h(hVar);
                } else {
                    Class<?> cls = next2.getClass();
                    k9.k kVarH = dVar.H(cls);
                    if (kVarH == null) {
                        JavaType javaType = this.f278263c;
                        if (javaType.D0()) {
                            kVarH = r(dVar, vVar.e(javaType, cls), vVar);
                        } else {
                            kVarH = vVar.k(cls, this.d);
                            oi0.d dVarE = dVar.E(cls, kVarH);
                            if (dVar != dVarE) {
                                this.i = dVarE;
                            }
                        }
                        dVar = this.i;
                    }
                    if (cVar == null) {
                        kVarH.f(next2, hVar, vVar);
                    } else {
                        kVarH.h(next2, hVar, vVar, cVar);
                    }
                }
            } while (it8.hasNext());
        }
    }

    public void w(List list, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        int i = 0;
        r9.c cVar = this.f278264g;
        k9.k kVar = this.f278265h;
        if (kVar != null) {
            int size = list.size();
            if (size == 0) {
                return;
            }
            while (i < size) {
                Object obj2 = list.get(i);
                if (obj2 == null) {
                    try {
                        vVar.h(hVar);
                    } catch (Exception e) {
                        o0.o(vVar, e, list, i);
                        throw null;
                    }
                } else if (cVar == null) {
                    kVar.f(obj2, hVar, vVar);
                } else {
                    kVar.h(obj2, hVar, vVar, cVar);
                }
                i++;
            }
            return;
        }
        k9.d dVar = this.d;
        JavaType javaType = this.f278263c;
        if (cVar != null) {
            int size2 = list.size();
            if (size2 == 0) {
                return;
            }
            try {
                oi0.d dVar2 = this.i;
                while (i < size2) {
                    Object obj3 = list.get(i);
                    if (obj3 == null) {
                        vVar.h(hVar);
                    } else {
                        Class<?> cls = obj3.getClass();
                        k9.k kVarH = dVar2.H(cls);
                        if (kVarH == null) {
                            if (javaType.D0()) {
                                kVarH = r(dVar2, vVar.e(javaType, cls), vVar);
                            } else {
                                kVarH = vVar.k(cls, dVar);
                                oi0.d dVarE = dVar2.E(cls, kVarH);
                                if (dVar2 != dVarE) {
                                    this.i = dVarE;
                                }
                            }
                            dVar2 = this.i;
                        }
                        kVarH.h(obj3, hVar, vVar, cVar);
                    }
                    i++;
                }
                return;
            } catch (Exception e2) {
                o0.o(vVar, e2, list, i);
                throw null;
            }
        }
        int size3 = list.size();
        if (size3 == 0) {
            return;
        }
        try {
            oi0.d dVar3 = this.i;
            while (i < size3) {
                Object obj4 = list.get(i);
                if (obj4 == null) {
                    vVar.h(hVar);
                } else {
                    Class<?> cls2 = obj4.getClass();
                    k9.k kVarH2 = dVar3.H(cls2);
                    if (kVarH2 == null) {
                        if (javaType.D0()) {
                            kVarH2 = r(dVar3, vVar.e(javaType, cls2), vVar);
                        } else {
                            kVarH2 = vVar.k(cls2, dVar);
                            oi0.d dVarE2 = dVar3.E(cls2, kVarH2);
                            if (dVar3 != dVarE2) {
                                this.i = dVarE2;
                            }
                        }
                        dVar3 = this.i;
                    }
                    kVarH2.f(obj4, hVar, vVar);
                }
                i++;
            }
        } catch (Exception e4) {
            o0.o(vVar, e4, list, i);
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(JavaType javaType, boolean z, s9.l lVar, k9.k kVar) {
        this(Collection.class, javaType, z, lVar, kVar);
        this.f278266j = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Class cls, JavaType javaType, boolean z, r9.c cVar, k9.k kVar) {
        super(cls, 0);
        boolean z3 = false;
        this.f278263c = javaType;
        if (z || (javaType != null && Modifier.isFinal(javaType.f26182a.getModifiers()))) {
            z3 = true;
        }
        this.e = z3;
        this.f278264g = cVar;
        this.d = null;
        this.f278265h = kVar;
        this.i = k.f278279a;
        this.f = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e eVar, k9.d dVar, r9.c cVar, k9.k kVar, Boolean bool, int i) {
        super(eVar.f286928a, 0);
        this.f278266j = i;
        this.f278263c = eVar.f278263c;
        this.e = eVar.e;
        this.f278264g = cVar;
        this.d = dVar;
        this.f278265h = kVar;
        this.i = k.f278279a;
        this.f = bool;
    }
}
