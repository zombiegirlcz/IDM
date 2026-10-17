package rfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends AtomicReference implements efm.l, efm.d, ifm.c, efm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.d f253960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f253961c;

    public /* synthetic */ k(efm.d dVar, kfm.o oVar, int i) {
        this.f253959a = i;
        this.f253960b = dVar;
        this.f253961c = oVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253959a) {
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
        switch (this.f253959a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.l
    public final void onComplete() {
        switch (this.f253959a) {
            case 0:
                this.f253960b.onComplete();
                break;
            default:
                this.f253960b.onComplete();
                break;
        }
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        switch (this.f253959a) {
            case 0:
                this.f253960b.onError(th10);
                break;
            default:
                this.f253960b.onError(th10);
                break;
        }
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253959a) {
            case 0:
                lfm.d.c(this, cVar);
                break;
            default:
                lfm.d.c(this, cVar);
                break;
        }
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f253959a) {
            case 0:
                try {
                    Object objApply = this.f253961c.apply(obj2);
                    mfm.f.b(objApply, "The mapper returned a null CompletableSource");
                    efm.f fVar = (efm.f) objApply;
                    if (!isDisposed()) {
                        fVar.d(this);
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    onError(th10);
                }
                break;
            default:
                try {
                    Object objApply2 = this.f253961c.apply(obj2);
                    mfm.f.b(objApply2, "The mapper returned a null CompletableSource");
                    efm.f fVar2 = (efm.f) objApply2;
                    if (!isDisposed()) {
                        fVar2.d(this);
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    onError(th11);
                    return;
                }
                break;
        }
    }
}
