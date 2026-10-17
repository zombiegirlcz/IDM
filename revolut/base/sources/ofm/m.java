package ofm;

import efm.y;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends CountDownLatch implements y, Future, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f224933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f224934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f224935c;

    public m() {
        super(1);
        this.f224935c = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        lfm.d dVar;
        while (true) {
            AtomicReference atomicReference = this.f224935c;
            ifm.c cVar = (ifm.c) atomicReference.get();
            if (cVar == this || cVar == (dVar = lfm.d.DISPOSED)) {
                return false;
            }
            while (!atomicReference.compareAndSet(cVar, dVar)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            if (cVar != null) {
                cVar.dispose();
            }
            countDown();
            return true;
        }
    }

    @Override // ifm.c
    public final void dispose() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th10 = this.f224934b;
        if (th10 == null) {
            return this.f224933a;
        }
        throw new ExecutionException(th10);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return lfm.d.b((ifm.c) this.f224935c.get());
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f224933a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while (true) {
            AtomicReference atomicReference = this.f224935c;
            ifm.c cVar = (ifm.c) atomicReference.get();
            if (cVar == this || cVar == lfm.d.DISPOSED) {
                return;
            }
            while (!atomicReference.compareAndSet(cVar, this)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        mo3.a.m(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        return;
     */
    @Override // efm.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            java.lang.Throwable r0 = r3.f224934b
            if (r0 != 0) goto L2a
            r3.f224934b = r4
        L6:
            java.util.concurrent.atomic.AtomicReference r0 = r3.f224935c
            java.lang.Object r1 = r0.get()
            ifm.c r1 = (ifm.c) r1
            if (r1 == r3) goto L26
            lfm.d r2 = lfm.d.DISPOSED
            if (r1 != r2) goto L15
            goto L26
        L15:
            boolean r2 = r0.compareAndSet(r1, r3)
            if (r2 == 0) goto L1f
            r3.countDown()
            return
        L1f:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L15
            goto L6
        L26:
            mo3.a.m(r4)
            return
        L2a:
            mo3.a.m(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ofm.m.onError(java.lang.Throwable):void");
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f224933a == null) {
            this.f224933a = obj2;
        } else {
            ((ifm.c) this.f224935c.get()).dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.f224935c, cVar);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j2, timeUnit)) {
            throw new TimeoutException(zfm.h.c(j2, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th10 = this.f224934b;
            if (th10 == null) {
                return this.f224933a;
            }
            throw new ExecutionException(th10);
        }
        throw new CancellationException();
    }
}
