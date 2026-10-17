package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class z0 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f263315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f263316c;
    public Disposable d;

    public /* synthetic */ z0(Object obj2, int i) {
        this.f263314a = i;
        this.f263315b = obj2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263314a) {
            case 0:
                this.d.dispose();
                break;
            case 1:
                this.d.dispose();
                break;
            default:
                this.d.dispose();
                this.d = jgm.b.DISPOSED;
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263314a) {
        }
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f263314a) {
            case 0:
                fgm.l lVar = (fgm.l) this.f263315b;
                lVar.onNext(Long.valueOf(this.f263316c));
                lVar.onComplete();
                break;
            case 1:
                ((fgm.l) this.f263315b).onComplete();
                break;
            default:
                this.d = jgm.b.DISPOSED;
                ((fgm.p) this.f263315b).onSuccess(Long.valueOf(this.f263316c));
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f263314a) {
            case 0:
                ((fgm.l) this.f263315b).onError(th10);
                break;
            case 1:
                ((fgm.l) this.f263315b).onError(th10);
                break;
            default:
                this.d = jgm.b.DISPOSED;
                ((fgm.p) this.f263315b).onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f263314a) {
            case 0:
                this.f263316c++;
                break;
            case 1:
                long j2 = this.f263316c;
                if (j2 == 0) {
                    ((fgm.l) this.f263315b).onNext(obj2);
                } else {
                    this.f263316c = j2 - 1;
                }
                break;
            default:
                this.f263316c++;
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f263314a) {
            case 0:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.l) this.f263315b).onSubscribe(this);
                }
                break;
            case 1:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.l) this.f263315b).onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.p) this.f263315b).onSubscribe(this);
                }
                break;
        }
    }

    public z0(fgm.l lVar, long j2) {
        this.f263314a = 1;
        this.f263315b = lVar;
        this.f263316c = j2;
    }
}
