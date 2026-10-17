package ihm;

import efm.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends k {
    public static final e[] i = new e[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e[] f161448j = new e[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f161449g = new AtomicReference(f161448j);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f161450h;

    public final boolean e() {
        return ((e[]) this.f161449g.get()).length != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(e eVar) {
        e[] eVarArr;
        while (true) {
            AtomicReference atomicReference = this.f161449g;
            e[] eVarArr2 = (e[]) atomicReference.get();
            if (eVarArr2 == i || eVarArr2 == (eVarArr = f161448j)) {
                return;
            }
            int length = eVarArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (eVarArr2[i2] == eVar) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length != 1) {
                eVarArr = new e[length - 1];
                System.arraycopy(eVarArr2, 0, eVarArr, 0, i2);
                System.arraycopy(eVarArr2, i2 + 1, eVarArr, i2, (length - i2) - 1);
            }
            while (!atomicReference.compareAndSet(eVarArr2, eVarArr)) {
                if (atomicReference.get() != eVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // efm.y
    public final void onComplete() {
        AtomicReference atomicReference = this.f161449g;
        Object obj2 = atomicReference.get();
        Object obj3 = i;
        if (obj2 == obj3) {
            return;
        }
        e[] eVarArr = (e[]) atomicReference.getAndSet(obj3);
        for (e eVar : eVarArr) {
            if (!eVar.get()) {
                eVar.f161446a.onComplete();
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        mfm.f.b(th10, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f161449g;
        Object obj2 = atomicReference.get();
        Object obj3 = i;
        if (obj2 == obj3) {
            mo3.a.m(th10);
            return;
        }
        this.f161450h = th10;
        e[] eVarArr = (e[]) atomicReference.getAndSet(obj3);
        for (e eVar : eVarArr) {
            if (eVar.get()) {
                mo3.a.m(th10);
            } else {
                eVar.f161446a.onError(th10);
            }
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        mfm.f.b(obj2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (e eVar : (e[]) this.f161449g.get()) {
            if (!eVar.get()) {
                eVar.f161446a.onNext(obj2);
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (this.f161449g.get() == i) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.r
    public final void subscribeActual(y yVar) {
        e eVar = new e(yVar, this);
        yVar.onSubscribe(eVar);
        while (true) {
            AtomicReference atomicReference = this.f161449g;
            e[] eVarArr = (e[]) atomicReference.get();
            if (eVarArr == i) {
                Throwable th10 = this.f161450h;
                if (th10 != null) {
                    yVar.onError(th10);
                    return;
                } else {
                    yVar.onComplete();
                    return;
                }
            }
            int length = eVarArr.length;
            e[] eVarArr2 = new e[length + 1];
            System.arraycopy(eVarArr, 0, eVarArr2, 0, length);
            eVarArr2[length] = eVar;
            while (!atomicReference.compareAndSet(eVarArr, eVarArr2)) {
                if (atomicReference.get() != eVarArr) {
                    break;
                }
            }
            if (eVar.get()) {
                f(eVar);
                return;
            }
            return;
        }
    }
}
