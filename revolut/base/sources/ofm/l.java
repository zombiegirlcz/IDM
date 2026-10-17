package ofm;

import efm.y;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends AtomicReference implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kfm.p f224930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.g f224931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.a f224932c;
    public boolean d;

    public l(kfm.p pVar, kfm.g gVar, kfm.a aVar) {
        this.f224930a = pVar;
        this.f224931b = gVar;
        this.f224932c = aVar;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            this.f224932c.run();
        } catch (Throwable th10) {
            m70.a.u(th10);
            mo3.a.m(th10);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
            return;
        }
        this.d = true;
        try {
            this.f224931b.accept(th10);
        } catch (Throwable th11) {
            m70.a.u(th11);
            mo3.a.m(new CompositeException(th10, th11));
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        try {
            if (this.f224930a.test(obj2)) {
                return;
            }
            lfm.d.a(this);
            onComplete();
        } catch (Throwable th10) {
            m70.a.u(th10);
            lfm.d.a(this);
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
