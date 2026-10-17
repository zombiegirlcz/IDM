package t6f;

import i6f.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends t0 {
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f268331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l view, g model) {
        super(view, model, "ManagedPortfolioDetailsAboutInfoExtensionContract");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f = view;
        this.f268331g = model;
    }

    @Override // i6f.t0, yji.d
    public final void M() {
        super.M();
        l lVar = this.f;
        yji.d.H(this, new t05.c(rd0.e.b(lVar.D().f51821c), 11), new d(this, null), 3);
        yji.d.H(this, new t05.c(rd0.e.b(lVar.M().e.f121375b), 12), new e(this, null, 0), 3);
        yji.d.H(this, new t05.c(rd0.e.b(lVar.q().f53336c.f121375b), 13), new e(this, null, 1), 3);
    }
}
