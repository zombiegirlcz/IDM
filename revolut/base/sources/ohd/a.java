package ohd;

import dte.b;
import dte.c;
import kotlin.jvm.internal.Intrinsics;
import nt4.f;
import rd0.e;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f225348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f225349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w2d.a f225350n;

    public a(c appTipsView, b appTipsModelExtension, w2d.a watchlistAppTipsProvider) {
        Intrinsics.checkNotNullParameter(appTipsView, "appTipsView");
        Intrinsics.checkNotNullParameter(appTipsModelExtension, "appTipsModelExtension");
        Intrinsics.checkNotNullParameter(watchlistAppTipsProvider, "watchlistAppTipsProvider");
        this.f225348l = appTipsView;
        this.f225349m = appTipsModelExtension;
        this.f225350n = watchlistAppTipsProvider;
    }

    @Override // yji.n
    public final void D2() {
        T2(new f(this, null, 21), new yi5.b(27));
    }

    @Override // yji.n
    public final void H2() {
        c cVar = this.f225348l;
        n.l2(this, e.b(cVar.v1()), null, new nt.e(2, this.f225349m, b.class, "onTipClicked", "onTipClicked(Lcom/revolut/core/ui_kit/models/AppTipUIModel;)Z", 12, 15), 3);
        n.l2(this, e.b(cVar.S0()), null, new nt.e(2, this.f225349m, b.class, "onCloseTipClicked", "onCloseTipClicked(Lcom/revolut/core/ui_kit/models/AppTipUIModel;)Z", 12, 16), 3);
        n.l2(this, e.b(cVar.A0()), null, new nt.e(2, this.f225349m, b.class, "onTipDetailsLinkClicked", "onTipDetailsLinkClicked(Lcom/revolut/core/ui_kit/models/AppTipUIModel;)Z", 12, 17), 3);
    }
}
