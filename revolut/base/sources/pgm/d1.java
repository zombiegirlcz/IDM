package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class d1 extends Flowable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f236043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f236044c;
    public final Flowable d;
    public AtomicReference e;

    public d1(d1 d1Var) {
        this.f236043b = 1;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.d = d1Var;
        this.f236044c = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        c1 c1Var;
        e1 e1Var;
        boolean z;
        switch (this.f236043b) {
            case 0:
                AtomicReference atomicReference = this.e;
                while (true) {
                    c1Var = (c1) atomicReference.get();
                    if (c1Var == null) {
                        c1 c1Var2 = new c1(atomicReference, this.f236044c);
                        while (!atomicReference.compareAndSet(c1Var, c1Var2)) {
                            if (atomicReference.get() != c1Var) {
                            }
                            break;
                        }
                        c1Var = c1Var2;
                    }
                }
                b1 b1Var = new b1(aVar, c1Var);
                dom.a aVar2 = b1Var.f236008a;
                aVar.e(b1Var);
                AtomicReference atomicReference2 = c1Var.d;
                while (true) {
                    b1[] b1VarArr = (b1[]) atomicReference2.get();
                    if (b1VarArr == c1.f236017l) {
                        Throwable th10 = c1Var.i;
                        if (th10 != null) {
                            aVar2.onError(th10);
                            return;
                        } else {
                            aVar2.onComplete();
                            return;
                        }
                    }
                    int length = b1VarArr.length;
                    b1[] b1VarArr2 = new b1[length + 1];
                    System.arraycopy(b1VarArr, 0, b1VarArr2, 0, length);
                    b1VarArr2[length] = b1Var;
                    while (!atomicReference2.compareAndSet(b1VarArr, b1VarArr2)) {
                        if (atomicReference2.get() != b1VarArr) {
                        }
                        break;
                    }
                    if (b1Var.b()) {
                        c1Var.c(b1Var);
                        return;
                    } else {
                        c1Var.b();
                        return;
                    }
                }
                break;
            default:
                synchronized (this) {
                    try {
                        e1Var = (e1) this.e;
                        if (e1Var == null) {
                            e1Var = new e1(this, 0);
                            this.e = e1Var;
                        }
                        long j2 = e1Var.f236049b + 1;
                        e1Var.f236049b = j2;
                        if (e1Var.f236050c || j2 != this.f236044c) {
                            z = false;
                        } else {
                            z = true;
                            e1Var.f236050c = true;
                        }
                    } catch (Throwable th11) {
                        throw th11;
                    }
                    break;
                }
                ((d1) this.d).j(new f1(aVar, this, e1Var));
                if (z) {
                    ((d1) this.d).n(e1Var);
                    return;
                }
                return;
        }
    }

    public void n(igm.g gVar) {
        c1 c1Var;
        AtomicReference atomicReference = this.e;
        loop0: while (true) {
            c1Var = (c1) atomicReference.get();
            if (c1Var != null && !c1Var.isDisposed()) {
                break;
            }
            c1 c1Var2 = new c1(atomicReference, this.f236044c);
            while (!atomicReference.compareAndSet(c1Var, c1Var2)) {
                if (atomicReference.get() != c1Var) {
                    break;
                }
            }
            c1Var = c1Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = c1Var.f236020c;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            gVar.accept(c1Var);
            if (z) {
                this.d.a(c1Var);
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            throw ygm.g.f(th10);
        }
    }

    public void o() {
        AtomicReference atomicReference = this.e;
        c1 c1Var = (c1) atomicReference.get();
        if (c1Var == null || !c1Var.isDisposed()) {
            return;
        }
        while (!atomicReference.compareAndSet(c1Var, null) && atomicReference.get() == c1Var) {
        }
    }

    public void p(e1 e1Var) {
        synchronized (this) {
            try {
                if (((e1) this.e) == e1Var) {
                    e1Var.getClass();
                    long j2 = e1Var.f236049b - 1;
                    e1Var.f236049b = j2;
                    if (j2 == 0) {
                        this.e = null;
                        ((d1) this.d).o();
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void q(e1 e1Var) {
        synchronized (this) {
            try {
                if (e1Var.f236049b == 0 && e1Var == ((e1) this.e)) {
                    this.e = null;
                    Disposable disposable = (Disposable) e1Var.get();
                    jgm.b.a(e1Var);
                    if (disposable == null) {
                        e1Var.d = true;
                    } else {
                        ((d1) this.d).o();
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public d1(Flowable flowable, int i) {
        this.f236043b = 0;
        this.d = flowable;
        this.f236044c = i;
        this.e = new AtomicReference();
    }
}
