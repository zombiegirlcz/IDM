package lfm;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends AtomicReference implements ifm.c, efm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195036a;

    public /* synthetic */ b(int i) {
        this.f195036a = i;
    }

    @Override // ifm.c
    public final void dispose() {
        kfm.f fVar;
        switch (this.f195036a) {
            case 0:
                if (get() != null && (fVar = (kfm.f) getAndSet(null)) != null) {
                    try {
                        fVar.cancel();
                    } catch (Exception e) {
                        m70.a.u(e);
                        mo3.a.m(e);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                d.a(this);
                break;
            default:
                d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f195036a) {
            case 0:
                return get() == null;
            case 1:
                return d.b((ifm.c) get());
            default:
                return get() == d.DISPOSED;
        }
    }

    @Override // efm.d
    public void onComplete() {
        lazySet(d.DISPOSED);
    }

    @Override // efm.d
    public void onError(Throwable th10) {
        lazySet(d.DISPOSED);
        mo3.a.m(new OnErrorNotImplementedException(th10));
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        d.e(this, cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2) {
        super(obj2);
        this.f195036a = 0;
    }

    public b(b bVar) {
        this.f195036a = 1;
        lazySet(bVar);
    }
}
