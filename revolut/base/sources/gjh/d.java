package gjh;

import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import efm.r;
import g9j.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fih.b f144294c;
    public final e d;

    public d(fih.b view, e screenModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(screenModelExtension, "screenModelExtension");
        this.f144294c = view;
        this.d = screenModelExtension;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        TabInvestController tabInvestController = (TabInvestController) this.f144294c;
        Continuation continuation = null;
        yji.d.H(this, new q(rd0.e.b(tabInvestController.Q.f53218h), 9), new gii.b(this, continuation, 1), 3);
        yji.d.H(this, new q(rd0.e.b(tabInvestController.Q.f53227t), 8), new c(this, null), 3);
        r rVarFilter = ((l0) tabInvestController.f89831d0.getValue()).f256113c.filter(new gjg.e(new ghk.r(25), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        yji.d.H(this, rd0.e.b(rVarFilter), new g85.f(this, continuation, 15), 3);
    }
}
