package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends efm.i implements nfm.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245409b;

    public f1(Object obj2) {
        this.f245409b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f245409b;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        aVar.e(new yfm.e(aVar, this.f245409b));
    }
}
