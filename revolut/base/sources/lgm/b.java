package lgm;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f195138a;

    @Override // lgm.a, dom.b
    public final void cancel() {
        this.f195138a = true;
    }

    @Override // lgm.a, io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f195138a = true;
    }

    @Override // lgm.a, io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f195138a;
    }
}
