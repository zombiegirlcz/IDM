package sgm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class v0 extends AtomicReference implements fgm.l, fgm.b, Disposable, fgm.e, fgm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f263212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f263213c;
    public Object d;

    public /* synthetic */ v0(fgm.l lVar, Object obj2, int i) {
        this.f263211a = i;
        this.f263212b = lVar;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263211a) {
            case 0:
                jgm.b.a(this);
                break;
            case 1:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263211a) {
        }
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f263211a) {
            case 0:
                if (!this.f263213c) {
                    this.f263213c = true;
                    jgm.b.c(this, null);
                    CompletableSource completableSource = (CompletableSource) this.d;
                    this.d = null;
                    completableSource.c(this);
                } else {
                    this.f263212b.onComplete();
                }
                break;
            case 1:
                if (!this.f263213c) {
                    this.f263213c = true;
                    jgm.b.c(this, null);
                    MaybeSource maybeSource = (MaybeSource) this.d;
                    this.d = null;
                    maybeSource.c(this);
                } else {
                    this.f263212b.onComplete();
                }
                break;
            default:
                this.f263213c = true;
                jgm.b.c(this, null);
                SingleSource singleSource = (SingleSource) this.d;
                this.d = null;
                singleSource.c(this);
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f263211a) {
            case 0:
                this.f263212b.onError(th10);
                break;
            case 1:
                this.f263212b.onError(th10);
                break;
            default:
                this.f263212b.onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f263211a) {
            case 0:
                this.f263212b.onNext(obj2);
                break;
            case 1:
                this.f263212b.onNext(obj2);
                break;
            default:
                this.f263212b.onNext(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f263211a) {
            case 0:
                if (jgm.b.e(this, disposable) && !this.f263213c) {
                    this.f263212b.onSubscribe(this);
                    break;
                }
                break;
            case 1:
                if (jgm.b.e(this, disposable) && !this.f263213c) {
                    this.f263212b.onSubscribe(this);
                    break;
                }
                break;
            default:
                if (jgm.b.e(this, disposable) && !this.f263213c) {
                    this.f263212b.onSubscribe(this);
                    break;
                }
                break;
        }
    }

    @Override // fgm.e, fgm.p
    public void onSuccess(Object obj2) {
        switch (this.f263211a) {
            case 1:
                fgm.l lVar = this.f263212b;
                lVar.onNext(obj2);
                lVar.onComplete();
                break;
            default:
                fgm.l lVar2 = this.f263212b;
                lVar2.onNext(obj2);
                lVar2.onComplete();
                break;
        }
    }
}
