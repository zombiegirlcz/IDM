package rfm;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends efm.k implements nfm.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f253943a = new h();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return null;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        lVar.onSubscribe(lfm.e.INSTANCE);
        lVar.onComplete();
    }
}
