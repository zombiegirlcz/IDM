package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends AtomicReference implements fgm.l, Iterator, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bhm.i f262709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f262710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Condition f262711c;
    public volatile boolean d;
    public volatile Throwable e;

    public b(int i) {
        this.f262709a = new bhm.i(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f262710b = reentrantLock;
        this.f262711c = reentrantLock.newCondition();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f262710b;
        reentrantLock.lock();
        try {
            this.f262711c.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this);
        a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (!isDisposed()) {
            boolean z = this.d;
            boolean zIsEmpty = this.f262709a.isEmpty();
            if (z) {
                Throwable th10 = this.e;
                if (th10 != null) {
                    throw ygm.g.f(th10);
                }
                if (zIsEmpty) {
                    return false;
                }
            }
            if (!zIsEmpty) {
                return true;
            }
            try {
                this.f262710b.lock();
                while (!this.d && this.f262709a.isEmpty() && !isDisposed()) {
                    try {
                        this.f262711c.await();
                    } catch (Throwable th11) {
                        this.f262710b.unlock();
                        throw th11;
                    }
                }
                this.f262710b.unlock();
            } catch (InterruptedException e) {
                jgm.b.a(this);
                a();
                throw ygm.g.f(e);
            }
        }
        Throwable th12 = this.e;
        if (th12 == null) {
            return false;
        }
        throw ygm.g.f(th12);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) get());
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            return this.f262709a.poll();
        }
        throw new NoSuchElementException();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.d = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.e = th10;
        this.d = true;
        a();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f262709a.offer(obj2);
        a();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
