package com.bumptech.glide;

import androidx.core.util.Pools$SynchronizedPool;
import i8.a0;
import i8.b0;
import i8.u;
import i8.v;
import i8.w;
import i8.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes.dex */
public class Registry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f26065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f7.c f26066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cpi.g f26067c;
    public final s0 d;
    public final com.bumptech.glide.load.data.j e;
    public final e4m.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.f f26068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ao.h f26069h = new ao.h(29);
    public final t8.b i = new t8.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gpk.c f26070j;

    /* JADX INFO: loaded from: classes16.dex */
    public static class MissingComponentException extends RuntimeException {
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super(a0.d.q("Failed to find result encoder for resource class: ", cls, ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."));
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class cls) {
            super(a0.d.l(cls, "Failed to find source encoder for data class: "));
        }
    }

    public Registry() {
        gpk.c cVar = new gpk.c(new Pools$SynchronizedPool(20), (z8.a) new qf.b(19), (z8.c) new af.f(20));
        this.f26070j = cVar;
        this.f26065a = new x(cVar);
        this.f26066b = new f7.c(1);
        this.f26067c = new cpi.g(29);
        this.d = new s0();
        this.e = new com.bumptech.glide.load.data.j();
        this.f = new e4m.f(2, (byte) 0);
        this.f26068g = new e4m.f(3, (byte) 0);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it8 = listAsList.iterator();
        while (it8.hasNext()) {
            arrayList.add((String) it8.next());
        }
        arrayList.add("legacy_append");
        cpi.g gVar = this.f26067c;
        synchronized (gVar) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) gVar.f107954b);
                ((ArrayList) gVar.f107954b).clear();
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    ((ArrayList) gVar.f107954b).add((String) it9.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) gVar.f107954b).add(str);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void a(Class cls, c8.d dVar) {
        f7.c cVar = this.f26066b;
        synchronized (cVar) {
            cVar.f132468a.add(new t8.a(cls, dVar));
        }
    }

    public final void b(Class cls, c8.n nVar) {
        s0 s0Var = this.d;
        synchronized (s0Var) {
            s0Var.f186433a.add(new t8.d(cls, nVar));
        }
    }

    public final void c(Class cls, Class cls2, v vVar) {
        x xVar = this.f26065a;
        synchronized (xVar) {
            b0 b0Var = xVar.f159402a;
            synchronized (b0Var) {
                try {
                    a0 a0Var = new a0(cls, cls2, vVar);
                    ArrayList arrayList = b0Var.f159347a;
                    arrayList.add(arrayList.size(), a0Var);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            xVar.f159403b.f15223a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, c8.m mVar) {
        cpi.g gVar = this.f26067c;
        synchronized (gVar) {
            gVar.r(str).add(new t8.c(cls, cls2, mVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        e4m.f fVar = this.f26068g;
        synchronized (fVar) {
            arrayList = fVar.f122679b;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    public final List f(Object obj2) {
        List listUnmodifiableList;
        x xVar = this.f26065a;
        xVar.getClass();
        Class<?> cls = obj2.getClass();
        synchronized (xVar) {
            w wVar = (w) xVar.f159403b.f15223a.get(cls);
            listUnmodifiableList = wVar == null ? null : wVar.f159401a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(xVar.f159402a.b(cls));
                if (((w) xVar.f159403b.f15223a.put(cls, new w(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new NoModelLoaderAvailableException(obj2);
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            u uVar = (u) listUnmodifiableList.get(i);
            if (uVar.b(obj2)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(uVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new NoModelLoaderAvailableException(obj2, listUnmodifiableList);
        }
        return arrayList;
    }

    public final com.bumptech.glide.load.data.g g(Object obj2) {
        com.bumptech.glide.load.data.g gVarB;
        com.bumptech.glide.load.data.j jVar = this.e;
        synchronized (jVar) {
            try {
                y8.f.b(obj2);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) jVar.f26114a).get(obj2.getClass());
                if (fVar == null) {
                    Iterator it8 = ((HashMap) jVar.f26114a).values().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it8.next();
                        if (fVar2.a().isAssignableFrom(obj2.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.j.f26113b;
                }
                gVarB = fVar.b(obj2);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVarB;
    }

    public final void h(Class cls, Class cls2, v vVar) {
        x xVar = this.f26065a;
        synchronized (xVar) {
            b0 b0Var = xVar.f159402a;
            synchronized (b0Var) {
                try {
                    b0Var.f159347a.add(0, new a0(cls, cls2, vVar));
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            xVar.f159403b.f15223a.clear();
        }
    }

    public final void i(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.j jVar = this.e;
        synchronized (jVar) {
            ((HashMap) jVar.f26114a).put(fVar.a(), fVar);
        }
    }

    public final void j(Class cls, Class cls2, q8.a aVar) {
        e4m.f fVar = this.f;
        synchronized (fVar) {
            fVar.f122679b.add(new q8.b(cls, cls2, aVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[Catch: all -> 0x003c, LOOP:0: B:12:0x0023->B:14:0x0029, LOOP_END, TryCatch #2 {, blocks: (B:4:0x0007, B:5:0x0009, B:10:0x001e, B:11:0x001f, B:12:0x0023, B:14:0x0029, B:15:0x0033, B:26:0x0044, B:6:0x000a, B:7:0x000e, B:9:0x001d, B:21:0x003f, B:8:0x000f), top: B:32:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(b8.c r7) {
        /*
            r6 = this;
            java.lang.Class<i8.k> r0 = i8.k.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            i8.x r2 = r6.f26065a
            monitor-enter(r2)
            i8.b0 r3 = r2.f159402a     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r4 = r3.d()     // Catch: java.lang.Throwable -> L42
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L42
            i8.a0 r5 = new i8.a0     // Catch: java.lang.Throwable -> L40
            r5.<init>(r0, r1, r7)     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r7 = r3.f159347a     // Catch: java.lang.Throwable -> L40
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L40
            r7.add(r0, r5)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r7 = r4.iterator()     // Catch: java.lang.Throwable -> L3c
        L23:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L33
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L3c
            i8.v r0 = (i8.v) r0     // Catch: java.lang.Throwable -> L3c
            r0.getClass()     // Catch: java.lang.Throwable -> L3c
            goto L23
        L33:
            bh.d r7 = r2.f159403b     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap r7 = r7.f15223a     // Catch: java.lang.Throwable -> L3c
            r7.clear()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)
            return
        L3c:
            r7 = move-exception
            goto L45
        L3e:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            throw r7     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = move-exception
            goto L3e
        L42:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r7     // Catch: java.lang.Throwable -> L3c
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.k(b8.c):void");
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj2) {
            super("Failed to find any ModelLoaders registered for model class: " + obj2.getClass());
        }

        public NoModelLoaderAvailableException(Object obj2, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj2);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
