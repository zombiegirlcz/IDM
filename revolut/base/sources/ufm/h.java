package ufm;

import efm.d0;
import efm.f0;
import efm.h0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends AtomicReference implements f0, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f279888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f279889c;

    public /* synthetic */ h(int i, f0 f0Var, kfm.o oVar) {
        this.f279887a = i;
        this.f279888b = f0Var;
        this.f279889c = oVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f279887a) {
            case 0:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f279887a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        switch (this.f279887a) {
            case 0:
                this.f279888b.onError(th10);
                break;
            default:
                f0 f0Var = this.f279888b;
                try {
                    Object objApply = this.f279889c.apply(th10);
                    mfm.f.b(objApply, "The nextFunction returned a null SingleSource.");
                    ((d0) ((h0) objApply)).q(new ao.h(21, (Object) this, false, (Object) f0Var));
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    f0Var.onError(new CompositeException(th10, th11));
                }
                break;
        }
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f279887a) {
            case 0:
                if (lfm.d.e(this, cVar)) {
                    this.f279888b.onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.e(this, cVar)) {
                    this.f279888b.onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f279887a) {
            case 0:
                f0 f0Var = this.f279888b;
                try {
                    Object objApply = this.f279889c.apply(obj2);
                    mfm.f.b(objApply, "The single returned by the mapper is null");
                    h0 h0Var = (h0) objApply;
                    if (!isDisposed()) {
                        ((d0) h0Var).q(new g(this, f0Var, 1));
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    f0Var.onError(th10);
                    return;
                }
                break;
            default:
                this.f279888b.onSuccess(obj2);
                break;
        }
    }
}
