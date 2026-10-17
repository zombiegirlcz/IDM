package pfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qfm.q0;
import tfm.m2;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends AtomicReference implements efm.c, ifm.c, efm.d, efm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f235729b;

    public /* synthetic */ g(AtomicInteger atomicInteger, int i) {
        this.f235728a = i;
        this.f235729b = atomicInteger;
    }

    public boolean a(Throwable th10) {
        ifm.c cVar;
        if (th10 == null) {
            th10 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj2 = get();
        lfm.d dVar = lfm.d.DISPOSED;
        if (obj2 == dVar || (cVar = (ifm.c) getAndSet(dVar)) == dVar) {
            return false;
        }
        try {
            ((efm.d) this.f235729b).onError(th10);
        } finally {
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f235728a) {
            case 0:
                lfm.d.a(this);
                break;
            case 1:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f235728a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.d
    public final void onComplete() {
        ifm.c cVar;
        switch (this.f235728a) {
            case 0:
                Object obj2 = get();
                lfm.d dVar = lfm.d.DISPOSED;
                if (obj2 == dVar || (cVar = (ifm.c) getAndSet(dVar)) == dVar) {
                    return;
                }
                try {
                    ((efm.d) this.f235729b).onComplete();
                    if (cVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            case 1:
                q0 q0Var = (q0) this.f235729b;
                q0Var.d.b(this);
                q0Var.onComplete();
                return;
            default:
                m2 m2Var = (m2) this.f235729b;
                efm.y yVar = m2Var.f270637b;
                AtomicInteger atomicInteger = m2Var.e;
                m2Var.d.b(this);
                if (m2Var.get() == 0) {
                    if (m2Var.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        vfm.c cVar2 = (vfm.c) m2Var.f270640h.get();
                        if (!z || (cVar2 != null && !cVar2.isEmpty())) {
                            if (m2Var.decrementAndGet() == 0) {
                                return;
                            }
                            m2Var.a();
                            return;
                        }
                        zfm.c cVar3 = m2Var.f;
                        cVar3.getClass();
                        Throwable thB = zfm.h.b(cVar3);
                        if (thB != null) {
                            yVar.onError(thB);
                            return;
                        } else {
                            yVar.onComplete();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (m2Var.getAndIncrement() == 0) {
                    m2Var.a();
                    return;
                }
                return;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f235728a) {
            case 0:
                if (!a(th10)) {
                    mo3.a.m(th10);
                }
                break;
            case 1:
                q0 q0Var = (q0) this.f235729b;
                q0Var.d.b(this);
                q0Var.onError(th10);
                break;
            default:
                m2 m2Var = (m2) this.f235729b;
                ifm.b bVar = m2Var.d;
                bVar.b(this);
                zfm.c cVar = m2Var.f;
                cVar.getClass();
                if (!zfm.h.a(cVar, th10)) {
                    mo3.a.m(th10);
                } else {
                    if (!m2Var.f270638c) {
                        m2Var.i.dispose();
                        bVar.dispose();
                    }
                    m2Var.e.decrementAndGet();
                    if (m2Var.getAndIncrement() == 0) {
                        m2Var.a();
                    }
                }
                break;
        }
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        switch (this.f235728a) {
            case 1:
                lfm.d.e(this, cVar);
                break;
            default:
                lfm.d.e(this, cVar);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // efm.l, efm.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f235729b
            tfm.m2 r0 = (tfm.m2) r0
            ifm.b r1 = r0.d
            r1.b(r4)
            int r1 = r0.get()
            if (r1 != 0) goto L55
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L55
            efm.y r3 = r0.f270637b
            r3.onNext(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.e
            int r5 = r5.decrementAndGet()
            if (r5 != 0) goto L25
            r1 = r2
        L25:
            java.util.concurrent.atomic.AtomicReference r5 = r0.f270640h
            java.lang.Object r5 = r5.get()
            vfm.c r5 = (vfm.c) r5
            if (r1 == 0) goto L4e
            if (r5 == 0) goto L37
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4e
        L37:
            zfm.c r5 = r0.f
            r5.getClass()
            java.lang.Throwable r5 = zfm.h.b(r5)
            if (r5 == 0) goto L48
            efm.y r0 = r0.f270637b
            r0.onError(r5)
            return
        L48:
            efm.y r5 = r0.f270637b
            r5.onComplete()
            return
        L4e:
            int r5 = r0.decrementAndGet()
            if (r5 != 0) goto L80
            goto L7f
        L55:
            java.util.concurrent.atomic.AtomicReference r1 = r0.f270640h
        L57:
            java.lang.Object r2 = r1.get()
            vfm.c r2 = (vfm.c) r2
            if (r2 == 0) goto L60
            goto L6f
        L60:
            vfm.c r2 = new vfm.c
            int r3 = efm.r.bufferSize()
            r2.<init>(r3)
            boolean r3 = t61.a.D(r1, r2)
            if (r3 == 0) goto L57
        L6f:
            monitor-enter(r2)
            r2.offer(r5)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicInteger r5 = r0.e
            r5.decrementAndGet()
            int r5 = r0.getAndIncrement()
            if (r5 == 0) goto L80
        L7f:
            return
        L80:
            r0.a()
            return
        L84:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pfm.g.onSuccess(java.lang.Object):void");
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f235728a) {
            case 0:
                return j6.a.r(g.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }

    public g(efm.d dVar) {
        this.f235728a = 0;
        this.f235729b = dVar;
    }
}
