package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class q4 extends AtomicReference implements fgm.l, Disposable {
    public static final m4[] f = new m4[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m4[] f263102g = new m4[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f263103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f263104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f263105c = new AtomicReference(f);
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicReference e;

    public q4(o4 o4Var, AtomicReference atomicReference) {
        this.f263103a = o4Var;
        this.e = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(m4 m4Var) {
        m4[] m4VarArr;
        while (true) {
            AtomicReference atomicReference = this.f263105c;
            m4[] m4VarArr2 = (m4[]) atomicReference.get();
            int length = m4VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (m4VarArr2[i].equals(m4Var)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                m4VarArr = f;
            } else {
                m4[] m4VarArr3 = new m4[length - 1];
                System.arraycopy(m4VarArr2, 0, m4VarArr3, 0, i);
                System.arraycopy(m4VarArr2, i + 1, m4VarArr3, i, (length - i) - 1);
                m4VarArr = m4VarArr3;
            }
            while (!atomicReference.compareAndSet(m4VarArr2, m4VarArr)) {
                if (atomicReference.get() != m4VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        AtomicReference atomicReference;
        this.f263105c.set(f263102g);
        do {
            atomicReference = this.e;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        jgm.b.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263105c.get() == f263102g;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f263104b) {
            return;
        }
        this.f263104b = true;
        o4 o4Var = this.f263103a;
        o4Var.b();
        for (m4 m4Var : (m4[]) this.f263105c.getAndSet(f263102g)) {
            o4Var.c(m4Var);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f263104b) {
            jb3.l.v(th10);
            return;
        }
        this.f263104b = true;
        o4 o4Var = this.f263103a;
        o4Var.error(th10);
        for (m4 m4Var : (m4[]) this.f263105c.getAndSet(f263102g)) {
            o4Var.c(m4Var);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263104b) {
            return;
        }
        o4 o4Var = this.f263103a;
        o4Var.a(obj2);
        for (m4 m4Var : (m4[]) this.f263105c.get()) {
            o4Var.c(m4Var);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.e(this, disposable)) {
            for (m4 m4Var : (m4[]) this.f263105c.get()) {
                this.f263103a.c(m4Var);
            }
        }
    }
}
