package ofm;

import efm.d0;
import efm.f0;
import efm.h0;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
import rfm.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends AtomicReference implements efm.d, ifm.c, kfm.g, efm.l, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f224920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f224921c;

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f224919a = i;
        this.f224920b = obj2;
        this.f224921c = obj3;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        mo3.a.m(new OnErrorNotImplementedException((Throwable) obj2));
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f224919a) {
            case 0:
                lfm.d.a(this);
                break;
            case 1:
                lfm.d.a(this);
                break;
            case 2:
                lfm.d.a(this);
                lfm.b bVar = (lfm.b) this.f224920b;
                bVar.getClass();
                lfm.d.a(bVar);
                break;
            case 3:
                lfm.d.a(this);
                break;
            case 4:
                lfm.d.a(this);
                lfm.d.a((a0) this.f224921c);
                break;
            case 5:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f224919a) {
            case 0:
                if (get() == lfm.d.DISPOSED) {
                }
                break;
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.d
    public void onComplete() {
        switch (this.f224919a) {
            case 0:
                try {
                    ((kfm.a) this.f224921c).run();
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    mo3.a.m(th10);
                }
                lazySet(lfm.d.DISPOSED);
                break;
            case 1:
                ((efm.f) this.f224921c).d(new ao.h(22, (Object) this, false, this.f224920b));
                break;
            case 2:
                ((efm.l) this.f224921c).onComplete();
                break;
            case 3:
                ifm.c cVar = (ifm.c) get();
                if (cVar != lfm.d.DISPOSED && compareAndSet(cVar, null)) {
                    ((efm.k) ((efm.n) this.f224921c)).i(new cpi.g((efm.l) this.f224920b, this, 27));
                    break;
                }
                break;
            case 4:
                lfm.d.a((a0) this.f224921c);
                lfm.d dVar = lfm.d.DISPOSED;
                if (getAndSet(dVar) != dVar) {
                    ((efm.l) this.f224920b).onComplete();
                }
                break;
            default:
                ((d0) ((h0) this.f224921c)).q(new ao.h(21, (Object) this, false, this.f224920b));
                break;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f224919a) {
            case 0:
                try {
                    ((kfm.g) this.f224920b).accept(th10);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    mo3.a.m(th11);
                }
                lazySet(lfm.d.DISPOSED);
                break;
            case 1:
                ((efm.d) this.f224920b).onError(th10);
                break;
            case 2:
                ((efm.l) this.f224921c).onError(th10);
                break;
            case 3:
                ((efm.l) this.f224920b).onError(th10);
                break;
            case 4:
                lfm.d.a((a0) this.f224921c);
                lfm.d dVar = lfm.d.DISPOSED;
                if (getAndSet(dVar) == dVar) {
                    mo3.a.m(th10);
                } else {
                    ((efm.l) this.f224920b).onError(th10);
                }
                break;
            case 5:
                ((f0) this.f224920b).onError(th10);
                break;
            default:
                ((efm.l) this.f224920b).onError(th10);
                break;
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f224919a) {
            case 0:
                lfm.d.e(this, cVar);
                break;
            case 1:
                if (lfm.d.e(this, cVar)) {
                    ((efm.d) this.f224920b).onSubscribe(this);
                }
                break;
            case 2:
                lfm.d.e(this, cVar);
                break;
            case 3:
                if (lfm.d.e(this, cVar)) {
                    ((efm.l) this.f224920b).onSubscribe(this);
                }
                break;
            case 4:
                lfm.d.e(this, cVar);
                break;
            case 5:
                if (lfm.d.e(this, cVar)) {
                    ((f0) this.f224920b).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.e(this, cVar)) {
                    ((efm.l) this.f224920b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f224919a) {
            case 2:
                ((efm.l) this.f224921c).onSuccess(obj2);
                break;
            case 3:
                ((efm.l) this.f224920b).onSuccess(obj2);
                break;
            case 4:
                lfm.d.a((a0) this.f224921c);
                lfm.d dVar = lfm.d.DISPOSED;
                if (getAndSet(dVar) != dVar) {
                    ((efm.l) this.f224920b).onSuccess(obj2);
                }
                break;
            default:
                try {
                    Object objApply = ((kfm.o) this.f224921c).apply(obj2);
                    mfm.f.b(objApply, "The mapper returned a null MaybeSource");
                    efm.n nVar = (efm.n) objApply;
                    if (!isDisposed()) {
                        ((efm.k) nVar).i(new u0a.a(this, (efm.l) this.f224920b, 2));
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    onError(th10);
                    return;
                }
                break;
        }
    }

    public h(kfm.a aVar) {
        this.f224919a = 0;
        this.f224920b = this;
        this.f224921c = aVar;
    }

    public h(efm.l lVar, int i) {
        this.f224919a = i;
        switch (i) {
            case 4:
                this.f224920b = lVar;
                this.f224921c = new a0(this, 0);
                break;
            default:
                this.f224921c = lVar;
                this.f224920b = new lfm.b(1);
                break;
        }
    }
}
