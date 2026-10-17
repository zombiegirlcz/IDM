package ihm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends efm.b implements efm.d {
    public static final c[] d = new c[0];
    public static final c[] e = new c[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f161445c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f161444b = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f161443a = new AtomicReference(d);

    public static d F() {
        return new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(c cVar) {
        c[] cVarArr;
        while (true) {
            AtomicReference atomicReference = this.f161443a;
            c[] cVarArr2 = (c[]) atomicReference.get();
            int length = cVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cVarArr2[i] == cVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cVarArr = d;
            } else {
                c[] cVarArr3 = new c[length - 1];
                System.arraycopy(cVarArr2, 0, cVarArr3, 0, i);
                System.arraycopy(cVarArr2, i + 1, cVarArr3, i, (length - i) - 1);
                cVarArr = cVarArr3;
            }
            while (!atomicReference.compareAndSet(cVarArr2, cVarArr)) {
                if (atomicReference.get() != cVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // efm.d
    public final void onComplete() {
        if (this.f161444b.compareAndSet(false, true)) {
            for (c cVar : (c[]) this.f161443a.getAndSet(e)) {
                cVar.f161442a.onComplete();
            }
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        mfm.f.b(th10, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f161444b.compareAndSet(false, true)) {
            mo3.a.m(th10);
            return;
        }
        this.f161445c = th10;
        for (c cVar : (c[]) this.f161443a.getAndSet(e)) {
            cVar.f161442a.onError(th10);
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        if (this.f161443a.get() == e) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.b
    public final void x(efm.d dVar) {
        c cVar = new c(dVar, this);
        dVar.onSubscribe(cVar);
        while (true) {
            AtomicReference atomicReference = this.f161443a;
            c[] cVarArr = (c[]) atomicReference.get();
            if (cVarArr == e) {
                Throwable th10 = this.f161445c;
                if (th10 != null) {
                    dVar.onError(th10);
                    return;
                } else {
                    dVar.onComplete();
                    return;
                }
            }
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            while (!atomicReference.compareAndSet(cVarArr, cVarArr2)) {
                if (atomicReference.get() != cVarArr) {
                    break;
                }
            }
            if (cVar.isDisposed()) {
                G(cVar);
                return;
            }
            return;
        }
    }
}
