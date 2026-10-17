package j6f;

import i6f.t0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends t0 {
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f171749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d view, b model) {
        super(view, model, "ManagedPortfolioDetailsAllocationContract");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f = view;
        this.f171749g = model;
    }

    @Override // i6f.t0, yji.d
    public final void M() {
        super.M();
        d dVar = this.f;
        Continuation continuation = null;
        yji.d.H(this, new iqh.d(rd0.e.b(dVar.c().f53218h), 17), new k(this, continuation, 0), 3);
        yji.d.H(this, new iqh.d(rd0.e.b(dVar.c().f53218h), 15), new l(this, null), 3);
        yji.d.H(this, new iqh.d(rd0.e.b(dVar.p().f52339c.f121375b), 16), new k(this, continuation, 1), 3);
        yji.d.H(this, new iqh.d(rd0.e.b(dVar.A().d), 18), new k(this, continuation, 2), 3);
        yji.d.H(this, new iqh.d(rd0.e.b(dVar.A().d), 19), new j(this, null), 3);
    }
}
