package ofm;

import efm.f0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AtomicReference implements f0, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kfm.b f224910a;

    public d(kfm.b bVar) {
        this.f224910a = bVar;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == lfm.d.DISPOSED;
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        try {
            lazySet(lfm.d.DISPOSED);
            this.f224910a.accept(null, th10);
        } catch (Throwable th11) {
            m70.a.u(th11);
            mo3.a.m(new CompositeException(th10, th11));
        }
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        try {
            lazySet(lfm.d.DISPOSED);
            this.f224910a.accept(obj2, null);
        } catch (Throwable th10) {
            m70.a.u(th10);
            mo3.a.m(th10);
        }
    }
}
