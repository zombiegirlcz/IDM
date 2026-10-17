package wgm;

import ce9.m;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import jb3.l;
import kgm.j;
import pgm.n0;
import xgm.f;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends AtomicReference implements fgm.d, dom.b, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f297351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f297352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kgm.b f297353c;
    public final g d;

    public c(g gVar, g gVar2, n0 n0Var) {
        kgm.b bVar = j.f184027c;
        this.f297351a = gVar;
        this.f297352b = gVar2;
        this.f297353c = bVar;
        this.d = n0Var;
    }

    @Override // dom.b
    public final void a(long j2) {
        ((dom.b) get()).a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        f.b(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        f.b(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (f.e(this, bVar)) {
            try {
                this.d.accept(this);
            } catch (Throwable th10) {
                m.F(th10);
                bVar.cancel();
                onError(th10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == f.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        Object obj2 = get();
        f fVar = f.CANCELLED;
        if (obj2 != fVar) {
            lazySet(fVar);
            try {
                this.f297353c.getClass();
            } catch (Throwable th10) {
                m.F(th10);
                l.v(th10);
            }
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        Object obj2 = get();
        f fVar = f.CANCELLED;
        if (obj2 == fVar) {
            l.v(th10);
            return;
        }
        lazySet(fVar);
        try {
            this.f297352b.accept(th10);
        } catch (Throwable th11) {
            m.F(th11);
            l.v(new CompositeException(th10, th11));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f297351a.accept(obj2);
        } catch (Throwable th10) {
            m.F(th10);
            ((dom.b) get()).cancel();
            onError(th10);
        }
    }
}
