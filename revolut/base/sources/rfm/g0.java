package rfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends AtomicReference implements efm.l, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.l f253940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2i.o f253941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f253942c;
    public ifm.c d;

    public g0(efm.l lVar, Object obj2, f2i.o oVar) {
        super(obj2);
        this.f253940a = lVar;
        this.f253941b = oVar;
        this.f253942c = true;
    }

    public final void a() {
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.f253941b.accept(andSet);
            } catch (Throwable th10) {
                m70.a.u(th10);
                mo3.a.m(th10);
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        this.d.dispose();
        this.d = lfm.d.DISPOSED;
        a();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // efm.l
    public final void onComplete() {
        this.d = lfm.d.DISPOSED;
        efm.l lVar = this.f253940a;
        boolean z = this.f253942c;
        if (z) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f253941b.accept(andSet);
            } catch (Throwable th10) {
                m70.a.u(th10);
                lVar.onError(th10);
                return;
            }
        }
        lVar.onComplete();
        if (z) {
            return;
        }
        a();
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        this.d = lfm.d.DISPOSED;
        boolean z = this.f253942c;
        if (z) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f253941b.accept(andSet);
            } catch (Throwable th11) {
                m70.a.u(th11);
                th10 = new CompositeException(th10, th11);
            }
        }
        this.f253940a.onError(th10);
        if (z) {
            return;
        }
        a();
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.d, cVar)) {
            this.d = cVar;
            this.f253940a.onSubscribe(this);
        }
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        this.d = lfm.d.DISPOSED;
        efm.l lVar = this.f253940a;
        boolean z = this.f253942c;
        if (z) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f253941b.accept(andSet);
            } catch (Throwable th10) {
                m70.a.u(th10);
                lVar.onError(th10);
                return;
            }
        }
        lVar.onSuccess(obj2);
        if (z) {
            return;
        }
        a();
    }
}
