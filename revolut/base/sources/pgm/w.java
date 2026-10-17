package pgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class w implements fgm.d, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.e f236165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f236166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f236167c;
    public boolean d;

    public w(fgm.e eVar) {
        this.f236165a = eVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f236166b.cancel();
        this.f236166b = xgm.f.CANCELLED;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f236166b, bVar)) {
            this.f236166b = bVar;
            this.f236165a.onSubscribe(this);
            bVar.a(1L);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f236166b == xgm.f.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        this.f236166b = xgm.f.CANCELLED;
        if (this.d) {
            return;
        }
        this.d = true;
        this.f236165a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.d) {
            jb3.l.v(th10);
            return;
        }
        this.d = true;
        this.f236166b = xgm.f.CANCELLED;
        this.f236165a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        long j2 = this.f236167c;
        if (j2 != 0) {
            this.f236167c = j2 + 1;
            return;
        }
        this.d = true;
        this.f236166b.cancel();
        this.f236166b = xgm.f.CANCELLED;
        this.f236165a.onSuccess(obj2);
    }
}
