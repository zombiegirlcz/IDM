package tfm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReference implements efm.y, Iterator, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vfm.c f270352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f270353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Condition f270354c;
    public volatile boolean d;
    public volatile Throwable e;

    public b(int i) {
        this.f270352a = new vfm.c(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f270353b = reentrantLock;
        this.f270354c = reentrantLock.newCondition();
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f270353b;
        reentrantLock.lock();
        try {
            this.f270354c.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
        a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (!isDisposed()) {
            boolean z = this.d;
            boolean zIsEmpty = this.f270352a.isEmpty();
            if (z) {
                Throwable th10 = this.e;
                if (th10 != null) {
                    throw zfm.h.d(th10);
                }
                if (zIsEmpty) {
                    return false;
                }
            }
            if (!zIsEmpty) {
                return true;
            }
            try {
                this.f270353b.lock();
                while (!this.d && this.f270352a.isEmpty() && !isDisposed()) {
                    try {
                        this.f270354c.await();
                    } catch (Throwable th11) {
                        this.f270353b.unlock();
                        throw th11;
                    }
                }
                this.f270353b.unlock();
            } catch (InterruptedException e) {
                lfm.d.a(this);
                a();
                throw zfm.h.d(e);
            }
        }
        Throwable th12 = this.e;
        if (th12 == null) {
            return false;
        }
        throw zfm.h.d(th12);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            return this.f270352a.poll();
        }
        throw new NoSuchElementException();
    }

    @Override // efm.y
    public final void onComplete() {
        this.d = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.e = th10;
        this.d = true;
        a();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270352a.offer(obj2);
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
