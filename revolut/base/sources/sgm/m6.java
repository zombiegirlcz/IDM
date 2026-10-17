package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class m6 extends AtomicBoolean implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f263005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.g f263006c;
    public final boolean d;
    public Disposable e;

    public m6(fgm.l lVar, Object obj2, igm.g gVar, boolean z) {
        this.f263004a = lVar;
        this.f263005b = obj2;
        this.f263006c = gVar;
        this.d = z;
    }

    public final void a() {
        if (compareAndSet(false, true)) {
            try {
                this.f263006c.accept(this.f263005b);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                jb3.l.v(th10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.d) {
            a();
            this.e.dispose();
            this.e = jgm.b.DISPOSED;
        } else {
            this.e.dispose();
            this.e = jgm.b.DISPOSED;
            a();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get();
    }

    @Override // fgm.l
    public final void onComplete() {
        boolean z = this.d;
        fgm.l lVar = this.f263004a;
        if (!z) {
            lVar.onComplete();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f263006c.accept(this.f263005b);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                lVar.onError(th10);
                return;
            }
        }
        lVar.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        boolean z = this.d;
        fgm.l lVar = this.f263004a;
        if (!z) {
            lVar.onError(th10);
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f263006c.accept(this.f263005b);
            } catch (Throwable th11) {
                ce9.m.F(th11);
                th10 = new CompositeException(th10, th11);
            }
        }
        lVar.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f263004a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.e, disposable)) {
            this.e = disposable;
            this.f263004a.onSubscribe(this);
        }
    }
}
