package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class m implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.p f262986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.p f262987c;
    public Disposable d;
    public boolean e;

    public /* synthetic */ m(fgm.p pVar, igm.p pVar2, int i) {
        this.f262985a = i;
        this.f262986b = pVar;
        this.f262987c = pVar2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262985a) {
            case 0:
                this.d.dispose();
                break;
            default:
                this.d.dispose();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262985a) {
        }
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262985a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f262986b.onSuccess(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f262986b.onSuccess(Boolean.FALSE);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262985a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f262986b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f262986b.onError(th10);
                } else {
                    jb3.l.v(th10);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262985a) {
            case 0:
                if (!this.e) {
                    try {
                        if (!this.f262987c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            this.f262986b.onSuccess(Boolean.FALSE);
                        }
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        this.d.dispose();
                        onError(th10);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!this.e) {
                    try {
                        if (this.f262987c.test(obj2)) {
                            this.e = true;
                            this.d.dispose();
                            this.f262986b.onSuccess(Boolean.TRUE);
                        }
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        this.d.dispose();
                        onError(th11);
                    }
                    break;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262985a) {
            case 0:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262986b.onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    this.f262986b.onSubscribe(this);
                }
                break;
        }
    }
}
