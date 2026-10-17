package ngm;

import igm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f215252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.g f215253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.a f215254c;
    public boolean d;

    public k(p pVar, igm.g gVar, igm.a aVar) {
        this.f215252a = pVar;
        this.f215253b = gVar;
        this.f215254c = aVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            this.f215254c.run();
        } catch (Throwable th10) {
            ce9.m.F(th10);
            jb3.l.v(th10);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.d) {
            jb3.l.v(th10);
            return;
        }
        this.d = true;
        try {
            this.f215253b.accept(th10);
        } catch (Throwable th11) {
            ce9.m.F(th11);
            jb3.l.v(new CompositeException(th10, th11));
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        try {
            if (this.f215252a.test(obj2)) {
                return;
            }
            jgm.b.a(this);
            onComplete();
        } catch (Throwable th10) {
            ce9.m.F(th10);
            jgm.b.a(this);
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
