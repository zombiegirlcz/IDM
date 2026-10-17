package rfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class v extends AtomicReference implements efm.l, ifm.c, Runnable, efm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.c0 f253980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f253981c;
    public Throwable d;
    public final Object e;

    public /* synthetic */ v(Object obj2, efm.c0 c0Var, int i) {
        this.f253979a = i;
        this.e = obj2;
        this.f253980b = c0Var;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253979a) {
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
        switch (this.f253979a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.l
    public void onComplete() {
        lfm.d.c(this, this.f253980b.c(this));
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        switch (this.f253979a) {
            case 0:
                this.d = th10;
                lfm.d.c(this, this.f253980b.c(this));
                break;
            default:
                this.d = th10;
                lfm.d.c(this, this.f253980b.c(this));
                break;
        }
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253979a) {
            case 0:
                if (lfm.d.e(this, cVar)) {
                    ((efm.l) this.e).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.e(this, cVar)) {
                    ((efm.f0) this.e).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        switch (this.f253979a) {
            case 0:
                this.f253981c = obj2;
                lfm.d.c(this, this.f253980b.c(this));
                break;
            default:
                this.f253981c = obj2;
                lfm.d.c(this, this.f253980b.c(this));
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f253979a) {
            case 0:
                efm.l lVar = (efm.l) this.e;
                Throwable th10 = this.d;
                if (th10 == null) {
                    Object obj2 = this.f253981c;
                    if (obj2 == null) {
                        lVar.onComplete();
                    } else {
                        this.f253981c = null;
                        lVar.onSuccess(obj2);
                    }
                } else {
                    this.d = null;
                    lVar.onError(th10);
                }
                break;
            default:
                efm.f0 f0Var = (efm.f0) this.e;
                Throwable th11 = this.d;
                if (th11 == null) {
                    f0Var.onSuccess(this.f253981c);
                } else {
                    f0Var.onError(th11);
                }
                break;
        }
    }
}
