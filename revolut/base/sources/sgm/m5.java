package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes14.dex */
public final class m5 extends ArrayDeque implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f263002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f263003c;

    public m5(fgm.l lVar, int i) {
        super(i);
        this.f263001a = lVar;
        this.f263002b = i;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f263003c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263003c.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263001a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263001a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263002b == size()) {
            this.f263001a.onNext(poll());
        }
        offer(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263003c, disposable)) {
            this.f263003c = disposable;
            this.f263001a.onSubscribe(this);
        }
    }
}
