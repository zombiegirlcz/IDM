package com.fasterxml.jackson.core;

import ch.qos.logback.core.CoreConstants;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public class e extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f26165g = d.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f26166h = j.a();
    public static final int i = g.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f9.i f26167j = j9.f.f172257h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient h9.b f26168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26170c;
    public final int d;
    public final f9.i e;
    public final char f;

    public e(k9.n nVar) {
        System.currentTimeMillis();
        new AtomicReference(new r39.a());
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f26168a = new h9.b((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        this.f26169b = f26165g;
        this.f26170c = f26166h;
        this.d = i;
        this.e = f26167j;
        this.f = CoreConstants.DOUBLE_QUOTE_CHAR;
    }

    public f9.d c(f9.c cVar, boolean z) {
        j9.a aVarD = d();
        f9.d dVar = new f9.d();
        dVar.d = aVarD;
        dVar.f132797c = cVar;
        dVar.f132795a = cVar.f132792a;
        dVar.f132796b = z;
        return dVar;
    }

    public final j9.a d() {
        SoftReference softReference;
        if ((d.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.getMask() & this.f26169b) == 0) {
            return new j9.a();
        }
        ThreadLocal threadLocal = j9.b.f172249b;
        SoftReference softReference2 = (SoftReference) threadLocal.get();
        j9.a aVar = softReference2 == null ? null : (j9.a) softReference2.get();
        if (aVar == null) {
            aVar = new j9.a();
            a61.a aVar2 = j9.b.f172248a;
            if (aVar2 != null) {
                ReferenceQueue referenceQueue = (ReferenceQueue) aVar2.f1532c;
                softReference = new SoftReference(aVar, referenceQueue);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar2.f1531b;
                concurrentHashMap.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    concurrentHashMap.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(aVar);
            }
            threadLocal.set(softReference);
        }
        return aVar;
    }

    public e() {
        this(null);
    }
}
