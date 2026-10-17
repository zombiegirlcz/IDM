package p9;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes16.dex */
public final class g0 extends t implements Comparable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k9.b f234214m = new k9.b(k9.a.MANAGED_REFERENCE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f234215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m9.h f234216c;
    public final k9.p d;
    public final k9.r e;
    public final k9.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f234217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f234218h;
    public e0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f234219j;
    public transient k9.q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient k9.b f234220l;

    public g0(m9.h hVar, k9.p pVar, boolean z, k9.r rVar, k9.r rVar2) {
        this.f234216c = hVar;
        this.d = pVar;
        this.f = rVar;
        this.e = rVar2;
        this.f234215b = z;
    }

    public static boolean p(e0 e0Var) {
        while (e0Var != null) {
            k9.r rVar = e0Var.f234211c;
            if (rVar != null && !rVar.f182194a.isEmpty()) {
                return true;
            }
            e0Var = e0Var.f234210b;
        }
        return false;
    }

    public static boolean q(e0 e0Var) {
        while (e0Var != null) {
            if (e0Var.f) {
                return true;
            }
            e0Var = e0Var.f234210b;
        }
        return false;
    }

    public static boolean r(e0 e0Var) {
        while (e0Var != null) {
            if (e0Var.e) {
                return true;
            }
            e0Var = e0Var.f234210b;
        }
        return false;
    }

    public static e0 s(e0 e0Var, q qVar) {
        f fVar = (f) ((f) e0Var.f234209a).t(qVar);
        e0 e0Var2 = e0Var.f234210b;
        if (e0Var2 != null) {
            e0Var = e0Var.c(s(e0Var2, qVar));
        }
        return fVar == e0Var.f234209a ? e0Var : new e0(fVar, e0Var.f234210b, e0Var.f234211c, e0Var.d, e0Var.e, e0Var.f);
    }

    public static Set u(e0 e0Var, Set set) {
        while (e0Var != null) {
            k9.r rVar = e0Var.f234211c;
            if (e0Var.d && rVar != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(rVar);
            }
            e0Var = e0Var.f234210b;
        }
        return set;
    }

    public static q v(e0 e0Var) {
        q qVar = ((f) e0Var.f234209a).f234213c;
        e0 e0Var2 = e0Var.f234210b;
        return e0Var2 != null ? q.b(qVar, v(e0Var2)) : qVar;
    }

    public static int w(g gVar) {
        String name = gVar.e.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public static q x(int i, e0... e0VarArr) {
        q qVarV = v(e0VarArr[i]);
        do {
            i++;
            if (i >= e0VarArr.length) {
                return qVarV;
            }
        } while (e0VarArr[i] == null);
        return q.b(qVarV, x(i, e0VarArr));
    }

    public final f A() {
        if (this.f234215b) {
            return e();
        }
        f fVarF = f();
        if (fVarF == null && (fVarF = l()) == null) {
            fVarF = g();
        }
        return fVarF == null ? e() : fVarF;
    }

    @Override // p9.t
    public final boolean a() {
        return (this.f234218h == null && this.f234219j == null && this.f234217g == null) ? false : true;
    }

    @Override // p9.t
    public final d9.z b() {
        f fVarE = e();
        k9.p pVar = this.d;
        d9.z zVarB = pVar == null ? null : pVar.B(fVarE);
        return zVarB == null ? d9.z.e : zVarB;
    }

    @Override // p9.t
    public final k9.b c() {
        k9.b bVar = this.f234220l;
        k9.b bVar2 = f234214m;
        if (bVar != null) {
            if (bVar == bVar2) {
                return null;
            }
            return bVar;
        }
        k9.b bVar3 = (k9.b) z(new p56.a(this, 1));
        if (bVar3 != null) {
            bVar2 = bVar3;
        }
        this.f234220l = bVar2;
        return bVar3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        g0 g0Var = (g0) obj2;
        if (this.f234218h != null) {
            if (g0Var.f234218h == null) {
                return -1;
            }
        } else if (g0Var.f234218h != null) {
            return 1;
        }
        return j().compareTo(g0Var.j());
    }

    @Override // p9.t
    public final Class[] d() {
        return (Class[]) z(new os2.g(this, 2));
    }

    @Override // p9.t
    public final j f() {
        e0 e0Var = this.f234218h;
        if (e0Var == null) {
            return null;
        }
        do {
            Object obj2 = e0Var.f234209a;
            if (((j) obj2).d instanceof b) {
                return (j) obj2;
            }
            e0Var = e0Var.f234210b;
        } while (e0Var != null);
        return (j) this.f234218h.f234209a;
    }

    @Override // p9.t
    public final d g() {
        e0 e0Var = this.f234217g;
        if (e0Var == null) {
            return null;
        }
        d dVar = (d) e0Var.f234209a;
        for (e0 e0Var2 = e0Var.f234210b; e0Var2 != null; e0Var2 = e0Var2.f234210b) {
            d dVar2 = (d) e0Var2.f234209a;
            Class<?> declaringClass = dVar.d.getDeclaringClass();
            Class<?> declaringClass2 = dVar2.d.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    dVar = dVar2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + j() + "\": " + dVar.o() + " vs " + dVar2.o());
        }
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // p9.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p9.g h() {
        /*
            r7 = this;
            p9.e0 r0 = r7.i
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            p9.e0 r1 = r0.f234210b
            if (r1 != 0) goto Lf
            java.lang.Object r0 = r0.f234209a
            p9.g r0 = (p9.g) r0
            return r0
        Lf:
            java.lang.Object r2 = r0.f234209a
            if (r1 == 0) goto L75
            java.lang.Object r3 = r1.f234209a
            p9.g r2 = (p9.g) r2
            java.lang.reflect.Method r4 = r2.e
            java.lang.Class r4 = r4.getDeclaringClass()
            p9.g r3 = (p9.g) r3
            java.lang.reflect.Method r5 = r3.e
            java.lang.Class r5 = r5.getDeclaringClass()
            if (r4 == r5) goto L35
            boolean r6 = r4.isAssignableFrom(r5)
            if (r6 == 0) goto L2e
            goto L41
        L2e:
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L35
            goto L42
        L35:
            int r4 = w(r3)
            int r5 = w(r2)
            if (r4 == r5) goto L45
            if (r4 >= r5) goto L42
        L41:
            r0 = r1
        L42:
            p9.e0 r1 = r1.f234210b
            goto Lf
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Conflicting getter definitions for property \""
            r1.<init>(r4)
            java.lang.String r4 = r7.j()
            r1.append(r4)
            java.lang.String r4 = "\": "
            r1.append(r4)
            java.lang.String r2 = r2.o()
            r1.append(r2)
            java.lang.String r2 = " vs "
            r1.append(r2)
            java.lang.String r2 = r3.o()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L75:
            p9.e0 r0 = r0.e()
            r7.i = r0
            p9.g r2 = (p9.g) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.g0.h():p9.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a A[PHI: r4 r9
      0x011a: PHI (r4v10 d9.z0) = (r4v4 d9.z0), (r4v4 d9.z0), (r4v4 d9.z0), (r4v3 d9.z0) binds: [B:96:0x013c, B:98:0x0149, B:99:0x014b, B:81:0x0117] A[DONT_GENERATE, DONT_INLINE]
      0x011a: PHI (r9v8 d9.z0) = (r9v3 d9.z0), (r9v3 d9.z0), (r9v3 d9.z0), (r9v2 d9.z0) binds: [B:96:0x013c, B:98:0x0149, B:99:0x014b, B:81:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p9.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.q i() {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.g0.i():k9.q");
    }

    @Override // p9.t
    public final String j() {
        k9.r rVar = this.e;
        if (rVar == null) {
            return null;
        }
        return rVar.f182194a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[PHI: r0
      0x003d: PHI (r0v3 p9.p) = (r0v2 p9.p), (r0v5 p9.p) binds: [B:16:0x0030, B:18:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p9.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class k() {
        /*
            r2 = this;
            boolean r0 = r2.f234215b
            if (r0 == 0) goto L1a
            p9.g r0 = r2.h()
            if (r0 != 0) goto L15
            p9.d r0 = r2.g()
            if (r0 != 0) goto L15
            com.fasterxml.jackson.databind.type.SimpleType r0 = w9.f.l()
            goto L41
        L15:
            com.fasterxml.jackson.databind.JavaType r0 = r0.h()
            goto L41
        L1a:
            p9.j r0 = r2.f()
            if (r0 != 0) goto L30
            p9.g r0 = r2.l()
            if (r0 == 0) goto L2c
            r1 = 0
            com.fasterxml.jackson.databind.JavaType r0 = r0.v(r1)
            goto L41
        L2c:
            p9.d r0 = r2.g()
        L30:
            if (r0 != 0) goto L3d
            p9.g r0 = r2.h()
            if (r0 != 0) goto L3d
            com.fasterxml.jackson.databind.type.SimpleType r0 = w9.f.l()
            goto L41
        L3d:
            com.fasterxml.jackson.databind.JavaType r0 = r0.h()
        L41:
            java.lang.Class r0 = r0.f26182a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.g0.k():java.lang.Class");
    }

    @Override // p9.t
    public final g l() {
        Object obj2;
        e0 e0Var = this.f234219j;
        if (e0Var == null) {
            return null;
        }
        e0 e0Var2 = e0Var.f234210b;
        if (e0Var2 == null) {
            return (g) e0Var.f234209a;
        }
        while (true) {
            Object obj3 = e0Var.f234209a;
            if (e0Var2 == null) {
                this.f234219j = e0Var.e();
                return (g) obj3;
            }
            e0 e0Var3 = e0Var2.f234210b;
            Object obj4 = e0Var2.f234209a;
            g gVarY = y((g) obj3, (g) obj4);
            if (gVarY != obj3) {
                if (gVarY != obj4) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj3);
                    arrayList.add(obj4);
                    while (true) {
                        obj2 = e0Var.f234209a;
                        if (e0Var3 == null) {
                            break;
                        }
                        Object obj5 = e0Var3.f234209a;
                        g gVarY2 = y((g) obj2, (g) obj5);
                        if (gVarY2 != obj2) {
                            if (gVarY2 == obj5) {
                                arrayList.clear();
                                e0Var = e0Var3;
                            } else {
                                arrayList.add(obj5);
                            }
                        }
                        e0Var3 = e0Var3.f234210b;
                    }
                    if (arrayList.isEmpty()) {
                        this.f234219j = e0Var.e();
                        return (g) obj2;
                    }
                    throw new IllegalArgumentException(a0.d.s("Conflicting setter definitions for property \"", j(), "\": ", (String) arrayList.stream().map(new com.google.android.material.color.utilities.f(10)).collect(Collectors.joining(" vs "))));
                }
                e0Var = e0Var2;
            }
            e0Var2 = e0Var3;
        }
    }

    @Override // p9.t
    public final void m() {
        A();
    }

    @Override // p9.t
    public final boolean n() {
        if (p(this.f234217g) || p(this.i) || p(this.f234219j)) {
            return true;
        }
        for (e0 e0Var = this.f234218h; e0Var != null; e0Var = e0Var.f234210b) {
            if (e0Var.f234211c != null && e0Var.d) {
                return true;
            }
        }
        return false;
    }

    @Override // p9.t
    public final boolean o() {
        Boolean bool = (Boolean) z(new onh.b(this, 3));
        return bool != null && bool.booleanValue();
    }

    public final void t(Set set, HashMap map, e0 e0Var) {
        for (e0 e0Var2 = e0Var; e0Var2 != null; e0Var2 = e0Var2.f234210b) {
            k9.r rVar = e0Var2.f234211c;
            if (e0Var2.d && rVar != null) {
                g0 g0Var = (g0) map.get(rVar);
                if (g0Var == null) {
                    g0Var = new g0(this.f234216c, this.d, this.f234215b, this.f, rVar);
                    map.put(rVar, g0Var);
                }
                if (e0Var == this.f234217g) {
                    g0Var.f234217g = e0Var2.c(g0Var.f234217g);
                } else if (e0Var == this.i) {
                    g0Var.i = e0Var2.c(g0Var.i);
                } else if (e0Var == this.f234219j) {
                    g0Var.f234219j = e0Var2.c(g0Var.f234219j);
                } else {
                    if (e0Var != this.f234218h) {
                        throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                    }
                    g0Var.f234218h = e0Var2.c(g0Var.f234218h);
                }
            } else if (e0Var2.e) {
                StringBuilder sb6 = new StringBuilder("Conflicting/ambiguous property name definitions (implicit name ");
                Annotation[] annotationArr = x9.f.f303505a;
                k9.r rVar2 = this.e;
                sb6.append(rVar2 == null ? "[null]" : x9.f.c(rVar2.f182194a));
                sb6.append("): found multiple explicit names: ");
                sb6.append(set);
                sb6.append(", but also implicit accessor: ");
                sb6.append(e0Var2);
                throw new IllegalStateException(sb6.toString());
            }
        }
    }

    public final String toString() {
        return "[Property '" + this.e + "'; ctors: " + this.f234218h + ", field(s): " + this.f234217g + ", getter(s): " + this.i + ", setter(s): " + this.f234219j + "]";
    }

    public final g y(g gVar, g gVar2) {
        Class<?> declaringClass = gVar.e.getDeclaringClass();
        Class<?> declaringClass2 = gVar2.e.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (!declaringClass.isAssignableFrom(declaringClass2)) {
                if (!declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
        }
        String name = gVar2.e.getName();
        char c2 = 2;
        char c3 = (!name.startsWith("set") || name.length() <= 3) ? (char) 2 : (char) 1;
        String name2 = gVar.e.getName();
        if (name2.startsWith("set") && name2.length() > 3) {
            c2 = 1;
        }
        if (c3 != c2) {
            return c3 < c2 ? gVar2 : gVar;
        }
        k9.p pVar = this.d;
        if (pVar == null) {
            return null;
        }
        return pVar.q0(gVar, gVar2);
    }

    public final Object z(f0 f0Var) {
        e0 e0Var;
        e0 e0Var2;
        if (this.d != null) {
            if (this.f234215b) {
                e0 e0Var3 = this.i;
                if (e0Var3 != null) {
                    objE = f0Var.e((f) e0Var3.f234209a);
                }
            } else {
                e0 e0Var4 = this.f234218h;
                objE = e0Var4 != null ? f0Var.e((f) e0Var4.f234209a) : null;
                if (objE == null && (e0Var = this.f234219j) != null) {
                    objE = f0Var.e((f) e0Var.f234209a);
                }
            }
            if (objE == null && (e0Var2 = this.f234217g) != null) {
                return f0Var.e((f) e0Var2.f234209a);
            }
        }
        return objE;
    }

    public g0(g0 g0Var, k9.r rVar) {
        this.f234216c = g0Var.f234216c;
        this.d = g0Var.d;
        this.f = g0Var.f;
        this.e = rVar;
        this.f234217g = g0Var.f234217g;
        this.f234218h = g0Var.f234218h;
        this.i = g0Var.i;
        this.f234219j = g0Var.f234219j;
        this.f234215b = g0Var.f234215b;
    }
}
