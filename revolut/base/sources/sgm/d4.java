package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class d4 extends AtomicBoolean implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f262769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pgm.e1 f262770c;
    public Disposable d;

    public d4(fgm.l lVar, e4 e4Var, pgm.e1 e1Var) {
        this.f262768a = lVar;
        this.f262769b = e4Var;
        this.f262770c = e1Var;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.d.dispose();
        if (compareAndSet(false, true)) {
            e4 e4Var = this.f262769b;
            pgm.e1 e1Var = this.f262770c;
            synchronized (e4Var) {
                try {
                    pgm.e1 e1Var2 = e4Var.f262810c;
                    if (e1Var2 != null && e1Var2 == e1Var) {
                        long j2 = e1Var.f236049b - 1;
                        e1Var.f236049b = j2;
                        if (j2 == 0 && e1Var.f236050c) {
                            e4Var.d(e1Var);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (compareAndSet(false, true)) {
            this.f262769b.c(this.f262770c);
            this.f262768a.onComplete();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (!compareAndSet(false, true)) {
            jb3.l.v(th10);
        } else {
            this.f262769b.c(this.f262770c);
            this.f262768a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f262768a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.d, disposable)) {
            this.d = disposable;
            this.f262768a.onSubscribe(this);
        }
    }
}
