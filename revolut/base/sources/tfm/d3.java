package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class d3 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f270407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f270408c;

    public /* synthetic */ d3(Object obj2, int i) {
        this.f270406a = i;
        this.f270408c = obj2;
    }

    private final void a(Object obj2) {
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270406a) {
            case 0:
                this.f270407b.dispose();
                break;
            default:
                this.f270407b.dispose();
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270406a) {
        }
        return this.f270407b.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270406a) {
            case 0:
                ((efm.y) this.f270408c).onComplete();
                break;
            default:
                ((efm.d) this.f270408c).onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270406a) {
            case 0:
                ((efm.y) this.f270408c).onError(th10);
                break;
            default:
                ((efm.d) this.f270408c).onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270406a) {
            case 0:
                ((efm.y) this.f270408c).onNext(obj2);
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270406a) {
            case 0:
                if (lfm.d.f(this.f270407b, cVar)) {
                    this.f270407b = cVar;
                    ((efm.y) this.f270408c).onSubscribe(this);
                }
                break;
            default:
                this.f270407b = cVar;
                ((efm.d) this.f270408c).onSubscribe(this);
                break;
        }
    }
}
