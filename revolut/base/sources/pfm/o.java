package pfm;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements efm.j, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f235748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f235749c;

    public /* synthetic */ o(Object obj2, int i) {
        this.f235747a = i;
        this.f235749c = obj2;
    }

    private final void a(Object obj2) {
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f235747a) {
            case 0:
                this.f235748b.cancel();
                this.f235748b = yfm.g.CANCELLED;
                break;
            default:
                this.f235748b.cancel();
                this.f235748b = yfm.g.CANCELLED;
                break;
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        switch (this.f235747a) {
            case 0:
                if (yfm.g.h(this.f235748b, bVar)) {
                    this.f235748b = bVar;
                    ((efm.d) this.f235749c).onSubscribe(this);
                    bVar.a(Long.MAX_VALUE);
                }
                break;
            default:
                if (yfm.g.h(this.f235748b, bVar)) {
                    this.f235748b = bVar;
                    ((efm.y) this.f235749c).onSubscribe(this);
                    bVar.a(Long.MAX_VALUE);
                }
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f235747a) {
            case 0:
                if (this.f235748b == yfm.g.CANCELLED) {
                }
                break;
            default:
                if (this.f235748b == yfm.g.CANCELLED) {
                }
                break;
        }
        return false;
    }

    @Override // dom.a
    public final void onComplete() {
        switch (this.f235747a) {
            case 0:
                ((efm.d) this.f235749c).onComplete();
                break;
            default:
                ((efm.y) this.f235749c).onComplete();
                break;
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        switch (this.f235747a) {
            case 0:
                ((efm.d) this.f235749c).onError(th10);
                break;
            default:
                ((efm.y) this.f235749c).onError(th10);
                break;
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        switch (this.f235747a) {
            case 0:
                break;
            default:
                ((efm.y) this.f235749c).onNext(obj2);
                break;
        }
    }
}
