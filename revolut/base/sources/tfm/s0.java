package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends AtomicReference implements efm.y, efm.d, ifm.c, efm.l, efm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f270798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f270799c;
    public Object d;

    public /* synthetic */ s0(Object obj2, Object obj3, int i) {
        this.f270797a = i;
        this.f270798b = obj2;
        this.d = obj3;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270797a) {
            case 0:
                lfm.d.a(this);
                break;
            case 1:
                lfm.d.a(this);
                break;
            case 2:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270797a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270797a) {
            case 0:
                if (!this.f270799c) {
                    this.f270799c = true;
                    lfm.d.c(this, null);
                    efm.f fVar = (efm.f) this.d;
                    this.d = null;
                    fVar.d(this);
                } else {
                    ((efm.y) this.f270798b).onComplete();
                }
                break;
            case 1:
                if (!this.f270799c) {
                    this.f270799c = true;
                    lfm.d.c(this, null);
                    efm.n nVar = (efm.n) this.d;
                    this.d = null;
                    ((efm.k) nVar).i(this);
                } else {
                    ((efm.y) this.f270798b).onComplete();
                }
                break;
            case 2:
                this.f270799c = true;
                lfm.d.c(this, null);
                efm.h0 h0Var = (efm.h0) this.d;
                this.d = null;
                ((efm.d0) h0Var).q(this);
                break;
            default:
                if (!this.f270799c) {
                    this.f270799c = true;
                    ((efm.d0) this.d).q(new ao.h(21, (Object) this, false, this.f270798b));
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270797a) {
            case 0:
                ((efm.y) this.f270798b).onError(th10);
                break;
            case 1:
                ((efm.y) this.f270798b).onError(th10);
                break;
            case 2:
                ((efm.y) this.f270798b).onError(th10);
                break;
            default:
                if (!this.f270799c) {
                    this.f270799c = true;
                    ((efm.f0) this.f270798b).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270797a) {
            case 0:
                ((efm.y) this.f270798b).onNext(obj2);
                break;
            case 1:
                ((efm.y) this.f270798b).onNext(obj2);
                break;
            case 2:
                ((efm.y) this.f270798b).onNext(obj2);
                break;
            default:
                ((ifm.c) get()).dispose();
                onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270797a) {
            case 0:
                if (lfm.d.e(this, cVar) && !this.f270799c) {
                    ((efm.y) this.f270798b).onSubscribe(this);
                    break;
                }
                break;
            case 1:
                if (lfm.d.e(this, cVar) && !this.f270799c) {
                    ((efm.y) this.f270798b).onSubscribe(this);
                    break;
                }
                break;
            case 2:
                if (lfm.d.e(this, cVar) && !this.f270799c) {
                    ((efm.y) this.f270798b).onSubscribe(this);
                    break;
                }
                break;
            default:
                if (lfm.d.d(this, cVar)) {
                    ((efm.f0) this.f270798b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f270797a) {
            case 1:
                efm.y yVar = (efm.y) this.f270798b;
                yVar.onNext(obj2);
                yVar.onComplete();
                break;
            default:
                efm.y yVar2 = (efm.y) this.f270798b;
                yVar2.onNext(obj2);
                yVar2.onComplete();
                break;
        }
    }
}
