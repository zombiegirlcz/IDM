package tfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends efm.d0 implements nfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f270499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.b f270500c;

    public h0(efm.r rVar, Callable callable, kfm.b bVar) {
        this.f270498a = rVar;
        this.f270499b = callable;
        this.f270500c = bVar;
    }

    @Override // nfm.d
    public final efm.r a() {
        return new w(this.f270498a, this.f270499b, (Object) this.f270500c, 2);
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        try {
            Object objCall = this.f270499b.call();
            mfm.f.b(objCall, "The initialSupplier returned a null value");
            this.f270498a.subscribe(new g0(f0Var, objCall, this.f270500c, 1));
        } catch (Throwable th10) {
            lfm.e.e(th10, f0Var);
        }
    }
}
