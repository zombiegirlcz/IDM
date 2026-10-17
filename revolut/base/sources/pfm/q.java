package pfm;

import efm.c0;
import efm.d0;
import efm.f0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends AtomicReference implements efm.d, ifm.c, Runnable, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f235754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f235755c;
    public Object d;

    public q(efm.d dVar, c0 c0Var) {
        this.f235753a = 0;
        this.f235754b = dVar;
        this.f235755c = c0Var;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f235753a) {
            case 0:
                lfm.d.a(this);
                break;
            case 1:
                lfm.d.a(this);
                lfm.b bVar = (lfm.b) this.f235755c;
                bVar.getClass();
                lfm.d.a(bVar);
                break;
            default:
                lfm.d.a(this);
                lfm.b bVar2 = (lfm.b) this.f235755c;
                bVar2.getClass();
                lfm.d.a(bVar2);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f235753a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.d
    public void onComplete() {
        switch (this.f235753a) {
            case 0:
                lfm.d.c(this, ((c0) this.f235755c).c(this));
                break;
            default:
                ((efm.d) this.f235754b).onComplete();
                break;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f235753a) {
            case 0:
                this.d = th10;
                lfm.d.c(this, ((c0) this.f235755c).c(this));
                break;
            case 1:
                ((efm.d) this.f235754b).onError(th10);
                break;
            default:
                ((f0) this.f235754b).onError(th10);
                break;
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f235753a) {
            case 0:
                if (lfm.d.e(this, cVar)) {
                    ((efm.d) this.f235754b).onSubscribe(this);
                }
                break;
            case 1:
                lfm.d.e(this, cVar);
                break;
            default:
                lfm.d.e(this, cVar);
                break;
        }
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        ((f0) this.f235754b).onSuccess(obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f235753a) {
            case 0:
                efm.d dVar = (efm.d) this.f235754b;
                Throwable th10 = (Throwable) this.d;
                if (th10 == null) {
                    dVar.onComplete();
                } else {
                    this.d = null;
                    dVar.onError(th10);
                }
                break;
            case 1:
                ((efm.b) this.d).d(this);
                break;
            default:
                ((d0) this.d).q(this);
                break;
        }
    }

    public q(f0 f0Var, d0 d0Var) {
        this.f235753a = 2;
        this.f235754b = f0Var;
        this.d = d0Var;
        this.f235755c = new lfm.b(1);
    }

    public q(efm.d dVar, efm.b bVar) {
        this.f235753a = 1;
        this.f235754b = dVar;
        this.d = bVar;
        this.f235755c = new lfm.b(1);
    }
}
