package io.reactivex.rxjava3.subjects;

import fhm.a;
import fhm.d;
import io.grpc.okhttp.internal.n;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q75.t;
import ygm.g;
import ygm.j;
import ygm.l;

/* JADX INFO: loaded from: classes14.dex */
public final class BehaviorSubject extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a[] f163124g = new a[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a[] f163125h = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f163126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f163127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f163128c;
    public final Lock d;
    public final AtomicReference e;
    public long f;

    public BehaviorSubject(Object obj2) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f163128c = reentrantReadWriteLock.readLock();
        this.d = reentrantReadWriteLock.writeLock();
        this.f163127b = new AtomicReference(f163124g);
        this.f163126a = new AtomicReference(obj2);
        this.e = new AtomicReference();
    }

    public static BehaviorSubject c() {
        return new BehaviorSubject(null);
    }

    public static BehaviorSubject d(Object obj2) {
        Objects.requireNonNull(obj2, "defaultValue is null");
        return new BehaviorSubject(obj2);
    }

    public final Object e() {
        Object obj2 = this.f163126a.get();
        if (obj2 == l.COMPLETE || (obj2 instanceof j)) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.f163127b;
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
                aVarArr = f163124g;
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

    @Override // fgm.l
    public final void onComplete() {
        AtomicReference atomicReference;
        t tVar = g.f313672a;
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(null, tVar)) {
                l lVar = l.COMPLETE;
                Lock lock = this.d;
                lock.lock();
                this.f++;
                this.f163126a.lazySet(lVar);
                lock.unlock();
                for (a aVar : (a[]) this.f163127b.getAndSet(f163125h)) {
                    aVar.a(this.f, lVar);
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        AtomicReference atomicReference;
        g.c(th10, "onError called with a null Throwable.");
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(null, th10)) {
                j jVar = new j(th10);
                Lock lock = this.d;
                lock.lock();
                this.f++;
                this.f163126a.lazySet(jVar);
                lock.unlock();
                for (a aVar : (a[]) this.f163127b.getAndSet(f163125h)) {
                    aVar.a(this.f, jVar);
                }
                return;
            }
        } while (atomicReference.get() == null);
        jb3.l.v(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        g.c(obj2, "onNext called with a null value.");
        if (this.e.get() != null) {
            return;
        }
        Lock lock = this.d;
        lock.lock();
        this.f++;
        this.f163126a.lazySet(obj2);
        lock.unlock();
        for (a aVar : (a[]) this.f163127b.get()) {
            aVar.a(this.f, obj2);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (this.e.get() != null) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        n nVar;
        a aVar = new a(lVar, this);
        lVar.onSubscribe(aVar);
        AtomicReference atomicReference = this.f163127b;
        while (true) {
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == f163125h) {
                Throwable th10 = (Throwable) this.e.get();
                if (th10 == g.f313672a) {
                    lVar.onComplete();
                    return;
                } else {
                    lVar.onError(th10);
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
            if (aVar.f135266g) {
                f(aVar);
                return;
            }
            if (aVar.f135266g) {
                return;
            }
            synchronized (aVar) {
                try {
                    if (aVar.f135266g) {
                        return;
                    }
                    if (aVar.f135265c) {
                        return;
                    }
                    BehaviorSubject behaviorSubject = aVar.f135264b;
                    Lock lock = behaviorSubject.f163128c;
                    lock.lock();
                    aVar.f135267h = behaviorSubject.f;
                    Object obj2 = behaviorSubject.f163126a.get();
                    lock.unlock();
                    aVar.d = obj2 != null;
                    aVar.f135265c = true;
                    if (obj2 == null || aVar.test(obj2)) {
                        return;
                    }
                    while (!aVar.f135266g) {
                        synchronized (aVar) {
                            try {
                                nVar = aVar.e;
                                if (nVar == null) {
                                    aVar.d = false;
                                    return;
                                }
                                aVar.e = null;
                            } finally {
                            }
                        }
                        nVar.e(aVar);
                    }
                    return;
                } finally {
                }
            }
        }
    }
}
