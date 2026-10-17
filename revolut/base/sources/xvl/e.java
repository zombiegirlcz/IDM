package xvl;

import com.revolut.feature.tab.invest.impl.ui.home.TabInvestController;
import kotlin.jvm.internal.Intrinsics;
import v0f.p;
import xo8.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends sdf.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sdf.c f309294c;
    public final sdf.b d;

    public e(sdf.c screen, sdf.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f309294c = screen;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        TabInvestController tabInvestController = (TabInvestController) this.f309294c;
        yji.d.H(this, new p(new a0(rd0.e.b(tabInvestController.f3().f), 15), 24), new xni.h(this, null, 15), 3);
        yji.d.H(this, new a0(rd0.e.b(tabInvestController.f3().f55143h), 14), new d(this, null), 3);
    }
}
