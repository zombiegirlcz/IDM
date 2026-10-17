package pfm;

import efm.f0;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AtomicInteger implements efm.d, ifm.c, efm.l, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.a f235739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ifm.c f235740c;
    public final Object d;

    public /* synthetic */ k(Object obj2, kfm.a aVar, int i) {
        this.f235738a = i;
        this.d = obj2;
        this.f235739b = aVar;
    }

    public final void a() {
        switch (this.f235738a) {
            case 0:
                if (compareAndSet(0, 1)) {
                    try {
                        this.f235739b.run();
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        mo3.a.m(th10);
                        return;
                    }
                }
                break;
            case 1:
                if (compareAndSet(0, 1)) {
                    try {
                        this.f235739b.run();
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        mo3.a.m(th11);
                        return;
                    }
                }
                break;
            default:
                if (compareAndSet(0, 1)) {
                    try {
                        this.f235739b.run();
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        mo3.a.m(th12);
                    }
                }
                break;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f235738a) {
            case 0:
                this.f235740c.dispose();
                a();
                break;
            case 1:
                this.f235740c.dispose();
                a();
                break;
            default:
                this.f235740c.dispose();
                a();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f235738a) {
        }
        return this.f235740c.isDisposed();
    }

    @Override // efm.d
    public void onComplete() {
        switch (this.f235738a) {
            case 0:
                ((efm.d) this.d).onComplete();
                a();
                break;
            default:
                ((efm.l) this.d).onComplete();
                a();
                break;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f235738a) {
            case 0:
                ((efm.d) this.d).onError(th10);
                a();
                break;
            case 1:
                ((efm.l) this.d).onError(th10);
                a();
                break;
            default:
                ((f0) this.d).onError(th10);
                a();
                break;
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f235738a) {
            case 0:
                if (lfm.d.f(this.f235740c, cVar)) {
                    this.f235740c = cVar;
                    ((efm.d) this.d).onSubscribe(this);
                }
                break;
            case 1:
                if (lfm.d.f(this.f235740c, cVar)) {
                    this.f235740c = cVar;
                    ((efm.l) this.d).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f(this.f235740c, cVar)) {
                    this.f235740c = cVar;
                    ((f0) this.d).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f235738a) {
            case 1:
                ((efm.l) this.d).onSuccess(obj2);
                a();
                break;
            default:
                ((f0) this.d).onSuccess(obj2);
                a();
                break;
        }
    }
}
