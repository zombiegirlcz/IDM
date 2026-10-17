package tgm;

import fgm.p;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jb3.l;
import pgm.h0;
import sgm.g2;
import sgm.k2;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends AtomicReference implements SingleEmitter, Disposable, fgm.b, fgm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f271200b;

    public /* synthetic */ a(AtomicInteger atomicInteger, int i) {
        this.f271199a = i;
        this.f271200b = atomicInteger;
    }

    @Override // io.reactivex.rxjava3.core.SingleEmitter
    public void a(igm.f fVar) {
        jgm.b.d(this, new ggm.b(fVar, 1));
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f271199a) {
            case 0:
                jgm.b.a(this);
                break;
            case 1:
                jgm.b.a(this);
                break;
            case 2:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleEmitter, io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f271199a) {
        }
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.b
    public void onComplete() {
        switch (this.f271199a) {
            case 1:
                h0 h0Var = (h0) this.f271200b;
                h0Var.d.b(this);
                h0Var.onComplete();
                break;
            case 2:
                g2 g2Var = (g2) this.f271200b;
                g2Var.e.b(this);
                g2Var.onComplete();
                break;
            default:
                k2 k2Var = (k2) this.f271200b;
                AtomicInteger atomicInteger = k2Var.e;
                k2Var.d.b(this);
                if (k2Var.get() == 0) {
                    if (k2Var.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        bhm.i iVar = (bhm.i) k2Var.f262957h.get();
                        if (z && (iVar == null || iVar.isEmpty())) {
                            k2Var.f.e(k2Var.f262954b);
                            break;
                        } else if (k2Var.decrementAndGet() != 0) {
                            k2Var.a();
                            break;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (k2Var.getAndIncrement() == 0) {
                    k2Var.a();
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleEmitter, fgm.b, efm.f0
    public final void onError(Throwable th10) {
        Disposable disposable;
        switch (this.f271199a) {
            case 0:
                Throwable thB = th10 == null ? ygm.g.b("onError called with a null Throwable.") : th10;
                Object obj2 = get();
                jgm.b bVar = jgm.b.DISPOSED;
                if (obj2 == bVar || (disposable = (Disposable) getAndSet(bVar)) == bVar) {
                    l.v(th10);
                    return;
                }
                try {
                    ((p) this.f271200b).onError(thB);
                    if (disposable != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
            case 1:
                h0 h0Var = (h0) this.f271200b;
                h0Var.d.b(this);
                h0Var.onError(th10);
                return;
            case 2:
                g2 g2Var = (g2) this.f271200b;
                g2Var.e.b(this);
                g2Var.onError(th10);
                return;
            default:
                k2 k2Var = (k2) this.f271200b;
                CompositeDisposable compositeDisposable = k2Var.d;
                compositeDisposable.b(this);
                if (k2Var.f.a(th10)) {
                    if (!k2Var.f262955c) {
                        k2Var.i.dispose();
                        compositeDisposable.dispose();
                    }
                    k2Var.e.decrementAndGet();
                    if (k2Var.getAndIncrement() == 0) {
                        k2Var.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        switch (this.f271199a) {
            case 1:
                jgm.b.e(this, disposable);
                break;
            case 2:
                jgm.b.e(this, disposable);
                break;
            default:
                jgm.b.e(this, disposable);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // io.reactivex.rxjava3.core.SingleEmitter, fgm.e, fgm.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f271199a
            switch(r0) {
                case 0: goto L8e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f271200b
            sgm.k2 r0 = (sgm.k2) r0
            io.reactivex.rxjava3.disposables.CompositeDisposable r1 = r0.d
            r1.b(r4)
            int r1 = r0.get()
            if (r1 != 0) goto L4b
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L4b
            fgm.l r3 = r0.f262954b
            r3.onNext(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.e
            int r5 = r5.decrementAndGet()
            if (r5 != 0) goto L2a
            r1 = r2
        L2a:
            java.util.concurrent.atomic.AtomicReference r5 = r0.f262957h
            java.lang.Object r5 = r5.get()
            bhm.i r5 = (bhm.i) r5
            if (r1 == 0) goto L44
            if (r5 == 0) goto L3c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L44
        L3c:
            ygm.c r5 = r0.f
            fgm.l r0 = r0.f262954b
            r5.e(r0)
            goto L8a
        L44:
            int r5 = r0.decrementAndGet()
            if (r5 != 0) goto L87
            goto L8a
        L4b:
            java.util.concurrent.atomic.AtomicReference r1 = r0.f262957h
            java.lang.Object r2 = r1.get()
            bhm.i r2 = (bhm.i) r2
            if (r2 == 0) goto L57
        L55:
            r3 = r2
            goto L76
        L57:
            bhm.i r2 = new bhm.i
            int r3 = io.reactivex.rxjava3.core.Observable.bufferSize()
            r2.<init>(r3)
        L60:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r2)
            if (r3 == 0) goto L68
            goto L55
        L68:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L60
            java.lang.Object r1 = r1.get()
            r2 = r1
            bhm.i r2 = (bhm.i) r2
            goto L55
        L76:
            monitor-enter(r3)
            r3.offer(r5)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicInteger r5 = r0.e
            r5.decrementAndGet()
            int r5 = r0.getAndIncrement()
            if (r5 == 0) goto L87
            goto L8a
        L87:
            r0.a()
        L8a:
            return
        L8b:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8b
            throw r5
        L8e:
            java.lang.Object r0 = r4.f271200b
            fgm.p r0 = (fgm.p) r0
            java.lang.Object r1 = r4.get()
            jgm.b r2 = jgm.b.DISPOSED
            if (r1 == r2) goto Lbf
            java.lang.Object r1 = r4.getAndSet(r2)
            io.reactivex.rxjava3.disposables.Disposable r1 = (io.reactivex.rxjava3.disposables.Disposable) r1
            if (r1 == r2) goto Lbf
            if (r5 != 0) goto Lb0
            java.lang.String r5 = "onSuccess called with a null value."
            java.lang.NullPointerException r5 = ygm.g.b(r5)     // Catch: java.lang.Throwable -> Lae
            r0.onError(r5)     // Catch: java.lang.Throwable -> Lae
            goto Lb3
        Lae:
            r5 = move-exception
            goto Lb9
        Lb0:
            r0.onSuccess(r5)     // Catch: java.lang.Throwable -> Lae
        Lb3:
            if (r1 == 0) goto Lbf
            r1.dispose()
            goto Lbf
        Lb9:
            if (r1 == 0) goto Lbe
            r1.dispose()
        Lbe:
            throw r5
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tgm.a.onSuccess(java.lang.Object):void");
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f271199a) {
            case 0:
                return j6.a.r(a.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }

    public a(p pVar) {
        this.f271199a = 0;
        this.f271200b = pVar;
    }
}
