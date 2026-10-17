package io.reactivex.rxjava3.subjects;

import fhm.b;
import fhm.d;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import jb3.l;
import ygm.g;

/* JADX INFO: loaded from: classes14.dex */
public final class PublishSubject extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b[] f163129c = new b[0];
    public static final b[] d = new b[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f163130a = new AtomicReference(d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f163131b;

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(b bVar) {
        b[] bVarArr;
        while (true) {
            AtomicReference atomicReference = this.f163130a;
            b[] bVarArr2 = (b[]) atomicReference.get();
            if (bVarArr2 == f163129c || bVarArr2 == (bVarArr = d)) {
                return;
            }
            int length = bVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (bVarArr2[i] == bVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                bVarArr = new b[length - 1];
                System.arraycopy(bVarArr2, 0, bVarArr, 0, i);
                System.arraycopy(bVarArr2, i + 1, bVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(bVarArr2, bVarArr)) {
                if (atomicReference.get() != bVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        AtomicReference atomicReference = this.f163130a;
        Object obj2 = atomicReference.get();
        Object obj3 = f163129c;
        if (obj2 == obj3) {
            return;
        }
        b[] bVarArr = (b[]) atomicReference.getAndSet(obj3);
        for (b bVar : bVarArr) {
            if (!bVar.get()) {
                bVar.f135268a.onComplete();
            }
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        g.c(th10, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.f163130a;
        Object obj2 = atomicReference.get();
        Object obj3 = f163129c;
        if (obj2 == obj3) {
            l.v(th10);
            return;
        }
        this.f163131b = th10;
        b[] bVarArr = (b[]) atomicReference.getAndSet(obj3);
        for (b bVar : bVarArr) {
            if (bVar.get()) {
                l.v(th10);
            } else {
                bVar.f135268a.onError(th10);
            }
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        g.c(obj2, "onNext called with a null value.");
        for (b bVar : (b[]) this.f163130a.get()) {
            if (!bVar.get()) {
                bVar.f135268a.onNext(obj2);
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (this.f163130a.get() == f163129c) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        b bVar = new b(lVar, this);
        lVar.onSubscribe(bVar);
        while (true) {
            AtomicReference atomicReference = this.f163130a;
            b[] bVarArr = (b[]) atomicReference.get();
            if (bVarArr == f163129c) {
                Throwable th10 = this.f163131b;
                if (th10 != null) {
                    lVar.onError(th10);
                    return;
                } else {
                    lVar.onComplete();
                    return;
                }
            }
            int length = bVarArr.length;
            b[] bVarArr2 = new b[length + 1];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
            while (!atomicReference.compareAndSet(bVarArr, bVarArr2)) {
                if (atomicReference.get() != bVarArr) {
                    break;
                }
            }
            if (bVar.get()) {
                c(bVar);
                return;
            }
            return;
        }
    }
}
