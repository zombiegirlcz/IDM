package ngm;

/* JADX INFO: loaded from: classes14.dex */
public class h extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f215244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f215245b;

    public h(fgm.l lVar) {
        this.f215244a = lVar;
    }

    public final void a(Object obj2) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        fgm.l lVar = this.f215244a;
        if (i == 8) {
            this.f215245b = obj2;
            lazySet(16);
            lVar.onNext(null);
        } else {
            lazySet(2);
            lVar.onNext(obj2);
        }
        if (get() != 4) {
            lVar.onComplete();
        }
    }

    @Override // bhm.c
    public final int b(int i) {
        lazySet(8);
        return 2;
    }

    @Override // bhm.g
    public final void clear() {
        lazySet(32);
        this.f215245b = null;
    }

    public void dispose() {
        set(4);
        this.f215245b = null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj2) {
        a(obj2);
    }

    @Override // bhm.g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj2 = this.f215245b;
        this.f215245b = null;
        lazySet(32);
        return obj2;
    }
}
