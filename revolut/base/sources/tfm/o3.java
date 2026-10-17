package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class o3 extends efm.r implements nfm.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f270699g;

    public o3(Object obj2) {
        this.f270699g = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f270699g;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        q5 q5Var = new q5(yVar, this.f270699g);
        yVar.onSubscribe(q5Var);
        q5Var.run();
    }
}
