package sgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class w4 extends zgm.a {
    public static final nd.p e = new nd.p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f263246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f263247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4 f263248c;
    public final r4 d;

    public w4(r4 r4Var, Observable observable, AtomicReference atomicReference, l4 l4Var) {
        this.d = r4Var;
        this.f263246a = observable;
        this.f263247b = atomicReference;
        this.f263248c = l4Var;
    }

    public static w4 e(Observable observable, l4 l4Var) {
        AtomicReference atomicReference = new AtomicReference();
        return new w4(new r4(atomicReference, l4Var), observable, atomicReference, l4Var);
    }

    @Override // zgm.a
    public final void c(igm.g gVar) {
        q4 q4Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f263247b;
            q4Var = (q4) atomicReference.get();
            if (q4Var != null && !q4Var.isDisposed()) {
                break;
            }
            q4 q4Var2 = new q4(this.f263248c.call(), atomicReference);
            while (!atomicReference.compareAndSet(q4Var, q4Var2)) {
                if (atomicReference.get() != q4Var) {
                    break;
                }
            }
            q4Var = q4Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = q4Var.d;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            gVar.accept(q4Var);
            if (z) {
                this.f263246a.subscribe(q4Var);
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            ce9.m.F(th10);
            throw ygm.g.f(th10);
        }
    }

    @Override // zgm.a
    public final void d() {
        AtomicReference atomicReference = this.f263247b;
        q4 q4Var = (q4) atomicReference.get();
        if (q4Var == null || !q4Var.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(q4Var, null) && atomicReference.get() == q4Var) {
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.d.subscribe(lVar);
    }
}
