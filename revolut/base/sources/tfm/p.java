package tfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f270708h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Callable f270709j;

    public p(efm.r rVar, int i, int i2, Callable callable) {
        super(rVar);
        this.f270708h = i;
        this.i = i2;
        this.f270709j = callable;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        efm.w wVar = this.f270328g;
        Callable callable = this.f270709j;
        int i = this.i;
        int i2 = this.f270708h;
        if (i != i2) {
            wVar.subscribe(new o(yVar, i2, i, callable));
            return;
        }
        n nVar = new n(yVar, i2, callable);
        if (nVar.a()) {
            wVar.subscribe(nVar);
        }
    }
}
