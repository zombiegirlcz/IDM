package lgm;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a implements bhm.d, bhm.b {
    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // bhm.c
    public final int b(int i) {
        return 2;
    }

    @Override // dom.b
    public void cancel() {
    }

    @Override // bhm.g
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return false;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bhm.g
    public final Object poll() {
        return null;
    }
}
