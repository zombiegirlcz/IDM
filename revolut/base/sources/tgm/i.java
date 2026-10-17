package tgm;

import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends xgm.b implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f271221c;

    @Override // dom.b
    public final void cancel() {
        set(4);
        this.f305774b = null;
        this.f271221c.dispose();
    }

    @Override // fgm.p
    public final void onError(Throwable th10) {
        this.f305773a.onError(th10);
    }

    @Override // fgm.p
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f271221c, disposable)) {
            this.f271221c = disposable;
            this.f305773a.e(this);
        }
    }
}
