package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class f4 extends agm.a implements lfm.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.r f270456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f270457h = new AtomicReference();

    public f4(efm.r rVar) {
        this.f270456g = rVar;
    }

    @Override // lfm.g
    public final void a(ifm.c cVar) {
        t61.a.z(this.f270457h, (e4) cVar);
    }

    @Override // agm.a
    public final void d(kfm.g gVar) {
        e4 e4Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f270457h;
            e4Var = (e4) atomicReference.get();
            if (e4Var != null && !e4Var.isDisposed()) {
                break;
            }
            e4 e4Var2 = new e4(atomicReference);
            while (!atomicReference.compareAndSet(e4Var, e4Var2)) {
                if (atomicReference.get() != e4Var) {
                    break;
                }
            }
            e4Var = e4Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = e4Var.f270428a;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            gVar.accept(e4Var);
            if (z) {
                this.f270456g.subscribe(e4Var);
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            throw zfm.h.d(th10);
        }
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        e4 e4Var;
        d4[] d4VarArr;
        d4[] d4VarArr2;
        loop0: while (true) {
            AtomicReference atomicReference = this.f270457h;
            e4Var = (e4) atomicReference.get();
            if (e4Var != null) {
                break;
            }
            e4 e4Var2 = new e4(atomicReference);
            while (!atomicReference.compareAndSet(e4Var, e4Var2)) {
                if (atomicReference.get() != e4Var) {
                    break;
                }
            }
            e4Var = e4Var2;
            break loop0;
        }
        d4 d4Var = new d4(yVar, e4Var);
        yVar.onSubscribe(d4Var);
        do {
            d4VarArr = (d4[]) e4Var.get();
            if (d4VarArr == e4.f) {
                Throwable th10 = e4Var.d;
                if (th10 != null) {
                    yVar.onError(th10);
                    return;
                } else {
                    yVar.onComplete();
                    return;
                }
            }
            int length = d4VarArr.length;
            d4VarArr2 = new d4[length + 1];
            System.arraycopy(d4VarArr, 0, d4VarArr2, 0, length);
            d4VarArr2[length] = d4Var;
        } while (!e4Var.compareAndSet(d4VarArr, d4VarArr2));
        if (d4Var.isDisposed()) {
            e4Var.a(d4Var);
        }
    }
}
