package e8;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f123461a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f123462b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f123463c;
    public Object d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class f123464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f123465h;
    public c8.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f123466j;
    public Class k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f123467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f123468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c8.g f123469n;
    public com.bumptech.glide.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f123470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f123471q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f123472r;

    public final ArrayList a() {
        boolean z = this.f123468m;
        ArrayList arrayList = this.f123462b;
        if (!z) {
            this.f123468m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                i8.t tVar = (i8.t) arrayListB.get(i);
                c8.g gVar = tVar.f159398a;
                List list = tVar.f159399b;
                if (!arrayList.contains(gVar)) {
                    arrayList.add(tVar.f159398a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.f123467l;
        ArrayList arrayList = this.f123461a;
        if (!z) {
            this.f123467l = true;
            arrayList.clear();
            List listF = this.f123463c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                i8.t tVarA = ((i8.u) listF.get(i)).a(this.d, this.e, this.f, this.i);
                if (tVarA != null) {
                    arrayList.add(tVarA);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c0 c(Class cls) {
        c0 c0Var;
        Class cls2;
        Class cls3;
        Class cls4;
        c0 c0Var2;
        ArrayList arrayList;
        q8.a aVar;
        Class cls5 = cls;
        Registry registryA = this.f123463c.a();
        Class cls6 = this.f123464g;
        Class cls7 = this.k;
        t8.b bVar = registryA.i;
        y8.j jVar = (y8.j) bVar.f268752b.getAndSet(null);
        if (jVar == null) {
            jVar = new y8.j();
        }
        jVar.f311605a = cls5;
        jVar.f311606b = cls6;
        jVar.f311607c = cls7;
        synchronized (bVar.f268751a) {
            c0Var = (c0) bVar.f268751a.get(jVar);
        }
        bVar.f268752b.set(jVar);
        registryA.i.getClass();
        if (t8.b.f268750c.equals(c0Var)) {
            return null;
        }
        if (c0Var != null) {
            return c0Var;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : registryA.f26067c.s(cls5, cls6)) {
            for (Class cls9 : registryA.f.d(cls8, cls7)) {
                cpi.g gVar = registryA.f26067c;
                synchronized (gVar) {
                    arrayList = new ArrayList();
                    Iterator it8 = ((ArrayList) gVar.f107954b).iterator();
                    while (it8.hasNext()) {
                        List<t8.c> list = (List) ((HashMap) gVar.f107955c).get((String) it8.next());
                        if (list != null) {
                            for (t8.c cVar : list) {
                                if (cVar.f268753a.isAssignableFrom(cls5) && cls8.isAssignableFrom(cVar.f268754b)) {
                                    arrayList.add(cVar.f268755c);
                                }
                            }
                        }
                    }
                }
                e4m.f fVar = registryA.f;
                synchronized (fVar) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (q8.b bVar2 : fVar.f122679b) {
                            if (bVar2.f242952a.isAssignableFrom(cls8) && cls9.isAssignableFrom(bVar2.f242953b)) {
                                aVar = bVar2.f242954c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    aVar = q8.c.f242955b;
                }
                arrayList2.add(new n(cls5, cls8, cls9, arrayList, aVar, registryA.f26070j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c0Var2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c0Var2 = new c0(cls2, cls3, cls4, arrayList2, registryA.f26070j);
        }
        t8.b bVar3 = registryA.i;
        synchronized (bVar3.f268751a) {
            bVar3.f268751a.put(new y8.j(cls2, cls3, cls4), c0Var2 != null ? c0Var2 : t8.b.f268750c);
        }
        return c0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r3.f268749b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c8.d d(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.f r0 = r5.f123463c
            com.bumptech.glide.Registry r0 = r0.a()
            f7.c r0 = r0.f26066b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f132468a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            t8.a r3 = (t8.a) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.f268748a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            c8.d r1 = r3.f268749b     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L3c
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.h.d(java.lang.Object):c8.d");
    }

    public final c8.o e(Class cls) {
        c8.o oVar = (c8.o) this.f123466j.get(cls);
        if (oVar == null) {
            Iterator it8 = this.f123466j.entrySet().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it8.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    oVar = (c8.o) entry.getValue();
                    break;
                }
            }
        }
        if (oVar != null) {
            return oVar;
        }
        if (this.f123466j.isEmpty() && this.f123471q) {
            throw new IllegalArgumentException(a0.d.q("Missing transformation for ", cls, ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return k8.d.f182078a;
    }
}
