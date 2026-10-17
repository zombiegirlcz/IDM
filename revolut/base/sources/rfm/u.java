package rfm;

/* JADX INFO: loaded from: classes13.dex */
public final class u extends efm.k implements nfm.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f253978a;

    public u(Object obj2) {
        this.f253978a = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f253978a;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        lVar.onSubscribe(lfm.e.INSTANCE);
        lVar.onSuccess(this.f253978a);
    }
}
