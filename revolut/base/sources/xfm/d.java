package xfm;

import efm.j;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import kfm.g;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicReference implements j, dom.b, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f305449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f305450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.a f305451c;
    public final g d;

    public d(g gVar, g gVar2, kfm.a aVar, g gVar3) {
        this.f305449a = gVar;
        this.f305450b = gVar2;
        this.f305451c = aVar;
        this.d = gVar3;
    }

    @Override // dom.b
    public final void a(long j2) {
        ((dom.b) get()).a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        yfm.g.b(this);
    }

    @Override // ifm.c
    public final void dispose() {
        yfm.g.b(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.e(this, bVar)) {
            try {
                this.d.accept(this);
            } catch (Throwable th10) {
                m70.a.u(th10);
                bVar.cancel();
                onError(th10);
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        Object obj2 = get();
        yfm.g gVar = yfm.g.CANCELLED;
        if (obj2 != gVar) {
            lazySet(gVar);
            try {
                this.f305451c.run();
            } catch (Throwable th10) {
                m70.a.u(th10);
                mo3.a.m(th10);
            }
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        Object obj2 = get();
        yfm.g gVar = yfm.g.CANCELLED;
        if (obj2 == gVar) {
            mo3.a.m(th10);
            return;
        }
        lazySet(gVar);
        try {
            this.f305450b.accept(th10);
        } catch (Throwable th11) {
            m70.a.u(th11);
            mo3.a.m(new CompositeException(th10, th11));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f305449a.accept(obj2);
        } catch (Throwable th10) {
            m70.a.u(th10);
            ((dom.b) get()).cancel();
            onError(th10);
        }
    }
}
