package pgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class m0 implements fgm.l, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f236108b;

    public m0(dom.a aVar) {
        this.f236107a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // dom.b
    public final void cancel() {
        this.f236108b.dispose();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f236107a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f236107a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f236107a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        this.f236108b = disposable;
        this.f236107a.e(this);
    }
}
