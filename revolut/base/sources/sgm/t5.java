package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class t5 extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f263185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f263186c;

    public t5(fgm.l lVar, int i) {
        this.f263184a = i;
        switch (i) {
            case 1:
                this.f263186c = new AtomicReference();
                this.f263185b = lVar;
                break;
            default:
                this.f263185b = lVar;
                this.f263186c = new AtomicReference();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263184a) {
            case 0:
                jgm.b.a(this.f263186c);
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this.f263186c);
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263184a) {
            case 0:
                return jgm.b.b((Disposable) get());
            default:
                return this.f263186c.get() == jgm.b.DISPOSED;
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f263184a) {
            case 0:
                this.f263185b.onComplete();
                break;
            default:
                dispose();
                this.f263185b.onComplete();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f263184a) {
            case 0:
                this.f263185b.onError(th10);
                break;
            default:
                dispose();
                this.f263185b.onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f263184a) {
            case 0:
                this.f263185b.onNext(obj2);
                break;
            default:
                this.f263185b.onNext(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f263184a) {
            case 0:
                jgm.b.e(this.f263186c, disposable);
                break;
            default:
                if (jgm.b.e(this.f263186c, disposable)) {
                    this.f263185b.onSubscribe(this);
                }
                break;
        }
    }
}
