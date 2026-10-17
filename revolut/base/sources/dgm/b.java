package dgm;

import e8.q;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import zfm.k;
import zfm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f114718h = new Object[0];
    public static final a[] i = new a[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a[] f114719j = new a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f114720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f114721c;
    public final Lock d;
    public final AtomicReference e = new AtomicReference();
    public final AtomicReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f114722g;

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f114721c = reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.f114720b = new AtomicReference(i);
        this.f = new AtomicReference();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (this.f.get() != null) {
            bVar.cancel();
        } else {
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        q qVar;
        a aVar2 = new a(aVar, this);
        aVar.e(aVar2);
        AtomicReference atomicReference = this.f114720b;
        do {
            aVarArr = (a[]) atomicReference.get();
            if (aVarArr == f114719j) {
                Throwable th10 = (Throwable) this.f.get();
                if (th10 == zfm.h.f322035a) {
                    aVar.onComplete();
                    return;
                } else {
                    aVar.onError(th10);
                    return;
                }
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar2;
        } while (!t61.a.B(atomicReference, aVarArr, aVarArr2));
        if (aVar2.f114716g) {
            t(aVar2);
            return;
        }
        if (aVar2.f114716g) {
            return;
        }
        synchronized (aVar2) {
            try {
                if (aVar2.f114716g) {
                    return;
                }
                if (aVar2.f114715c) {
                    return;
                }
                b bVar = aVar2.f114714b;
                Lock lock = bVar.f114721c;
                lock.lock();
                aVar2.f114717h = bVar.f114722g;
                Object obj2 = bVar.e.get();
                lock.unlock();
                aVar2.d = obj2 != null;
                aVar2.f114715c = true;
                if (obj2 == null || aVar2.test(obj2)) {
                    return;
                }
                while (!aVar2.f114716g) {
                    synchronized (aVar2) {
                        try {
                            qVar = aVar2.e;
                            if (qVar == null) {
                                aVar2.d = false;
                                return;
                            }
                            aVar2.e = null;
                        } finally {
                        }
                    }
                    qVar.d(aVar2);
                }
            } finally {
            }
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (v1.c.D(this.f, zfm.h.f322035a)) {
            m mVar = m.COMPLETE;
            AtomicReference atomicReference = this.f114720b;
            a[] aVarArr = (a[]) atomicReference.get();
            a[] aVarArr2 = f114719j;
            if (aVarArr != aVarArr2 && (aVarArr = (a[]) atomicReference.getAndSet(aVarArr2)) != aVarArr2) {
                Lock lock = this.d;
                lock.lock();
                this.f114722g++;
                this.e.lazySet(mVar);
                lock.unlock();
            }
            for (a aVar : aVarArr) {
                aVar.b(this.f114722g, mVar);
            }
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        mfm.f.b(th10, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!v1.c.C(this.f, th10)) {
            mo3.a.m(th10);
            return;
        }
        k kVar = new k(th10);
        AtomicReference atomicReference = this.f114720b;
        a[] aVarArr = (a[]) atomicReference.get();
        a[] aVarArr2 = f114719j;
        if (aVarArr != aVarArr2 && (aVarArr = (a[]) atomicReference.getAndSet(aVarArr2)) != aVarArr2) {
            Lock lock = this.d;
            lock.lock();
            this.f114722g++;
            this.e.lazySet(kVar);
            lock.unlock();
        }
        for (a aVar : aVarArr) {
            aVar.b(this.f114722g, kVar);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        mfm.f.b(obj2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f.get() != null) {
            return;
        }
        Lock lock = this.d;
        lock.lock();
        this.f114722g++;
        this.e.lazySet(obj2);
        lock.unlock();
        for (a aVar : (a[]) this.f114720b.get()) {
            aVar.b(this.f114722g, obj2);
        }
    }

    public final void t(a aVar) {
        AtomicReference atomicReference;
        a[] aVarArr;
        a[] aVarArr2;
        do {
            atomicReference = this.f114720b;
            aVarArr = (a[]) atomicReference.get();
            int length = aVarArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (aVarArr[i2] == aVar) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                aVarArr2 = i;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i2);
                System.arraycopy(aVarArr, i2 + 1, aVarArr3, i2, (length - i2) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!t61.a.B(atomicReference, aVarArr, aVarArr2));
    }
}
