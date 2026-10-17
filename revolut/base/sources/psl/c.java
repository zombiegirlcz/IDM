package psl;

import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.trading.orders.ui.details.BaseInvestOrderDetailsScreen;
import jsl.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f239516c;
    public final p d;

    public c(b0 screen, p controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f239516c = screen;
        this.d = controllerModelExtension;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        BaseInvestOrderDetailsScreen baseInvestOrderDetailsScreen = (BaseInvestOrderDetailsScreen) this.f239516c;
        yji.d.H(this, new an9.g(vkm.q.J(rd0.e.b(baseInvestOrderDetailsScreen.getR().e), rd0.e.b(baseInvestOrderDetailsScreen.getR().d)), 21), new b(this, null), 3);
        yji.d.H(this, vkm.q.J(rd0.e.b(baseInvestOrderDetailsScreen.p1().d), rd0.e.b(((CellDetailsActionableIconDelegate) baseInvestOrderDetailsScreen.V.getValue()).f51807c), rd0.e.b(((CellDetailsNoteDelegate) baseInvestOrderDetailsScreen.X.getValue()).d)), new pqc.k(this, null, 9), 3);
    }
}
