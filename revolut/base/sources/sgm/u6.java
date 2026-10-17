package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class u6 extends Observable implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6 f263206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fhm.f f263207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f263208c = new AtomicReference();
    public final AtomicBoolean d = new AtomicBoolean();

    public u6(w6 w6Var, fhm.f fVar) {
        this.f263206a = w6Var;
        this.f263207b = fVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f263208c);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263208c.get() == jgm.b.DISPOSED;
    }

    @Override // fgm.l
    public final void onComplete() {
        w6 w6Var = this.f263206a;
        w6Var.f263259h.offer(this);
        w6Var.a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (isDisposed()) {
            jb3.l.v(th10);
            return;
        }
        w6 w6Var = this.f263206a;
        w6Var.o.dispose();
        i4 i4Var = w6Var.f;
        i4Var.getClass();
        jgm.b.a(i4Var);
        w6Var.e.dispose();
        if (w6Var.f263263n.a(th10)) {
            w6Var.f263261l = true;
            w6Var.a();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (jgm.b.a(this.f263208c)) {
            w6 w6Var = this.f263206a;
            w6Var.f263259h.offer(this);
            w6Var.a();
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.f263208c, disposable);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        this.f263207b.subscribe(lVar);
        this.d.set(true);
    }
}
