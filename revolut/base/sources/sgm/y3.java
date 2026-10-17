package sgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class y3 extends zgm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f263297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f263298b = new AtomicReference();

    public y3(Observable observable) {
        this.f263297a = observable;
    }

    @Override // zgm.a
    public final void c(igm.g gVar) {
        x3 x3Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f263298b;
            x3Var = (x3) atomicReference.get();
            if (x3Var != null && !x3Var.isDisposed()) {
                break;
            }
            x3 x3Var2 = new x3(atomicReference);
            while (!atomicReference.compareAndSet(x3Var, x3Var2)) {
                if (atomicReference.get() != x3Var) {
                    break;
                }
            }
            x3Var = x3Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = x3Var.f263271a;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            gVar.accept(x3Var);
            if (z) {
                this.f263297a.subscribe(x3Var);
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            throw ygm.g.f(th10);
        }
    }

    @Override // zgm.a
    public final void d() {
        AtomicReference atomicReference = this.f263298b;
        x3 x3Var = (x3) atomicReference.get();
        if (x3Var == null || !x3Var.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(x3Var, null) && atomicReference.get() == x3Var) {
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        x3 x3Var;
        w3[] w3VarArr;
        w3[] w3VarArr2;
        loop0: while (true) {
            AtomicReference atomicReference = this.f263298b;
            x3Var = (x3) atomicReference.get();
            if (x3Var != null) {
                break;
            }
            x3 x3Var2 = new x3(atomicReference);
            while (!atomicReference.compareAndSet(x3Var, x3Var2)) {
                if (atomicReference.get() != x3Var) {
                    break;
                }
            }
            x3Var = x3Var2;
            break loop0;
        }
        w3 w3Var = new w3(lVar, x3Var);
        lVar.onSubscribe(w3Var);
        do {
            w3VarArr = (w3[]) x3Var.get();
            if (w3VarArr == x3.f) {
                Throwable th10 = x3Var.d;
                if (th10 != null) {
                    lVar.onError(th10);
                    return;
                } else {
                    lVar.onComplete();
                    return;
                }
            }
            int length = w3VarArr.length;
            w3VarArr2 = new w3[length + 1];
            System.arraycopy(w3VarArr, 0, w3VarArr2, 0, length);
            w3VarArr2[length] = w3Var;
        } while (!x3Var.compareAndSet(w3VarArr, w3VarArr2));
        if (w3Var.isDisposed()) {
            x3Var.a(w3Var);
        }
    }
}
