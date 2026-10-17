package v6f;

import i6f.t0;
import kotlin.jvm.internal.Intrinsics;
import v0f.p;
import v2e.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends t0 {
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f286373g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d model, h view) {
        super(view, model, "ManagedPortfolioDetailsInvestmentsExtensionContract");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f = model;
        this.f286373g = view;
    }

    @Override // i6f.t0, yji.d
    public final void M() {
        super.M();
        yji.d.H(this, new p(new h0(rd0.e.b(this.f286373g.j().d), 4), 3), new v44.e(this, null, 7), 3);
    }
}
