package ngm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends CountDownLatch implements fgm.l, Future, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f215255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f215256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f215257c;

    public l() {
        super(1);
        this.f215257c = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        jgm.b bVar;
        while (true) {
            AtomicReference atomicReference = this.f215257c;
            Disposable disposable = (Disposable) atomicReference.get();
            if (disposable == this || disposable == (bVar = jgm.b.DISPOSED)) {
                return false;
            }
            while (!atomicReference.compareAndSet(disposable, bVar)) {
                if (atomicReference.get() != disposable) {
                    break;
                }
            }
            if (disposable != null) {
                disposable.dispose();
            }
            countDown();
            return true;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
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
        Throwable th10 = this.f215256b;
        if (th10 == null) {
            return this.f215255a;
        }
        throw new ExecutionException(th10);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return jgm.b.b((Disposable) this.f215257c.get());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f215255a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        AtomicReference atomicReference = this.f215257c;
        Disposable disposable = (Disposable) atomicReference.get();
        if (disposable == this || disposable == jgm.b.DISPOSED) {
            return;
        }
        while (!atomicReference.compareAndSet(disposable, this)) {
            if (atomicReference.get() != disposable) {
                return;
            }
        }
        countDown();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f215256b == null) {
            AtomicReference atomicReference = this.f215257c;
            Disposable disposable = (Disposable) atomicReference.get();
            if (disposable != this && disposable != jgm.b.DISPOSED) {
                while (!atomicReference.compareAndSet(disposable, this)) {
                    if (atomicReference.get() != disposable) {
                    }
                }
                this.f215256b = th10;
                countDown();
                return;
            }
        }
        jb3.l.v(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f215255a == null) {
            this.f215255a = obj2;
        } else {
            ((Disposable) this.f215257c.get()).dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.f215257c, disposable);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j2, timeUnit)) {
            throw new TimeoutException(ygm.g.e(j2, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th10 = this.f215256b;
            if (th10 == null) {
                return this.f215255a;
            }
            throw new ExecutionException(th10);
        }
        throw new CancellationException();
    }
}
