package ogm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements fgm.d, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f225219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f225220c;

    public /* synthetic */ h(Object obj2, int i) {
        this.f225218a = i;
        this.f225220c = obj2;
    }

    private final void a(Object obj2) {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f225218a) {
            case 0:
                this.f225219b.cancel();
                this.f225219b = xgm.f.CANCELLED;
                break;
            default:
                this.f225219b.cancel();
                this.f225219b = xgm.f.CANCELLED;
                break;
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        switch (this.f225218a) {
            case 0:
                if (xgm.f.h(this.f225219b, bVar)) {
                    this.f225219b = bVar;
                    ((fgm.b) this.f225220c).onSubscribe(this);
                    bVar.a(Long.MAX_VALUE);
                }
                break;
            default:
                if (xgm.f.h(this.f225219b, bVar)) {
                    this.f225219b = bVar;
                    ((fgm.l) this.f225220c).onSubscribe(this);
                    bVar.a(Long.MAX_VALUE);
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f225218a) {
            case 0:
                if (this.f225219b == xgm.f.CANCELLED) {
                }
                break;
            default:
                if (this.f225219b == xgm.f.CANCELLED) {
                }
                break;
        }
        return false;
    }

    @Override // dom.a
    public final void onComplete() {
        switch (this.f225218a) {
            case 0:
                ((fgm.b) this.f225220c).onComplete();
                break;
            default:
                ((fgm.l) this.f225220c).onComplete();
                break;
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        switch (this.f225218a) {
            case 0:
                ((fgm.b) this.f225220c).onError(th10);
                break;
            default:
                ((fgm.l) this.f225220c).onError(th10);
                break;
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        switch (this.f225218a) {
            case 0:
                break;
            default:
                ((fgm.l) this.f225220c).onNext(obj2);
                break;
        }
    }
}
