package ihm;

import e8.q;
import efm.y;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object[] f161436m = new Object[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a[] f161437n = new a[0];
    public static final a[] o = new a[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f161438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f161439h;
    public final Lock i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lock f161440j;
    public final AtomicReference k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f161441l;

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.i = reentrantReadWriteLock.readLock();
        this.f161440j = reentrantReadWriteLock.writeLock();
        this.f161439h = new AtomicReference(f161437n);
        this.f161438g = new AtomicReference();
        this.k = new AtomicReference();
    }

    public static b e(Object obj2) {
        b bVar = new b();
        mfm.f.b(obj2, "defaultValue is null");
        bVar.f161438g.lazySet(obj2);
        return bVar;
    }

    public final Object f() {
        Object obj2 = this.f161438g.get();
        if (zfm.m.c(obj2) || (obj2 instanceof zfm.k)) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f161439h;
            a[] aVarArr2 = (a[]) atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr2[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f161437n;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // efm.y
    public final void onComplete() {
        if (v1.c.D(this.k, zfm.h.f322035a)) {
            zfm.m mVar = zfm.m.COMPLETE;
            AtomicReference atomicReference = this.f161439h;
            a[] aVarArr = o;
            a[] aVarArr2 = (a[]) atomicReference.getAndSet(aVarArr);
            if (aVarArr2 != aVarArr) {
                Lock lock = this.f161440j;
                lock.lock();
                this.f161441l++;
                this.f161438g.lazySet(mVar);
                lock.unlock();
            }
            for (a aVar : aVarArr2) {
                aVar.a(this.f161441l, mVar);
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        mfm.f.b(th10, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!v1.c.C(this.k, th10)) {
            mo3.a.m(th10);
            return;
        }
        zfm.k kVar = new zfm.k(th10);
        AtomicReference atomicReference = this.f161439h;
        a[] aVarArr = o;
        a[] aVarArr2 = (a[]) atomicReference.getAndSet(aVarArr);
        if (aVarArr2 != aVarArr) {
            Lock lock = this.f161440j;
            lock.lock();
            this.f161441l++;
            this.f161438g.lazySet(kVar);
            lock.unlock();
        }
        for (a aVar : aVarArr2) {
            aVar.a(this.f161441l, kVar);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        mfm.f.b(obj2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.k.get() != null) {
            return;
        }
        Lock lock = this.f161440j;
        lock.lock();
        this.f161441l++;
        this.f161438g.lazySet(obj2);
        lock.unlock();
        for (a aVar : (a[]) this.f161439h.get()) {
            aVar.a(this.f161441l, obj2);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (this.k.get() != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.r
    public final void subscribeActual(y yVar) {
        q qVar;
        a aVar = new a(yVar, this);
        yVar.onSubscribe(aVar);
        AtomicReference atomicReference = this.f161439h;
        while (true) {
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == o) {
                Throwable th10 = (Throwable) this.k.get();
                if (th10 == zfm.h.f322035a) {
                    yVar.onComplete();
                    return;
                } else {
                    yVar.onError(th10);
                    return;
                }
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.f161434g) {
                g(aVar);
                return;
            }
            if (aVar.f161434g) {
                return;
            }
            synchronized (aVar) {
                try {
                    if (aVar.f161434g) {
                        return;
                    }
                    if (aVar.f161433c) {
                        return;
                    }
                    b bVar = aVar.f161432b;
                    Lock lock = bVar.i;
                    lock.lock();
                    aVar.f161435h = bVar.f161441l;
                    Object obj2 = bVar.f161438g.get();
                    lock.unlock();
                    aVar.d = obj2 != null;
                    aVar.f161433c = true;
                    if (obj2 == null || aVar.test(obj2)) {
                        return;
                    }
                    while (!aVar.f161434g) {
                        synchronized (aVar) {
                            try {
                                qVar = aVar.e;
                                if (qVar == null) {
                                    aVar.d = false;
                                    return;
                                }
                                aVar.e = null;
                            } finally {
                            }
                        }
                        qVar.d(aVar);
                    }
                    return;
                } finally {
                }
            }
        }
    }
}
