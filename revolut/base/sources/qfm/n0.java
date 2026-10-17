package qfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends AtomicReference implements efm.d, ifm.c, efm.l, efm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f245484b;

    public /* synthetic */ n0(AtomicInteger atomicInteger, int i) {
        this.f245483a = i;
        this.f245484b = atomicInteger;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(java.lang.Object r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f245484b
            qfm.s0 r0 = (qfm.s0) r0
            ifm.b r1 = r0.e
            r1.b(r6)
            int r1 = r0.get()
            if (r1 != 0) goto L81
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L81
            java.util.concurrent.atomic.AtomicInteger r3 = r0.f
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L20
            r1 = r2
        L20:
            java.util.concurrent.atomic.AtomicLong r2 = r0.d
            long r2 = r2.get()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L6e
            dom.a r2 = r0.f245532b
            r2.onNext(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r0.i
            java.lang.Object r7 = r7.get()
            vfm.c r7 = (vfm.c) r7
            if (r1 == 0) goto L5a
            if (r7 == 0) goto L43
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5a
        L43:
            zfm.c r7 = r0.f245534g
            r7.getClass()
            java.lang.Throwable r7 = zfm.h.b(r7)
            if (r7 == 0) goto L54
            dom.a r0 = r0.f245532b
            r0.onError(r7)
            return
        L54:
            dom.a r7 = r0.f245532b
            r7.onComplete()
            return
        L5a:
            java.util.concurrent.atomic.AtomicLong r7 = r0.d
            r1 = 1
            com.bumptech.glide.d.A(r7, r1)
            int r7 = r0.f245533c
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r3) goto L77
            dom.b r7 = r0.f245536j
            r7.a(r1)
            goto L77
        L6e:
            vfm.c r1 = r0.f()
            monitor-enter(r1)
            r1.offer(r7)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
        L77:
            int r7 = r0.decrementAndGet()
            if (r7 != 0) goto L96
            goto L95
        L7e:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            throw r7
        L81:
            vfm.c r1 = r0.f()
            monitor-enter(r1)
            r1.offer(r7)     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.atomic.AtomicInteger r7 = r0.f
            r7.decrementAndGet()
            int r7 = r0.getAndIncrement()
            if (r7 == 0) goto L96
        L95:
            return
        L96:
            r0.c()
            return
        L9a:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qfm.n0.a(java.lang.Object):void");
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f245483a) {
            case 0:
                lfm.d.a(this);
                break;
            case 1:
                lfm.d.a(this);
                break;
            case 2:
                lfm.d.a(this);
                break;
            case 3:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f245483a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.d
    public void onComplete() {
        switch (this.f245483a) {
            case 0:
                o0 o0Var = (o0) this.f245484b;
                o0Var.d.b(this);
                o0Var.onComplete();
                break;
            case 1:
                s0 s0Var = (s0) this.f245484b;
                int i = s0Var.f245533c;
                dom.a aVar = s0Var.f245532b;
                AtomicInteger atomicInteger = s0Var.f;
                s0Var.e.b(this);
                if (s0Var.get() == 0) {
                    if (s0Var.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        vfm.c cVar = (vfm.c) s0Var.i.get();
                        if (z && (cVar == null || cVar.isEmpty())) {
                            zfm.c cVar2 = s0Var.f245534g;
                            cVar2.getClass();
                            Throwable thB = zfm.h.b(cVar2);
                            if (thB == null) {
                                aVar.onComplete();
                            } else {
                                aVar.onError(thB);
                            }
                            break;
                        } else {
                            if (i != Integer.MAX_VALUE) {
                                s0Var.f245536j.a(1L);
                            }
                            if (s0Var.decrementAndGet() != 0) {
                                s0Var.c();
                                break;
                            }
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (i != Integer.MAX_VALUE) {
                    s0Var.f245536j.a(1L);
                }
                if (s0Var.getAndIncrement() == 0) {
                    s0Var.c();
                }
                break;
            default:
                tfm.i2 i2Var = (tfm.i2) this.f245484b;
                i2Var.e.b(this);
                i2Var.onComplete();
                break;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f245483a) {
            case 0:
                o0 o0Var = (o0) this.f245484b;
                o0Var.d.b(this);
                o0Var.onError(th10);
                break;
            case 1:
                s0 s0Var = (s0) this.f245484b;
                ifm.b bVar = s0Var.e;
                bVar.b(this);
                zfm.c cVar = s0Var.f245534g;
                cVar.getClass();
                if (!zfm.h.a(cVar, th10)) {
                    mo3.a.m(th10);
                } else {
                    s0Var.f245536j.cancel();
                    bVar.dispose();
                    s0Var.f.decrementAndGet();
                    if (s0Var.getAndIncrement() == 0) {
                        s0Var.c();
                    }
                }
                break;
            case 2:
                s0 s0Var2 = (s0) this.f245484b;
                ifm.b bVar2 = s0Var2.e;
                bVar2.b(this);
                zfm.c cVar2 = s0Var2.f245534g;
                cVar2.getClass();
                if (!zfm.h.a(cVar2, th10)) {
                    mo3.a.m(th10);
                } else {
                    s0Var2.f245536j.cancel();
                    bVar2.dispose();
                    s0Var2.f.decrementAndGet();
                    if (s0Var2.getAndIncrement() == 0) {
                        s0Var2.c();
                    }
                }
                break;
            case 3:
                tfm.i2 i2Var = (tfm.i2) this.f245484b;
                i2Var.e.b(this);
                i2Var.onError(th10);
                break;
            default:
                tfm.m2 m2Var = (tfm.m2) this.f245484b;
                ifm.b bVar3 = m2Var.d;
                bVar3.b(this);
                zfm.c cVar3 = m2Var.f;
                cVar3.getClass();
                if (!zfm.h.a(cVar3, th10)) {
                    mo3.a.m(th10);
                } else {
                    if (!m2Var.f270638c) {
                        m2Var.i.dispose();
                        bVar3.dispose();
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
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f245483a) {
            case 0:
                lfm.d.e(this, cVar);
                break;
            case 1:
                lfm.d.e(this, cVar);
                break;
            case 2:
                lfm.d.e(this, cVar);
                break;
            case 3:
                lfm.d.e(this, cVar);
                break;
            default:
                lfm.d.e(this, cVar);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
    @Override // efm.l, efm.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qfm.n0.onSuccess(java.lang.Object):void");
    }
}
