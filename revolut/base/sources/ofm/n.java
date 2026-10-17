package ofm;

import efm.f0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends CountDownLatch implements f0, Future, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f224936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f224937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f224938c;

    public n() {
        super(1);
        this.f224938c = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        lfm.d dVar;
        while (true) {
            AtomicReference atomicReference = this.f224938c;
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
        Throwable th10 = this.f224937b;
        if (th10 == null) {
            return this.f224936a;
        }
        throw new ExecutionException(th10);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return lfm.d.b((ifm.c) this.f224938c.get());
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        while (true) {
            AtomicReference atomicReference = this.f224938c;
            ifm.c cVar = (ifm.c) atomicReference.get();
            if (cVar == lfm.d.DISPOSED) {
                mo3.a.m(th10);
                return;
            }
            this.f224937b = th10;
            while (!atomicReference.compareAndSet(cVar, this)) {
                if (atomicReference.get() != cVar) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.f224938c, cVar);
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        AtomicReference atomicReference = this.f224938c;
        ifm.c cVar = (ifm.c) atomicReference.get();
        if (cVar == lfm.d.DISPOSED) {
            return;
        }
        this.f224936a = obj2;
        while (!atomicReference.compareAndSet(cVar, this) && atomicReference.get() == cVar) {
        }
        countDown();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j2, timeUnit)) {
            throw new TimeoutException(zfm.h.c(j2, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th10 = this.f224937b;
            if (th10 == null) {
                return this.f224936a;
            }
            throw new ExecutionException(th10);
        }
        throw new CancellationException();
    }
}
